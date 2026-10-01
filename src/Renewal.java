package src;

import java.time.LocalDate;

public class Renewal {

    private LocalDate renewalDate;
    private LocalDate previousDate;
    private LocalDate newDate;

    public Renewal(LocalDate renewalDate,
                LocalDate previousDate,
                LocalDate newDate) {

        this.renewalDate = renewalDate;
        this.previousDate = previousDate;
        this.newDate = newDate;
    }
}