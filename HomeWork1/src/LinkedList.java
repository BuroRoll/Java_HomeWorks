import java.util.Arrays;
import java.util.Comparator;

public class LinkedList<T> {
    private LinkNode<T> first;
    private LinkNode<T> last;
    private int size = 0;

    public LinkedList() {
    }

    public int getSize() {
        return size;
    }

    public void add(T element) {
        if (last == null) {
            this.last = new LinkNode<>(element);
            this.first = last;
        } else {
            this.last.setNextElement(new LinkNode<>(element));
            this.last = last.getNext();
        }
        size++;
    }

    public boolean isCyclic() {
        return first == last;
    }

    public void sort(Comparator<? super T> c) {
        Object[] arr = this.toArray();
        Arrays.sort(arr, (Comparator) c);
        first = new LinkNode<>((T) arr[0]);
        last = first;
        for(int i = 1; i < size; i++){
            last.setNextElement(new LinkNode<>((T) arr[i]));
            last = last.getNext();
        }
    }

    private Object[] toArray() {
        Object[] arr = new Object[(int) size];
        LinkNode curr = first;
        for (int i = 0; i < size; i++) {
            arr[i] = curr.getData();
            curr = curr.getNext();
        }
        return arr;
    }
}
