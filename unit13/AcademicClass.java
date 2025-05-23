import java.util.*;

public class AcademicClass {
    private Teacher teacher;
    private ArrayList<Student> students;

    public AcademicClass(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printClassInfo() {
        System.out.println("Teacher: " + teacher.getName() + " Subject: " + teacher.getSubject());
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public ArrayList<String> getStudentsWithFavoriteNumber(int n) {
        ArrayList<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            if (student.getFavoriteNumber() == n) {
                studentNames.add(student.getName());
            }
        }
        return studentNames;
    }

    public ArrayList<String> getStudentsWithOddFavoriteNumber() {
        ArrayList<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            if (student.getFavoriteNumber() % 2 != 0) {
                studentNames.add(student.getName());
            }
        }
        return studentNames;
    }
    
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms. Smith", "Math");
        AcademicClass mathClass = new AcademicClass(teacher);

        Student student1 = new Student("John", 7);
        Student student2 = new Student("Jane", 4);
        Student student3 = new Student("Bob", 7);
        Student student4 = new Student("Alice", 3);

        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        mathClass.printClassInfo();

        System.out.println("Students with favorite number 7:");
        for (String name : mathClass.getStudentsWithFavoriteNumber(7)) {
            System.out.println(name);
        }

        System.out.println("Students with odd favorite number:");
        for (String name : mathClass.getStudentsWithOddFavoriteNumber()) {
            System.out.println(name);
        }
    }
}