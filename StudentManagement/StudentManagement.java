package StudentManagement;

public class StudentManagement {
    private Student[] students;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    public void addStudent(Student newStudent) {
        int length;
        if (this.students == null) {
            length = 0;
        } else {
            length = this.students.length;
        }
        Student[] newStudents = new Student[length + 1];
        for (int index = 0; index < length; index++) {
            newStudents[index] = this.students[index];
        }
        newStudents[length] = newStudent;
        this.students = newStudents;
    }

    public void removeStudent(String id) {
        int length, removeIndex = -1;
        if (this.students == null) {
            length = 0;
            return;
        } else {
            length = this.students.length;
        }
        for (int index = 0; index < length; index++) {
            if (this.students[index].getId() == id) {
                removeIndex = index;
                System.out.println(removeIndex);
                break;
            }
        }
        if (removeIndex == -1) {
            return;
        }
        Student[] newStudents = new Student[length - 1];
        for (int index = 0; index < removeIndex; index++) {
            newStudents[index] = this.students[index];
        }
        for (int index = removeIndex; index < length - 1; index++) {
            newStudents[index] = this.students[index + 1];
        }
        this.students = newStudents;
    }

    public String studentsByGroup() {
        String result = "";
        int length;
        if (this.students == null) {
            length = 0;
            return result;
        } else {
            length = this.students.length;
        }
        String[] listGroup = new String[100];
        int listGroupLength = 0;
        listGroup[listGroupLength++] = this.students[0].getGroup();
        for (int index = 0; index < length; index++) {
            String studentGroup = this.students[index].getGroup();
            Boolean isNew = true;
            for (int innerIndex = 0; innerIndex < listGroupLength; innerIndex++) {
                if (studentGroup == listGroup[innerIndex]) {
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                listGroup[listGroupLength++] = studentGroup;
            }
        }
        for (int index = 0; index < listGroupLength; index++) {
            result = result + listGroup[index] + "\n";
            for (int innerIndex = 0; innerIndex < length; innerIndex++) {
                Student student = this.students[innerIndex];
                if (student.getGroup() == listGroup[index]) {
                    result = result + student.getInfo() + "\n";
                }
            }
        }
        return result;
    }
}
