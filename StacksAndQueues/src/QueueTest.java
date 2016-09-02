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

        CS401QueueArrayFloatingImpl<String> floating_queue = new CS401QueueArrayFloatingImpl<>(5);

        floating_queue.add("Arshad");
        floating_queue.add("Anas");
        floating_queue.add("Ammar");
        floating_queue.add("Sami");
        floating_queue.add("Zeeshan");
        System.out.println("********************************************");

        System.out.println(floating_queue.remove().toString());
        System.out.println(floating_queue.remove());
        System.out.println(floating_queue.remove());
        System.out.println(floating_queue.remove());
        System.out.println(floating_queue.remove());
    //    System.out.println(floating_queue.remove());




    }



}
