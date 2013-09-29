package wgutask4;

import java.sql.ResultSet;
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
    public double calculateTuition(double creditHours) {
        if (this.getStatus().equalsIgnoreCase("resident")){
            return creditHours * 200;
        }
        else if (this.getStatus().equalsIgnoreCase("non resident")) {
            return creditHours * 400; 
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
                    + "level = " + "'" + this.getLevel() + "' "
                    + "WHERE studentid = " + this.getStudentId();

            //Create SQL statement to insert
            System.out.println(SqlString);
            stmt.executeUpdate(SqlString);

            stmt.close();
            conn.close();
            System.out.println("Successfully updated Undergrad student in the database");
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
            stmt.execute("INSERT into student (firstName,lastName,gpa,status,mentor,level)"
                    + " Values ('"
                    + this.getFirstName() + "','"
                    + this.getLastName() + "','"
                    + this.getGpa() + "','"
                    + this.getStatus() + "','"
                    + this.getMentor() + "','"
                    + this.getLevel() + "')");

            stmt.close();
            conn.close();
            System.out.println("Successfully added Undergraduate Student to the database");
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
            String sqlst = "Select studentID,firstName,lastName,gpa,status,mentor,level"
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
                this.setLevel(rs.getString("level"));

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
            System.out.println("Successfully undergraduate deleted student to the database");
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
        return super.toString() + " LEVEL: " + this.getLevel();
    }
}