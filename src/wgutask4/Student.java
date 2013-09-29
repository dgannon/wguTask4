package wgutask4;

import java.util.logging.*;

public abstract class Student {

    protected int studentId;
    protected String firstName;
    protected String lastName;
    protected double gpa;
    protected String status;
    protected String mentor;
    protected static Logger logger = Logger.getLogger("wgutask4.student");

    public Student() {
        logger.fine("Calling Student Default Constructor");
        this.setStudentId(0);
        this.setFirstName("");
        this.setLastName("");
        this.setGpa(0);
        this.setStatus("");
        this.setMentor("");
    }

    public Student(int studentId, String firstName, String lastName, double gpa, String status, String mentor) {
        logger.fine("Calling Student Overridden Constructor");
        this.setStudentId(0);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGpa(gpa);
        this.setStatus(status);
        this.setMentor(mentor);
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMentor() {
        return this.mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public abstract double calculateTuition(double creditHours);

    public abstract String add();

    public abstract String query(int studentId);

    public abstract String update();

    public abstract String delete();

    @Override
    public String toString() {
        return " STUDENT ID: " + this.getStudentId()
                + " NAME: " + this.getFirstName() + " " + this.getLastName()
                + " GPA: " + this.getGpa()
                + " STATUS: " + this.getStatus()
                + " MENTOR: " + this.getMentor();
    }
;
}