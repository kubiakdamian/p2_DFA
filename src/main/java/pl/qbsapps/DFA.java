package pl.qbsapps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DFA {
    private int row = 0;
    private int column = 0;
    String file = "src/test/resources/test_read.txt";

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

                if (performAppropriateOperation(word)) {
                    return;
                }
            }
        }
    }

    private boolean performAppropriateOperation(String word) {
        char[] signs = word.toCharArray();
        for(char c : signs){
            switch (c) {
                case 0:
                    column = 0;
                    break;

                case 1:
                    column = 1;
                    break;

                case 2:
                    column = 2;
                    break;

                case 3:
                    column = 3;
                    break;

                case 4:
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

            ArrayList currentState = TransitionTable.table[row][column];
            row = currentState.getValue();
            System.out.println(currentState.getText());
        }

        return currentState.isEnding();
    }
}
