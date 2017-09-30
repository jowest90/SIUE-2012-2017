/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Employee extends Umember{
    private int eid;
    private String doh;
    private String dept;
    private double salary;

    public Employee() {
        this(0, "na", "na", 00.00);
    }

    public Employee(int eid, String doh, String dept, double salary) {
        this.eid = eid;
        this.doh = doh;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(int eid, String doh, String dept, double salary, String first, String last, String street, String city, String state, String zipcode) {
        super(first, last, street, city, state, zipcode);
        this.eid = eid;
        this.doh = doh;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public String getDoh() {
        return doh;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setDoh(String doh) {
        this.doh = doh;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid= " + eid + ", "
                           + "doh= " + doh + ", "
                           + "dept= " + dept + ", "
                           + "salary= " + salary + '}' 
                           + super.toString();
    }
    
}
