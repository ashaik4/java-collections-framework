public class CS401StackArrayImpl<E> implements CS401StackInterface<E> 
{
   private int num_elements;
   private int max_elements;
   private E[] elements;

   public CS401StackArrayImpl()
   {
      max_elements = 10; 
      num_elements = 0;
      elements = (E[]) new Object[max_elements];
   }

   /**
    * Push an element on the stack.  If the stack is full, then allocate
    * more memory to hold a new stack, copy existing elements to the new
    * stack and add the new element to the newly enlarged stack.
    * Do not use System.arraycopy().  You are essentially implementing
    * what System.arraycopy() will do when you expand an existing array. **/
   public void push(E e)
   {
      /** Add code here **/
      if(num_elements>=max_elements){
      E[] newArray = (E[]) elements[max_elements*2];
         for (int i = 0; i <elements.length ; i++) {
            newArray[i] = elements[i];
         }
         elements = newArray;
         elements[num_elements] = e;
         num_elements++;
      }else{
         elements[num_elements] = e;
         num_elements++;
      }
      return;
   }

   public E pop()
   {
      /** Add code here **/
      E popElement;
      popElement = elements[num_elements-1];
      num_elements--;
      return popElement;
   }

   public int size()
   {
      /** Add code here **/
   return num_elements;
   }

} /* CS401StackArrayImpl<E> */
