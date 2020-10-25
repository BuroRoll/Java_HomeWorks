import java.util.Comparator;

public interface IStupidList<T> {
    void appendIntoTail(IElement<T> element);
    boolean isCyclic();
    IStupidList<T> sort(Comparator<? super T> c);
}