package wgutask4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Parttime extends Student {

    protected String company;
    
    public Parttime(){
        super();
        company = "";
    }
    
    public Parttime(int studentId, String firstName, String lastName, double gpa, String status, String mentor, String company){
       super(studentId, firstName, lastName, gpa, status, mentor);
       this.setCompany(company);
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void calculateTuition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add() {
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
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("Could not insert");
        }
    }

    @Override
    public void query() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return " STUDENT-PARTTIME ID: " + this.getStudentId()
                + " NAME: " + this.getFirstName() + " " + this.getLastName()
                + " GPA: " + this.getGpa()
                + " STATUS: " + this.getStatus()
                + " MENTOR: " + this.getMentor()
                + " COMPANY: " + this.getCompany();
    }
}