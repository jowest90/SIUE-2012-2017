/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Faculty extends Employee{
    private String rank;
    private int annualTeachingLoad;

    public Faculty() {
        this("na", 0);
    }

    public Faculty(String rank, int annualTeachingLoad) {
        this.rank = rank;
        this.annualTeachingLoad = annualTeachingLoad;
    }

    public Faculty(String rank, int annualTeachingLoad, int eid, String doh, String dept, double salary) {
        super(eid, doh, dept, salary);
        this.rank = rank;
        this.annualTeachingLoad = annualTeachingLoad;
    }

    public Faculty(String rank, int annualTeachingLoad, int eid, String doh, String dept, double salary, String first, String last, String street, String city, String state, String zipcode) {
        super(eid, doh, dept, salary, first, last, street, city, state, zipcode);
        this.rank = rank;
        this.annualTeachingLoad = annualTeachingLoad;
    }

    public String getRank() {
        return rank;
    }

    public int getAnnualTeachingLoad() {
        return annualTeachingLoad;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setAnnualTeachingLoad(int annualTeachingload) {
        this.annualTeachingLoad = annualTeachingload;
    }

    @Override
    public String toString() {
        return "Faculty{" + "rank= " + rank + ", "
                          + "annualTeachingLoad= " + annualTeachingLoad + '}'
                          + super.toString();
    }
    
}
