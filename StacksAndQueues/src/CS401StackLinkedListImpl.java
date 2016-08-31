import java.util.Iterator;

public class CS401StackLinkedListImpl<E> implements CS401StackInterface<E> 
{
   private LinkEntry<E> head;
   private int num_elements;

   public CS401StackLinkedListImpl()
   {
      head = null;
      num_elements = 0;
   }

   public void push(E e)
   {
      /** Add code here **/
      LinkEntry<E> ne = new LinkEntry<>();
      ne.element = e;
      ne.next = head;
      head = ne;
      num_elements++;
      return;
   }

   public E pop()
   {
      LinkEntry<E> ne = new LinkEntry<>();
      /** Add code here **/
      if(head!=null) {
         ne = head;
         head = head.next;
         ne.next = null;
         num_elements--;
      }
      return ne.element;

   }
   public E peek(){
      LinkEntry<E> ne = new LinkEntry<>();
      ne = head;
      return ne.element;
   }

   public int size()
   {
      /** Add code here **/
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
} /* CS401StackLinkedListImpl<E> */
