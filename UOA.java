/**
 * Created by dmanzelmann on 10/27/14.
 */
public class UOA<T> {
    private int next;
    private int size;
    private T[] data;

    public UOA() {
        next = 0;
        size = 100;
        data = (T[])new Object[size];
    }

    public UOA(int s) {
        next = 0;
        data = (T[])new Object[s];
        size = s;
    }

    public boolean insert(T newListing) {
        KeyMode node = (KeyMode) newListing;
        if(next >= size)
            return false;
        data[next] = (T)node.deepCopy();

        if(data[next] == null)
            return false;

        next = next + 1;
        return true;
    }

    public KeyMode fetch(Object targetKey) {
        KeyMode node = (KeyMode) data[0];

        //sequential search
        T temp;
        int i = 0;
        while (i < next && !(node.compareTo(targetKey) != 0)) {
            i++;
            node = (KeyMode) data[i];
        }

        if (i == next)
            return null;

        node = node.deepCopy();

        //move the node up one position, part of the optimization
        if(i != 0) {
            temp = data[i - 1];
            data[i - 1] = data[i];
            data[i] = temp;
        }

        return node;
    }

    public boolean delete(Object targetKey) {
        KeyMode node = (KeyMode) data[0];
        int i = 0;
        while (i < next && !(node.compareTo(targetKey) == 0)) {
            i++;
            node = (KeyMode) data[i];
        }

        if (i == next)
            return false;

        //move the last node into the deleted node's position
        data[i] = data[next - 1];
        data[next - 1] = null;
        next = next - 1;
        return true;
    }

    public boolean update(Object targetKey, T newNode) {
        if(delete(targetKey) == false)
            return false;
        else if(insert(newNode) == false)
            return false;
        else
            return true; //node found and updated
    }

    public void showAll() {
        for(int i = 0; i < next; i++)
            System.out.println(data[i].toString());
    }
}

