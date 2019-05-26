package pl.qbsapps;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum State {
    QP("qp", false, -1),
    Q0("q0", false, 0),
    Q1("q1", false, 1),
    Q2("q2", false, 2),
    Q3("q3", false, 3),
    Q4("q4", false, 4),
    QA("qa", false, 5),
    QB("qb", false, 6),
    QC("qc", false, 7),
    QD("qd", false, 8),
    QF("qf", false, 9),
    QPC("Powtórzenie wsród cyfr", true, 10),
    QPL("Powtórzenie wśród liczb", true, 11);

    private String text;
    private boolean ending;
    private int value;
}
