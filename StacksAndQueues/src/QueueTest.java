/**
 * Created by Arshad on 9/1/2016.
 */
public class QueueTest {
    public static void main(String[] args) {
        CS401QueueArrayFixedImpl<Integer> queue = new CS401QueueArrayFixedImpl<Integer>(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("removing: "+queue.remove());
        System.out.println("removing: "+queue.remove());
        System.out.println("removing: "+queue.remove());
        System.out.println("removing: "+queue.remove());
        System.out.println("removing: "+queue.remove());
        System.out.println(queue.remove());




    }



}
