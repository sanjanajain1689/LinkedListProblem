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
        LinkedList list3=new LinkedList();
        list3.add_data(56);
        list3.add_data(70);
        list3.add_in_between(30);
        list3.show();
        list3.delete_first_node();
        list3.show();
        list2.delete_last_node();
        list2.show();
    }
}
