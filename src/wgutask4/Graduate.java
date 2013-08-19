package wgutask4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Graduate extends Student {

    protected String thesisTitle;
    protected String thesisAdvisor;

    public Graduate() {
        super();
        thesisTitle = "";
        thesisAdvisor = "";
    }

    public Graduate(int studentId, String firstName, String lastName, double gpa, String status, String mentor, String thesisTitle, String thesisAdvisor) {
        super(studentId, firstName, lastName, gpa, status, mentor);
        this.setThesisTitle(thesisTitle);
        this.setThesisAdvisor(thesisAdvisor);
    }

    public String getThesisTitle() {
        return this.thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getThesisAdvisor() {
        return this.thesisAdvisor;
    }

    public void setThesisAdvisor(String thesisAdvisor) {
        this.thesisAdvisor = thesisAdvisor;
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

            stmt.execute("Insert Into student (studentId,firstName,lastName,gpa,status,mentor,thesisTitle,thesisAdvisor)"
                    + " Values ('"
                    + this.studentId + "','"
                    + this.firstName + "','"
                    + this.lastName + "','"
                    + this.gpa + "','"
                    + this.status + "','"
                    + this.mentor + "','"
                    + this.thesisTitle + "','"
                    + this.thesisAdvisor + "')");

            stmt.close();
            conn.close();
            System.out.println("Successfully added media to the database");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Could not insert");

        }

    }

    @Override
    public void query() {
        Statement stmt = null;
        ResultSet rs = null;
        String output = " ";

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();
            String sqlst = "Select * FROM media WHERE mediaID = " + this.getStudentId();
            rs = stmt.executeQuery(sqlst);

            //Parse the result set returned and print

            while (rs.next()) {
                this.setStudentId(rs.getInt("studentID"));
                this.setFirstName(rs.getString("firstName"));
                this.setLastName(rs.getString("lastName"));
                this.setGpa(rs.getDouble("gpa"));
                this.setStatus(rs.getString("status"));
                this.setMentor(rs.getString("mentor"));
                this.setThesisTitle(rs.getString("thesisTitle"));
                this.setThesisAdvisor(rs.getString("thesisAdvisor"));

            }
            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("ERROR: Either cannot connect to the DB "
                    + " or error with the SQL statement");
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return " STUDENT-GRADUATE ID: " + this.getStudentId()
                + " NAME: " + this.getFirstName() + " " + this.getLastName()
                + " GPA: " + this.getGpa()
                + " STATUS: " + this.getStatus()
                + " MENTOR: " + this.getMentor()
                + " THESIS TITLE: " + this.getThesisTitle()
                + " THESIS ADVISIOR: " + this.getThesisAdvisor();
    }
}