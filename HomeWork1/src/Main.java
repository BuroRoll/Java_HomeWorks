public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(9);
        ll.add(8);
        ll.add(7);
        ll.add(6);
        ll.add(5);
        ll.sort((o1, o2) -> o1.compareTo(o2));
    }
}
