package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student) {
        if (findStudentById(student.getID()) == null) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public Student findStudentById(String ID) {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getID().equals(ID)) {
                return enrolledStudents.get(i);
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    public int numEnrolled() {
        return enrolledStudents.size();
    }

    public void printToFile() {
        String fileName = String.format("%s_%s_%s.csv", course.getName(), startDate, endDate);
        try (PrintStream printStream = new PrintStream(fileName)) {
            for (int i = 0; i < enrolledStudents.size(); i++) {
                printStream.println(enrolledStudents.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    public void unEnroll(String ID) {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getID().equals(ID)) {
                enrolledStudents.remove(i);
                break;
            }
        }
    }
}

