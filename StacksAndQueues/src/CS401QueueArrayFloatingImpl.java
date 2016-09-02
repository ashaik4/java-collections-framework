/* 
 * Floating front and back implementation of a queue using an array */

public class CS401QueueArrayFloatingImpl<E> implements CS401QueueInterface<E>  {
   private E[] data;
   private int front, back;
   private int capacity;
   private int num_elements;
   public CS401QueueArrayFloatingImpl(int num_elems)   {
      capacity = num_elems;
      data = (E[]) new Object[capacity];
      front = back = 0;
       num_elements = 0;
   }

   public void add(E element) {
      /*** Add code ***/
      if(!is_full()){
       data[back] = element;
          System.out.println("Added element: "+element.toString());
          back = (back+1)%capacity;
          num_elements++;
      }else{
          queue_size_increase();
          data[back] = element;
          System.out.println("Added element: "+element.toString());
          back = (back+1)%capacity;
          num_elements++;
      }

      return;
   }

   public E remove()  {
      /*** Add code ***/
      E returnValue;
      if(!is_empty()) {
          returnValue = data[front];
          data[front] = null;
          front = (front+1)%capacity;
          num_elements--;
      }else{
          throw new RuntimeException("Queue is empty");
      }
   return returnValue;
   }
   public E peek()  {

      /*** Add code ***/
   return data[front];
   }

   public boolean is_empty()  {

      /*** Add code ***/
   return num_elements==0;
   }

   public boolean is_full()  {

      /*** Add code ***/
   return capacity==back;
   }
   public void queue_size_increase(){
       E[] temp = (E[]) new Object[capacity*2];
       for (int i = 0; i < data.length; i++) {
           temp[i] = data[i];
       }
       data = temp;
   }

}
