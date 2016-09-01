/* 
 * Fixed front implementation of a Queue using arrays */

import com.sun.org.apache.xpath.internal.SourceTree;

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
      if(!this.is_full()){
         data[back] = element;
         back++;
      }else{
         queue_size_increase();
         data[back] = element;
         back++;
      }
   }
   public E remove()  {
      
      /*** Add code ***/
      E returnElement = data[front];
      for (int i = 0; i < back-1; i++) {
         data[i] = data[i+1];
         //System.out.println(data[i]);
         System.out.println("Front: "+front);
         System.out.println("Back: "+back);
      }
      back--;
      return returnElement;
   }

   public E peek()  {

      /*** Add code ***/
      return data[front];
   }

   public boolean is_empty()  {

      /*** Add code ***/
   return front == back;
   }

   public boolean is_full()  {

      /*** Add code ***/
      return capacity == back;

   }
   public int size(){
      return back;
   }
   public void queue_size_increase(){
      capacity = capacity *2;
      E[] temp  = (E[])new Object[capacity];
      for (int i = 0; i <data.length ; i++) {
         temp[i] = data[i];
      }
      data = temp;

   }
}
