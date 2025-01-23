import java.util.ArrayList;
import java.util.List;

// Represents a student with a name and a list of subjects
class Student {
    String name;
    List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

// Represents a subject with a name and marks
class Subject {
    String name;
    int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

// Handles the calculation of grades based on subject marks
class GradeCalculator {
    public String calculateGrade(List<Subject> subjects) {
        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        double average = totalMarks / (double) subjects.size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "F";
    }
}

// Entry point of the application
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abhi");
        student.addSubject("Maths", 90);
        student.addSubject("Science", 85);

        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getSubjects());
        System.out.println("Student: " + student.name + ", Grade: " + grade);
    }
}
