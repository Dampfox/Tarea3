import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> list;

    public GenericList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public boolean remove(T element) {
        return list.remove(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    public ArrayList<T> getAll() {
        return list;
    }
}
