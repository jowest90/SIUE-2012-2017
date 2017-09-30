/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Undergraduate extends Student{
    private String academicClass;

    public Undergraduate() {
        this("na");
    }

    public Undergraduate(String academicClass) {
        this.academicClass = academicClass;
    }

    public Undergraduate(String academicClass, int sid, String major) {
        super(sid, major);
        this.academicClass = academicClass;
    }

    public Undergraduate(String academicClass, int sid, String major, String first, String last, String street, String city, String state, String zipcode) {
        super(sid, major, first, last, street, city, state, zipcode);
        this.academicClass = academicClass;
    }

    public String getAcademicClass() {
        return academicClass;
    }

    public void setAcademicClass(String academicClass) {
        this.academicClass = academicClass;
    }

    @Override
    public String toString() {
        return "Undergraduate{" + "academicClass= " + academicClass + '}'
                                + super.toString();
    }
}
