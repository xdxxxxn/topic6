import java.util.LinkedList;

public class Cache<T> {
    private final LinkedList<T> items;
    private final int maxSize;

    public Cache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("максимальный размер должен быть больше 0");
        }
        this.maxSize = maxSize;
        this.items = new LinkedList<>();
    }

    public void add(T item) {
        items.add(item);
        if (items.size() > maxSize) {
            items.removeFirst();
        }
    }
}
