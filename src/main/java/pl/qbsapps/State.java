package pl.qbsapps;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum State {
    QP("qp", false, 0),
    Q0("q0", false, 1),
    Q1("q1", false, 2),
    Q2("q2", false, 3),
    Q3("q3", false, 4),
    Q4("q4", false, 5),
    QA("qa", false, 6),
    QB("qb", false, 7),
    QC("qc", false, 8),
    QD("qd", false, 9),
    QF("qf", false, 10),
    QPC("qpc - Powtórzenie wsród cyfr", true, 11),
    QPL("qpl - Powtórzenie wśród liter", true, 12);

    private String text;
    private boolean ending;
    private int value;
}
