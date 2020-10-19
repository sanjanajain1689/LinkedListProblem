public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add_data(56);
        list.add_data(30);
        list.add_data(70);
        list.show();
        LinkedList list2=new LinkedList();
        list2.add_data(70);
        list2.add_reverse_data(30);
        list2.add_reverse_data(56);
        list2.show();
    }
}
