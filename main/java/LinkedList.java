
public class LinkedList<E> {
    GenericNode<E> head;

     public void add_data(E data){
         GenericNode node=new GenericNode();
         node.data=data;
         node.next=null;

         if(head==null){
             head=node;
         }
         else{
             GenericNode n=head;
             while(n.next!=null){
                 n=n.next;
             }
             n.next=node;
         }
     }

     public void add_reverse_data(E data){
         GenericNode node=new GenericNode();
         GenericNode n=head;
         node.data=data;
         node.next=n;
         head=node;
     }

     public void show(){
         GenericNode node=head;
         while(node.next!=null){
             System.out.println(node.data);
             node=node.next;
         }
         System.out.println(node.data);
     }
}
