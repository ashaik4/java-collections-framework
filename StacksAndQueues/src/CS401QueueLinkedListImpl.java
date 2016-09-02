import sun.awt.image.ImageWatched;

import java.util.NoSuchElementException;

public class CS401QueueLinkedListImpl<E> implements CS401QueueInterface<E>  {
   private LinkEntry<E> head;
   private LinkEntry<E> tail;
   private int num_elements;

   public void add(E element) {
      /*** Add code ***/
      LinkEntry<E> ne = new LinkEntry<>();
      ne.element = element;
      if (is_empty()) {
         head = tail = ne;
      }else{
         tail.next = ne;
         tail = ne;
      }
      num_elements++;

   }
   public E remove()  {
      LinkEntry<E> ne = new LinkEntry<>();
      /*** Add code ***/
      if(!is_empty()) {
         ne.element = head.element;
         head = head.next;
         ne.next = null;
         num_elements--;
      }else{
         System.out.println("Empty queue exception");
         throw new NoSuchElementException("Empty queue exception");
      }
      return ne.element;
   }
   public E peek()  {
      /*** Add code ***/
      return head.element;
   }

   public boolean is_empty()  {
      /*** Add code ***/
     return head == null;
   }

   public boolean is_full()  {

      /*** Add code ***/
      // LOL. Dynamic memory allocation
return false;
   }
   public int size(){
      return num_elements;
   }

   /* ------------------------------------------------------------------- */
   /* Inner classes                                                      */
   protected class LinkEntry<E>
   {
      protected E element;
      protected LinkEntry<E> next;

      protected LinkEntry() { element = null; next = null; }
   }
}
