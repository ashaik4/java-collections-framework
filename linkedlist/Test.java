/**
 * Created by Arshad on 8/7/2016.
 */
public class Test {
    public static void main(String[] args) {
        CS401LinkedListImpl<Chores> ll = new CS401LinkedListImpl<>();
        ll.add(new Chores("Do Laundry",10));
        ll.add(new Chores("Take out the trash",20));
        ll.add(new Chores("Press your clothes",30));
        ll.add(Where.MIDDLE,1,new Chores("Prepare your breakfast",40));
        System.out.println(ll.num_elements);
        System.out.println("removed element "+ ll.remove(0).toString());
    }
}
