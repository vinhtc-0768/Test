
import StudentManagement.Student;
import StudentManagement.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();
        Student a = new Student("Nguyen Van A", "20020001", "17020002@vnu.edu.vn");
        Student b = new Student("Trinh Van B", "20020002", "17020002@vnu.edu.vn");
        Student c = new Student("Tran Van C", "20020003", "17020002@vnu.edu.vn");
        Student d = new Student("Tran Van D", "20020003", "17020002@vnu.edu.vn");
        manager.addStudent(a);
        manager.addStudent(b);
        manager.addStudent(c);
        manager.addStudent(d);
        System.out.println(manager.studentsByGroup());
    }
}