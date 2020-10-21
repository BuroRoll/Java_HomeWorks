public class LinkNode<T>{
    private T data;
    private LinkNode<T> nextElement;

    public LinkNode(T data) {
        this.data = data;
    }

    public void setNextElement(LinkNode<T> nextElement){
        this.nextElement = nextElement;
    }

    public T getData() {
        return data;
    }

    public LinkNode<T> getNext() {
        return nextElement;
    }
}
