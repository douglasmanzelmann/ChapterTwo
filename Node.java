import javax.swing.*;

/**
 * Created by dmanzelmann on 10/27/14.
 */
public class Node {
    private String name;
    private String address;
    private String number;

    public Node(String n, String a, String num) {
        name = n;
        address = a;
        number = num;
    }

    public String toString() {
        return ("Name is " + name +
                "\nAddress is " + address +
                "\nNumber is " + number + "\n");
    }

    public Node deepCopy() {
        Node clone = new Node(name, address, number);
        return clone;
    }

    public int compareTo(String targetKey) {
        return(name.compareTo(targetKey));
    }

    public void setAddress(String a) {
        address = a;
    }

    public void input() {
        name = JOptionPane.showInputDialog("Enter a name");
        address = JOptionPane.showInputDialog("Enter an address");
        number = JOptionPane.showInputDialog("Enter a number");
    }
}

