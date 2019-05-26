package pl.qbsapps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransitionTable {
    public static List[][] table = {
            {Arrays.asList(State.QP, State.Q0), Arrays.asList(State.QP, State.Q1),
                    Arrays.asList(State.QP, State.Q2), Arrays.asList(State.QP, State.Q3),
                    Arrays.asList(State.QP, State.Q4), Arrays.asList(State.QP, State.QA),
                    Arrays.asList(State.QP, State.QB), Arrays.asList(State.QP, State.QC),
                    Arrays.asList(State.QP, State.QD), Arrays.asList(State.QP, State.QF)},
            {Collections.singletonList(State.QPC), null, null, null, null, null, null, null, null, null},
            {null, Collections.singletonList(State.QPC), null, null, null, null, null, null, null, null},
            {null, null, Collections.singletonList(State.QPC), null, null, null, null, null, null, null},
            {null, null, null, Collections.singletonList(State.QPC), null, null, null, null, null, null},
            {null, null, null, null, Collections.singletonList(State.QPC), null, null, null, null, null},
            {null, null, null, null, null, Collections.singletonList(State.QPL), null, null, null, null},
            {null, null, null, null, null, null, Collections.singletonList(State.QPL), null, null, null},
            {null, null, null, null, null, null, null, Collections.singletonList(State.QPL), null, null},
            {null, null, null, null, null, null, null, null, Collections.singletonList(State.QPL), null},
            {null, null, null, null, null, null, null, null, null, Collections.singletonList(State.QPL)},
            {Collections.singletonList(State.QPC), Collections.singletonList(State.QPC),
                    Collections.singletonList(State.QPC), Collections.singletonList(State.QPC),
                    Collections.singletonList(State.QPC), Collections.singletonList(State.QPC),
                    Collections.singletonList(State.QPC), Collections.singletonList(State.QPC),
                    Collections.singletonList(State.QPC), Collections.singletonList(State.QPC)},
            {Collections.singletonList(State.QPL), Collections.singletonList(State.QPL),
                    Collections.singletonList(State.QPL), Collections.singletonList(State.QPL),
                    Collections.singletonList(State.QPL), Collections.singletonList(State.QPL),
                    Collections.singletonList(State.QPL), Collections.singletonList(State.QPL),
                    Collections.singletonList(State.QPL), Collections.singletonList(State.QPL)}
    };
}
