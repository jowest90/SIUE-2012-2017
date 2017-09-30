/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Administer extends Employee{
    private String title;

    public Administer() {
        this("na");
    }

    public Administer(String title) {
        this.title = title;
    }

    public Administer(String title, int eid, String doh, String dept, double salary) {
        super(eid, doh, dept, salary);
        this.title = title;
    }

    public Administer(String title, int eid, String doh, String dept, double salary, String first, String last, String street, String city, String state, String zipcode) {
        super(eid, doh, dept, salary, first, last, street, city, state, zipcode);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Administer{" + "title=" + title + '}'
                             + super.toString();
    }
    
}
