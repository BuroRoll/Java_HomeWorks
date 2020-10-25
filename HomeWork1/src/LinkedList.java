import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class LinkedList<T> implements IStupidList<T>{
    private LinkNode<T> first;
    private LinkNode<T> last;
    private int size = 0;

    @Override
    public void appendIntoTail(IElement element) {
        if(last == null){
            this.last = (LinkNode<T>) element;
            this.first = last;
        }else {
            last.setNextElement((LinkNode) element);
            last = (LinkNode<T>) last.getNext();
        }
        size++;
    }

    @Override
    public boolean isCyclic() {
        HashSet<LinkNode<T>> set = new HashSet<>();
        LinkNode<T> node = first;
        while(node != null){
            if(set.contains(node))
                return true;
            set.add(node);
            node = (LinkNode<T>) node.getNext();
        }
        return false;
    }

    @Override
    public IStupidList sort(Comparator c){
        if(this.isCyclic()){
            System.out.println("Невозможно выполнить сортировку из-за цикличности списка");
            return null;
        }
        Object[] arr = this.toArray();
        Arrays.sort(arr, c);
        LinkedList<T> sorterList = new LinkedList<>();
        for(int i = 0; i < size; i++)
            sorterList.appendIntoTail(new LinkNode(arr[i]));
        return sorterList;
    }

    private Object[] toArray() {
        Object[] arr = new Object[(int) size];
        LinkNode<T> curr = first;
        for (int i = 0; i < size; i++) {
            arr[i] = curr.getData();
            curr = (LinkNode<T>) curr.getNext();
        }
        return arr;
    }
}
