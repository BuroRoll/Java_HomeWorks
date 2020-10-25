public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.appendIntoTail(new LinkNode(6));
        ll.appendIntoTail(new LinkNode(5));
        LinkNode<Integer> l4 = new LinkNode(4);
        ll.appendIntoTail(l4);
        ll.appendIntoTail(new LinkNode(3));
        ll.appendIntoTail(new LinkNode(2));
        ll.appendIntoTail(new LinkNode(1));
        ll.appendIntoTail(l4);
        System.out.println(ll.isCyclic());
    }
}
