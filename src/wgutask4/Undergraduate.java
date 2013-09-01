package wgutask4;

import java.sql.SQLException;
import java.sql.Statement;

public class Undergraduate extends Student {

    protected String level;

    public Undergraduate() {
        super();
        level = "";
    }
    
    public Undergraduate(int studentId, String firstName, String lastName, double gpa, String status, String mentor, String level){
        super(studentId, firstName, lastName, gpa, status, mentor);
        this.setLevel(level);
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void calculateTuition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add() {
        Statement stmt = null;

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();

            //Create SQL statement to insert
            stmt.execute("Insert Into student (studentId,firstName,lastName,gpa,status,mentor,company)"
                    + " Values ('"
                    + this.studentId + "','"
                    + this.firstName + "','"
                    + this.lastName + "','"
                    + this.gpa + "','"
                    + this.status + "','"
                    + this.mentor + "','"
                    + this.company + "')");

            stmt.close();
            conn.close();
            System.out.println("Successfully added media to the database");
            return true;
        } catch (SQLException e) {
            
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("Could not insert");
            return false;
        }
    }

    @Override
    public String query(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return " STUDENT-UNDERGRADUATE ID: " + this.getStudentId()
                + " NAME: " + this.getFirstName() + " " + this.getLastName()
                + " GPA: " + this.getGpa()
                + " STATUS: " + this.getStatus()
                + " MENTOR: " + this.getMentor()
                + " LEVEL: " + this.getLevel();
    }
}