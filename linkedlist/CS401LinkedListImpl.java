import sun.awt.image.ImageWatched;

public class CS401LinkedListImpl<E> implements CS401CollectionInterface<E>
{
   protected LinkEntry<E> head;
   protected LinkEntry<E> tail;
   protected int num_elements = 0;

   public CS401LinkedListImpl()
   {
      head = tail = null;
   }

   /**
    * Methods inherited from CS401CollectionInterface
    */
   public boolean is_empty()
   {
      if (head == null) 
          return true;

      return false;
   }

   public boolean is_full() { return false; }

   public int size() { return num_elements; }

   /* 
    * Adds element e at the end of the linked list. */
   public boolean add(E e)
   {
      add(Where.BACK, e);
      
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

      /**
       * The following code shows 3 cases of deleting an element from a linked list.
       * 1. removing an element from the beginning of a linked list
       * 2. removing an element at the end of the linked list.
       * 3. removing an element from the middle of the linked list.
       */
      LinkEntry<E> current = new LinkEntry<E>();
      LinkEntry<E> ne = new LinkEntry<>();
      LinkEntry<E> prev = new LinkEntry<>();

      int startIndex = 0;
      current.element = head.element;
      current = head;
      if (i == startIndex){// removing an element from the beginning of the linked list.
         ne = head;
         head = head.next;
         current.next = null;
      }
         while(current.next!=null){ // removing element from the end of linked list.
            prev = current;
            current = current.next;
            startIndex++;
            if (startIndex == i)
               break;
         }
      System.out.println("start index "+startIndex);
         ne.element = current.element;
         prev = tail;

      return ne.element;
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

      if (head == null && tail == null)
      {
          head = tail = ne;
          num_elements++;
         System.out.println("Added element"+ne.element.toString());
          return true;
      }

      if (where == Where.BACK) {
         tail.next = ne;
         tail = ne;
      }
      else if (where == Where.FRONT)  {
          /**
           * Add code here. */
         ne.next = head;
         head = ne;
      }
      System.out.println("Added element"+ne.element.toString());
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
       * Add code here. */
      LinkEntry<E> current = new LinkEntry<E>();
      LinkEntry<E> ne = new LinkEntry<E>();
      int i = 0;
      current = head;
      while(current!=null && i< index){// traversing the linkedlist to get the pointer current to appropriate index and then use it to insert an element in the linkedlist.
         current = current.next;
         i++;
      }
      ne.element = e;
      ne.next = current.next;
      current.next = ne;
      System.out.println("The element "+ne.element+" was added at the index "+ index+ " between index "+(index-1)+" and "+(index+1));



      return true;
   }

   /**
    * Print the collection class (linked list) by iterating over all of
    * the elements in the collection class and serializing them. 
    * Returns a Java String object that represents the serialization of
    * the collection class. */
   public String toString()  {

      StringBuilder result = new StringBuilder();
 
      /**
       * Add code here. 
       * Traverse the linked list and serialize each object.  Add the
       * serialized form to result. */

      return result.toString();
   }
   

   /* ------------------------------------------------------------------- */
   /* Inner classes                                                      */
   protected class LinkEntry<E>
   {
      protected E element;
      protected LinkEntry<E> next;
   }
   /* ------------------------------------------------------------------- */

} /* CS401LinkedListImpl<E> */

