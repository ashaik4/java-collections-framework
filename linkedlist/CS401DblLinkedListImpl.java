import java.util.Iterator;

public class CS401DblLinkedListImpl<E> extends CS401LinkedListImpl<E> 
{
   private LinkEntry<E> head;
   private LinkEntry<E> tail;
   private int num_elements = 0;

   public CS401DblLinkedListImpl()
   {
      head = tail = null;
   }

   public boolean is_empty()
   {
      if (head == null) 
          return true;

      return false;
   }

   public boolean is_full() { return false; }

   public int size() { return num_elements; }

   /*
    * Add e to the end of the doubly linked list.
    * Returns true - if e was successfully added, false otherwise.
    */
   public boolean add(E e)
   {
      /** Add code here **/
    add(Where.BACK,e);
      return true;
   }

   /**
    * Remove element indicated by i.
    * If the element exists in the collection, return that element back 
    * to the user.  If index is out of bounds, return null.
    */
   public E remove(int i)
   {
      /**
       * Add code here. */
      return null;
   }

   /**
    * Determines if e is in the collection.
    * Hint: Remember lecture on comparison.
    * Returns true if e is in the collection, false otherwise. */
   public boolean contains(E e)
   {
      /**
       * Add code here. */
      return true;
   }

   /**
    * Add e to either front of the linked list or the end of the linked
    * list, depending on the value of the parameter where.
    * If where == MIDDLE, return false.
    * Returns true if element added to back or front, or false if asked
    * to add in the middle. */
   public boolean add(Where where, E e)  {

      if (where == Where.MIDDLE)
          return false;

      LinkEntry<E> ne = new LinkEntry<E>();
      ne.element = e;
      /**
       * Add code here.
       * Hint: follow the same logic as
       * CS401LinkedListImpl::add(Where where, E e) except account for
       * the previous and next references in the doubly linked list. */

      if (head == null && tail == null) {
        head = ne;
         tail = head;
         tail.next = null;
         head.previous = null;
        // System.out.println(head.element);
      }
      else if (where == Where.FRONT){
         ne.next = head;
         head.previous = ne;
         head = ne;
         head.previous = null;
        // System.out.println(head.element);
      }
      else if(where == Where.BACK){
         tail.next = ne;
         ne.previous = tail;
         tail = ne;
         tail.next = null;
        // System.out.println(tail.element);

      }
      num_elements++;


      return true;
   }

   /**
    * Add e to the middle of a linked list.  More specifically, add e
    * after index in the linked list.  First element of the linked list
    * is 0, second is 1, and so on.
    *
    * Returns true if element added, false if where != MIDDLE. */
   public boolean add(Where where, int index, E e)  {

      /**
       * Add code here. 
       * Hint: follow the same logic as 
       * CS401LinkedListImpl::add(Where where, int index, E e) except 
       * account for the previous and next references in the doubly 
       * linked list. */
      if(where == Where.MIDDLE){
      LinkEntry<E> current_element = new LinkEntry<>();
      LinkEntry<E> next_element = new LinkEntry<>();
      LinkEntry<E> ne = new LinkEntry<>();
      ne.element = e;
      current_element = head;
      int i = 0;
      while(i < index ){
         current_element = head.next;
         next_element = current_element.next;
         i++;
      }

      ne.previous = current_element;
      current_element.next = ne;
      ne.next = next_element;

      next_element.previous = ne;
      num_elements++;

      return true;
      }
      return false;
   }

   /**
    * Print the doubly linked list starting at the beginning.
    */
   public void print_from_beginning()
   {
      /** Add code here **/
      return;
   }

   /**
    * Print the doubly linked list starting the end.
    */
   public void print_from_end()
   {
      /** Add code here **/
      return;
   }

   /* ------------------------------------------------------------------- */
   /* Inner classes                                                      */
   protected class LinkEntry<E>
   {
      protected E element;
      protected LinkEntry<E> next;
      protected LinkEntry<E> previous;

      protected LinkEntry() { element = null; next = previous = null; }
   }
} /* CS401LinkedListImpl<E> */
