public class Node<E>{
    public E data;
    Node<E> next;
    
    public Node(E data){
        this.data = data;
        this.next = null;
    }
    
    public Node(E data, Node <E> next){
        this.data = data;
        this.next = next;
    }

    public Node<E> getNext(){
      return next;
    }
}
