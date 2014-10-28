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

    }

    private int binarySearch(T key) {

    }
}
