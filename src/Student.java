package src;

public class Student extends User implements Notifiable {

    private String studentCode;
    private String academicProgram;

    public Student(String identification, String name, String email,
                   String studentCode, String academicProgram) {

        super(identification, name, email);

        this.studentCode = studentCode;
        this.academicProgram = academicProgram;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notification to " + getName() + ": " + message);
    }
}