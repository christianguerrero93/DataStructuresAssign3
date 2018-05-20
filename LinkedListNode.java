public class LinkedListNode<I extends Comparable<I>> {
   I data;
   LinkedListNode<I> next;

   LinkedListNode(I data){
       this.data = data;
       this.next = null;
   }
  
   LinkedListNode(I data, LinkedListNode<I> next){
       this.next = next;
       this.data = data;
   }

   public I getData() {
       return data;
   }

   public void setData(I data) {
       this.data = data;
   }
  
   public LinkedListNode<I> getNext() {
       return next;
   }

   public void setNext(LinkedListNode<I> next) {
       this.next = next;
   }
}