/**
 * Created by dmanzelmann on 10/28/14.
 */
public class PhoneListing implements KeyMode {
    private String name;
    private String address;
    private String number;

    public PhoneListing(String n, String a, String num) {
        name = n;
        address = a;
        number = num;
    }

    public String toString() {
        return ("Name is " + name +
                "\nAddress is " + address +
                "\nNumber is " + number + "\n");
    }

    public KeyMode deepCopy() {
        PhoneListing clone = new PhoneListing(name, address, number);
        return clone;
    }

    public int compareTo(Object targetKey) {
        String tKey = (String)targetKey;
        return(name.compareTo(tKey));
    }
}
