package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Loan {

    private Student student;
    private Copy copy;
    private LocalDate expectedReturnDate;
    private List<Renewal> renewals;

    public Loan(Student student,
                Copy copy,
                LocalDate expectedReturnDate) {

        this.student = student;
        this.copy = copy;
        this.expectedReturnDate = expectedReturnDate;
        this.renewals = new ArrayList<>();
    }

    public void renew(LocalDate newDate) {

        if (!newDate.isAfter(expectedReturnDate)) {
            throw new IllegalArgumentException(
                "The new return date must be after the current return date."
            );
        }

        Renewal renewal = new Renewal(
            LocalDate.now(),
            expectedReturnDate,
            newDate
        );

        renewals.add(renewal);
        expectedReturnDate = newDate;
    }
}