package pl.qbsapps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TransitionTable {
    public static ArrayList[][] table = {
            {(ArrayList)Arrays.asList(State.QP, State.Q0), (ArrayList)Arrays.asList(State.QP, State.Q0),
                    (ArrayList)Arrays.asList(State.QP, State.Q0), (ArrayList)Arrays.asList(State.QP, State.Q0),
                    (ArrayList)Arrays.asList(State.QP, State.Q0), (ArrayList)Arrays.asList(State.QP, State.Q0),
                    (ArrayList)Arrays.asList(State.QP, State.Q0), (ArrayList)Arrays.asList(State.QP, State.Q0),
                    (ArrayList)Arrays.asList(State.QP, State.Q0) ,(ArrayList)Arrays.asList(State.QP, State.Q0)},
            {(ArrayList) Collections.singletonList(State.QPC), null, null, null, null, null, null, null, null, null},
            {null, (ArrayList) Collections.singletonList(State.QPC), null, null, null, null, null, null, null, null},
            {null, null, (ArrayList) Collections.singletonList(State.QPC), null, null, null, null, null, null, null},
            {null, null, null, (ArrayList) Collections.singletonList(State.QPC), null, null, null, null, null, null},
            {null, null, null, null, (ArrayList) Collections.singletonList(State.QPC), null, null, null, null, null},
            {null, null, null, null, null, (ArrayList) Collections.singletonList(State.QPC), null, null, null, null},
            {null, null, null, null, null, null, (ArrayList) Collections.singletonList(State.QPC), null, null, null},
            {null, null, null, null, null, null, null, (ArrayList) Collections.singletonList(State.QPC), null, null},
            {null, null, null, null, null, null, null, null, (ArrayList) Collections.singletonList(State.QPC), null},
            {null, null, null, null, null, null, null, null, null, (ArrayList) Collections.singletonList(State.QPC)},
            {(ArrayList) Collections.singletonList(State.QPC), (ArrayList) Collections.singletonList(State.QPC),
                    (ArrayList) Collections.singletonList(State.QPC), (ArrayList) Collections.singletonList(State.QPC),
                    (ArrayList) Collections.singletonList(State.QPC), (ArrayList) Collections.singletonList(State.QPC),
                    (ArrayList) Collections.singletonList(State.QPC), (ArrayList) Collections.singletonList(State.QPC),
                    (ArrayList) Collections.singletonList(State.QPC), (ArrayList) Collections.singletonList(State.QPC)},
            {(ArrayList) Collections.singletonList(State.QPL), (ArrayList) Collections.singletonList(State.QPL),
                    (ArrayList) Collections.singletonList(State.QPL), (ArrayList) Collections.singletonList(State.QPL),
                    (ArrayList) Collections.singletonList(State.QPL), (ArrayList) Collections.singletonList(State.QPL),
                    (ArrayList) Collections.singletonList(State.QPL), (ArrayList) Collections.singletonList(State.QPL),
                    (ArrayList) Collections.singletonList(State.QPL), (ArrayList) Collections.singletonList(State.QPL)}
    };
}
