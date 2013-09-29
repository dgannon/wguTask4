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
    public double calculateTuition(double creditHours) {
                if (this.getStatus().equalsIgnoreCase("resident")){
            return creditHours * 300;
        }
        else if (this.getStatus().equalsIgnoreCase("non resident")) {
            return creditHours * 350; 
        }
        else
            return 0;  //This should not happen
    }

    @Override
    public String update() {
        Statement stmt = null;

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();
            String SqlString = new String();
            SqlString = "UPDATE student "
                    + "SET "
                    + "firstname = " + "'" + this.getFirstName() + "', "
                    + "lastname = " + "'" + this.getLastName() + "', "
                    + "gpa = " + "'" + this.getGpa() + "', "
                    + "status = " + "'" + this.getStatus() + "', "
                    + "mentor = " + "'" + this.getMentor() + "', "
                    + "thesisTitle = " + "'" + this.getThesisTitle() + "', "
                    + "thesisAdvisor = " + "'" + this.getThesisAdvisor() + "' "
                    + "WHERE studentid = " + this.getStudentId();

            //Create SQL statement to insert
            System.out.println(SqlString);
            stmt.executeUpdate(SqlString);

            stmt.close();
            conn.close();
            System.out.println("Successfully updated graduate student in the database");
            return "";

        } catch (SQLException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not update graduate studentId" + studentId);
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }
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

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();
            String sqlst = "Select studentID,firstName,lastName,gpa,status,mentor,thesisTitle,ThesisAdvisor"
                    + " FROM registrar.student"
                    + " WHERE studentID = " + Integer.toString(studentId);
            rs = stmt.executeQuery(sqlst);

            //Parse the result set returned and print

            while (rs.next()) {
                this.setStudentId(rs.getInt("StudentID"));
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
            return "";
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not select Graduate student " + studentId);
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }
    }

    @Override
    public String delete() {
        Statement stmt = null;

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();
            String SqlString = new String();
            SqlString = "DELETE from student"
                    + " WHERE "
                    + "studentid = " + this.getStudentId() + ";";

            //Create SQL statement to insert
            System.out.println(SqlString);
            stmt.executeUpdate(SqlString);

            stmt.close();
            conn.close();
            System.out.println("Successfully deleted Graduate student from the database");
            return "";

        } catch (SQLException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not delete student " + studentId);
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " THESIS TITLE: " + this.getThesisTitle()
                + " THESIS ADVISIOR: " + this.getThesisAdvisor();
    }
}