/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseConverter;

/**
 *
 * @author Johnny
 */
public class BaseNumber implements Comparable<BaseNumber> {

    private int base10Value;

    public BaseNumber() {
        this(0);
    }

    public BaseNumber(int base10Value) {
        this.base10Value = base10Value;
    }

    public int getBase10Value() {
        return base10Value;
    }

    public String getBase2Value() {
        String bin = Integer.toBinaryString(base10Value);
        return bin;
    }

    public String getBase16Value() {
        String hex = Integer.toHexString(base10Value);
        return hex.toUpperCase();
    }

    public void setBase10Value(int base10Value) {
        this.base10Value = base10Value;
    }

    public void setBase2Value(String base2Value) {
        this.base10Value = Integer.parseInt(base2Value);
    }

    public void setBase16Value(String base16Value) {
        this.base10Value = Integer.parseInt(base16Value);
    }

    @Override
    public int compareTo(BaseNumber o) {
        int status;
        
        if (base10Value < o.base10Value) {
            status = -1;
        } else if (base10Value == o.base10Value) {
            status = 0;
        } else {
            status = 1;
        }
        return status;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.base10Value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaseNumber other = (BaseNumber) obj;
        if (this.base10Value != other.base10Value) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseNumber{" + "base10Value=" + base10Value + '}';
    }
}
