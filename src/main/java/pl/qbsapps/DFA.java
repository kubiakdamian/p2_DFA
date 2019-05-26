package pl.qbsapps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DFA {
    private int firstStateRow = 0;
    private int secondStateRow = -1;
    private int column = 0;
    private State previousState = null;
    String file = "C:\\Users\\Damian\\Desktop\\p2_DFA\\src\\main\\resources\\test.txt";

    public void run() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(file));
            scanner.useDelimiter("#");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner != null) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.trim();
                secondStateRow = -1;
                previousState = null;
                System.out.println(word + ":");
                if (performAppropriateOperation(word)) {
                    System.out.println("AKCEPTUJĄCY" + '\n');
                } else {
                    System.out.println("NIEAKCEPTUJĄCY" + '\n');
                }
            }
        }
    }

    private boolean performAppropriateOperation(String word) {
        boolean isAccepting = false;
        char[] signs = word.toCharArray();
        for (char c : signs) {
            switch (c) {
                case '0':
                    column = 0;
                    break;

                case '1':
                    column = 1;
                    break;

                case '2':
                    column = 2;
                    break;

                case '3':
                    column = 3;
                    break;

                case '4':
                    column = 4;
                    break;

                case 'a':
                    column = 5;
                    break;

                case 'b':
                    column = 6;
                    break;

                case 'c':
                    column = 7;
                    break;

                case 'd':
                    column = 8;
                    break;

                case 'f':
                    column = 9;
                    break;
            }

            List states = TransitionTable.table[firstStateRow][column];

            State currentFirstState = (State) states.get(0);
            System.out.println("FIRST --- " + currentFirstState.getText());
            firstStateRow = currentFirstState.getValue();

            State currentSecondState = null;
            if (previousState == null) {
                previousState = (State) states.get(1);
                secondStateRow = previousState.getValue();
                System.out.println("SECOND --- " + previousState.getText());
            } else {
                currentSecondState = (State) states.get(1);
                System.out.println("SECOND --- " + currentSecondState.getText());
            }

            if (currentSecondState != null) {
                if (secondStateRow == -1 && previousState.getValue() != currentSecondState.getValue()) {
                    secondStateRow = currentSecondState.getValue();
                    previousState = currentSecondState;
                } else {
                    if (secondStateRow == -1) {
                        states = TransitionTable.table[previousState.getValue()][column];
                    } else {
                        states = TransitionTable.table[secondStateRow][column];
                    }
                    if (states == null) {
                        secondStateRow = -1;
                        previousState = currentSecondState;
                    } else {
                        currentSecondState = (State) states.get(0);
                        System.out.println("THIRD --- " + currentSecondState.getText());
                        secondStateRow = currentSecondState.getValue();
                        isAccepting = true;
                    }
                }
            }
        }

        return isAccepting;
    }
}
