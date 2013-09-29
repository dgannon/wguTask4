/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wgutask4;

/**
 *
 * @author DuGannon
 */
public class WguTask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello to Dustin's Student Database!");
        //runToStringTests();
        //runToSqlTests();
        
        MainGui myApp = new MainGui();
        myApp.setVisible(true);
    }

    private static void runToStringTests() {
        System.out.println("TEST =============== runToStringTests ==============");
        System.out.println("TEST = Create some simple objects and run their toString method to the console");
        System.out.println("TEST = Create 1 of each class with blank constructors then call their toString method.");
        Parttime partimer = new Parttime();
        Undergraduate undergrad = new Undergraduate();
        Graduate grad = new Graduate();

        //Run thier toString method for testing purposes.
        System.out.println(partimer.toString());
        System.out.println(undergrad.toString());
        System.out.println(grad.toString());

        Parttime partimer2 = new Parttime(-1, "Test", "Parttimer", 2.0, "Parttime", "Rey Armijo", "Symitar");
        Undergraduate undergrad2 = new Undergraduate(-1, "Test", "Undergrad", 3.0, "Undergrad", "Rey Armijo", "Symitar");
        Graduate grad2 = new Graduate(-1, "Test", "Grad2", 4.0, "Grad", "Rey Armijo", "ThesisTitleTest", "ThesisAdvisorTest");

        //Run thier toString method for testing purposes.
        System.out.println(partimer2.toString());
        System.out.println(undergrad2.toString());
        System.out.println(grad2.toString());
    }
    
    private static void runToSqlTests() {
        System.out.println("TEST =============== runToSqlTests ==============");
        System.out.println("TEST = Create a sample student object in the code and try and write it to the SQL database");
        
        Parttime partimerSql = new Parttime(3, "Test", "Parttimer4", 2.0, "Parttime", "Rey Armijo", "Symitar");
        Undergraduate undergradSql = new Undergraduate(-1, "Test", "Undergrad", 3.0, "Undergrad", "Rey Armijo", "Symitar");
        Graduate gradSql = new Graduate(-1, "Test", "Grad2", 4.0, "Grad", "Rey Armijo", "ThesisTitleTest", "ThesisAdvisorTest");

        //Run thier toString method for testing purposes.
        System.out.println("Print the Student Values for reference");
        System.out.println(partimerSql.toString());
        System.out.println(undergradSql.toString());
        System.out.println(gradSql.toString());
        
        //Try to add them to Sql Database
        System.out.println("Try to add them to Sql Database");
        partimerSql.add();
        
        //undergradSql.add();
        //gradSql.add();
        
        //Try and Select them from the Database
        System.out.println("Try and Select them from the Database");
        System.out.println(partimerSql.query(1).toString());
        
        //Try and Delete an item 
        // Run the MAIN Gui
    }
}
