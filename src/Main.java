package src;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(
            "1001",
            "Jhon Doe",
            "jhon@email.com",
            "ST001",
            "Software Engineering"
        );

        Copy copy = new Copy(
            "CP001",
            "Available"
        );

        Loan loan = new Loan(
            student,
            copy,
            LocalDate.of(2026, 10, 10)
        );

        try {
            loan.renew(
                LocalDate.of(2026, 10, 15)
            );
            System.out.println("Valid renewal completed.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        try {
            loan.renew(
                LocalDate.of(2026, 10, 15)
            );

            System.out.println("Invalid renewal completed.");

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Invalid renewal: " + e.getMessage()
            );
        }

        student.notify(
            "Your loan has been renewed."
        );
    }
}