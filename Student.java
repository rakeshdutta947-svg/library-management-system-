public class Student extends User {
    private int studentId;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    public int getStudentId() { return studentId; }
}
