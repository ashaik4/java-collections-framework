/* 
 * Fixed front implementation of a Queue using arrays */

public class CS401QueueArrayFixedImpl<E> implements CS401QueueInterface<E>  {
   private E[] data;
   private int front, back;
   private int capacity;

   public CS401QueueArrayFixedImpl(int num_elems)   {
      capacity = num_elems;
      data = (E[]) new Object[capacity];
      front = back = 0;    
   }

   public void add(E element) {

      /*** Add code ***/
   }

   public E remove()  {
      
      /*** Add code ***/
      return data[0];
   }

   public E peek()  {

      /*** Add code ***/
      return data[0];
   }

   public boolean is_empty()  {

      /*** Add code ***/
   return true;
   }

   public boolean is_full()  {

      /*** Add code ***/
   return true;
   }
}
