package src;

public class Librarian extends User {

    private String employeeCode;
    private String shift;

    public Librarian(String identification, String name, String email,
        String employeeCode, String shift) {

        super(identification, name, email);

        this.employeeCode = employeeCode;
        this.shift = shift;
    }
}