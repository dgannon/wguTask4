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

            stmt.execute("Insert Into student (firstName,lastName,gpa,status,mentor,thesisTitle,thesisAdvisor)"
                    + " Values ('"
                    + this.getFirstName() + "','"
                    + this.getLastName() + "','"
                    + this.getGpa() + "','"
                    + this.getStatus() + "','"
                    + this.getMentor() + "','"
                    + this.getThesisTitle() + "','"
                    + this.getThesisAdvisor() + "')");

            stmt.close();
            conn.close();
            System.out.println("Successfully added Graduate Student to the database");
            return "";
        } catch (SQLException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not insert");
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }

    }

    @Override
    public String query(int studentId) {
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
                //this.setStudentId(rs.getInt("studentID"));
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
            return "";

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not select student " + studentId);
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }
    }

    @Override
    public String delete(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + " THESIS TITLE: " + this.getThesisTitle()
                + " THESIS ADVISIOR: " + this.getThesisAdvisor();
    }
}