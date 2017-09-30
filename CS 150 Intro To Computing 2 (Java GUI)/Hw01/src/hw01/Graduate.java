/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Graduate extends Student{
    private String advisor;

    public Graduate() {
    }

    public Graduate(String advisor) {
        this.advisor = advisor;
    }

    public Graduate(String advisor, int sid, String major) {
        super(sid, major);
        this.advisor = advisor;
    }

    public Graduate(String advisor, int sid, String major, String first, String last, String street, String city, String state, String zipcode) {
        super(sid, major, first, last, street, city, state, zipcode);
        this.advisor = advisor;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    @Override
    public String toString() {
        return super.toString() + "Graduate{" + "advisor= " + advisor + '}';
    }
    
}
