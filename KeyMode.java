/**
 * Created by dmanzelmann on 10/28/14.
 */
public interface KeyMode {
    public abstract KeyMode deepCopy();

    public abstract int compareTo(Object other);

    public abstract String toString();
}
