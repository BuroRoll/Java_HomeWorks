public class LinkNode<T> implements IElement<T>{
    private T data;
    private IElement<T> nextElement;

    public LinkNode(T data) {
        this.data = data;
    }

    public void setNextElement(LinkNode<T> nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public IElement<T> getNext() {
        return nextElement;
    }
}
