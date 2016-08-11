public class CS401SortedLinkedListImpl<E> extends CS401LinkedListImpl<E>
{
   public CS401SortedLinkedListImpl()
   {
      super();
   }

   /** 
    * Adds element e in sorted order in the collection class (linked 
    * list).
    * Returns true if e was added successfully, false otherwise.
    */
   public boolean add(E e)
   {
      /**
       * Add code here. */
      LinkEntry<E> ne = new LinkEntry<>();
      ne.element = e;
      if(head ==null && tail == null){
         head = tail = ne;
      }else{

         LinkEntry<E> prev;
         prev = null;
         LinkEntry<E> current;
         int i = 0;
         for (current = head; current!=null; current = current.next){
            int comp = ((Comparable) e).compareTo(current.element);
            if(comp< 0){
               break;
            }
            prev = current;
            i++;
         }
         if(prev == null){
            ne.next = head;
            head = ne;
         }
         else if(current == null){
            tail.next = ne;
            tail = ne;
         }
         else{
            prev.next = ne;
            ne.next = current;
//          ne.next = prev.next;
//          prev.next = ne;

            System.out.println(i);
         }
      }

      return true;
   }

   /**
    * Print the sorted linked list in reverse order using recursion.
    */
   public void reverse_print()  {
      /**
       * Add code here
       *
       */
      p_r(head);
   }
   public void straight_print(){
      p_s(head);
   }
   public void p_r(LinkEntry<E> h){
      if(h!=null) {
         p_r(h.next);
         System.out.println(h.element);
      }
   }
   public void p_s(LinkEntry<E> h){
      if(h!=null){
         System.out.println(h.element);
         p_s(h.next);
      }
   }


} /* CS401SortedLinkedListImpl<E> */

