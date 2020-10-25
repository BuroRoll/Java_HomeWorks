public interface  IElement<T> {
    T getData();
    IElement<T> getNext();
}