/**
 * Created by dmanzelmann on 10/28/14.
 */
public class StudentDatabase implements KeyMode {
    private String name;
    private String ID;
    private double GPA;

    public StudentDatabase() {
        name = "";
        ID = "";
        GPA = 0.0;
    }

    public StudentDatabase(String name, String ID, double GPA) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }

    public KeyMode deepCopy() {
        StudentDatabase temp = new StudentDatabase(name, ID, GPA);
        return temp;
    }

    public int compareTo(Object targetKey) {
        String tKey = (String)targetKey;
        return(name.compareTo(tKey));
    }

    public String toString() {
        return("Name is " + name +
                "\nID is " + ID +
                "\nGPA is " + GPA + "\n");
    }
}
