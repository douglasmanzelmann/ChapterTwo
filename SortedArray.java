/**
 * Created by dmanzelmann on 10/28/14.
 */
public class SortedArray<T> {
    private int next;
    private int size;
    private T[] data;

    public SortedArray() {
        next = 0;
        size = 10;
        data = (T[])new Object[size];
    }

    public SortedArray(int size) {
        next = 0;
        this.size = size;
        data = (T[])new Object[size];
    }

    public boolean insert(T element) {
        int index = binarySearch(element);

    }

    public StudentDatabase fetch(Object key) {
        int index = binarySearch(key);
        if (index == -1)
            return null;
        else
            return (StudentDatabase)data[index];
    }

    public boolean delete(Object key) {
        int index = binarySearch(key);

        if(index == -1)
            return false;

        else if (index == next) {
            next -= 1;
            return true;
        }


        StudentDatabase node = (StudentDatabase)data[index];




    }

    private int binarySearch(Object key) {
        int low = 0;
        int high = next - 1;
        int mid = (high - low) / 2;
        StudentDatabase temp = (StudentDatabase) key;


        while (high >= low) {
            if (temp.compareTo(key) == 0)
                return mid;
            else if (temp.compareTo(key) > 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}
