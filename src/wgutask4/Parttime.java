package wgutask4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Parttime extends Student {

    protected String company;

    public Parttime() {
        super();
        company = "";
    }

    public Parttime(int studentId, String firstName, String lastName, double gpa, String status, String mentor, String company) {
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
    public double calculateTuition(double creditHours) {
        if (this.getStatus().equalsIgnoreCase("resident")){
            return creditHours * 250;
        }
        else if (this.getStatus().equalsIgnoreCase("non resident")) {
            return creditHours * 450; 
        }
        else
            return 0;  //This should not happen
    }

    @Override
    public String update(int studentId) {
        Statement stmt = null;

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();

            //Create SQL statement to insert
            stmt.execute("UPDATE student "
                    + " SET ('"
                    + "StudentID = " + this.getStudentId() + "','"
                    + "FirstName = " + this.getFirstName() + "','"
                    + "LastNAme = " + this.getLastName() + "','"
                    + "GPA = " + this.getGpa() + "','"
                    + "Status = " + this.getStatus() + "','"
                    + "Mentor = " + this.getMentor() + "','"
                    + "Company = " + this.getCompany() + "')"
                    + "WHERE StudentId = " + this.getStudentId());

            stmt.close();
            conn.close();
            System.out.println("Successfully updated student in the database");
            return "";

        } catch (SQLException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println("MySQL SQL State:" + e.getSQLState());
            //System.err.pirntln("MySql Error Code:" + getErrorCode());
            System.err.println("Could not update studentId" + studentId);
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
            stmt.execute("Insert Into student (firstName,lastName,gpa,status,mentor,company)"
                    + " Values ('"
                    + this.getFirstName() + "','"
                    + this.getLastName() + "','"
                    + this.getGpa() + "','"
                    + this.getStatus() + "','"
                    + this.getMentor() + "','"
                    + this.getCompany() + "')");

            stmt.close();
            conn.close();
            System.out.println("Successfully added Parttime Student to the database");
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
            String sqlst = "Select studentID,firstName,lastName,gpa,status,mentor,company"
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
                this.setCompany(rs.getString("company"));

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
            System.err.println("Could not select student " + studentId);
            return "MySql Error Message: " + e.getMessage() + "MySQL SQL State :" + e.getSQLState();
        }
    }

    @Override
    public String delete(int studentId) {
        Statement stmt = null;

        try {
            Connect conn = new Connect();
            stmt = conn.makeStatement();

            //Create SQL statement to insert
            stmt.execute("DELETE from student"
                    + " WHERE ('"
                    + "studentID = " + studentId + ")");

            stmt.close();
            conn.close();
            System.out.println("Successfully deleted student to the database");
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
        return super.toString() + " COMPANY: " + this.getCompany();
    }
}