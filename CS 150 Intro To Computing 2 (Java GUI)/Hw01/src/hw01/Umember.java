/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw01;

/**
 *
 * @author Johnny
 */
public class Umember {
    private String first;
    private String last;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Umember() {
        this("na", "na", "na", "na", "na","na");
    }

    public Umember(String first, String last, String street, String city, String state, String zipcode) {
        this.first = first;
        this.last = last;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public String getLast() {
        return last;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Umember{" + "first= " + first + ", "
                          + "last= " + last + ", "
                          + "street= " + street + ", "
                          + "city= " + city + ", "
                          + "state= " + state + ", "
                          + "zipcode= " + zipcode + '}';
    }
    
}
