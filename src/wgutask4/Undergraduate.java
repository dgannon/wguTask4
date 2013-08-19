package wgutask4;

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
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return " STUDENT-UNDERGRADUATE ID: " + this.getStudentId()
                + " NAME: " + this.getFirstName() + " " + this.getLastName()
                + " GPA: " + this.getGpa()
                + " STATUS: " + this.getStatus()
                + " MENTOR: " + this.getMentor()
                + " LEVEL: " + this.getLevel();
    }
}