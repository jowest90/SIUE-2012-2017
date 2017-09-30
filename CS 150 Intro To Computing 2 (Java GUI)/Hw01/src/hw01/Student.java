/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Student extends Umember {

    private int sid;
    private String major;

    public Student() {
        this(0, "na");
    }

    public Student(int sid, String major) {
        this.sid = sid;
        this.major = major;
    }

    public Student(int sid, String major, String first, String last, String street, String city, String state, String zipcode) {
        super(first, last, street, city, state, zipcode);
        this.sid = sid;
        this.major = major;
    }

    public int getSid() {
        return sid;
    }

    public String getMajor() {
        return major;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "sid= " + sid + ", "
                          + "major= " + major + '}'
                          + super.toString();
    }    
}
