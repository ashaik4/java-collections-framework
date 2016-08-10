/**
 * Created by Arshad on 8/7/2016.
 */
public class Test {
    public static void main(String[] args) {
        CS401LinkedListImpl<Chores> ll = new CS401LinkedListImpl<>();
        Chores h = new Chores("Do Laundry",10);
        ll.add(h);
        ll.add(new Chores("Take out the trash",20));
        ll.add(new Chores("Press your clothes",30));
        //ll.add(Where.MIDDLE,1,new Chores("Prepare your breakfast",40));
        ll.add(new Chores("Prepare your breakfast",40));
        System.out.println(ll.num_elements);
        System.out.println("removed element "+ ll.remove(3).toString());
        Chores newChore = new Chores("Take out the trash",20);
        System.out.println("Does the linked list contains?"+ll.contains(newChore));


        ll.p(h,How.REVERSE);
        System.out.println("*************************************");
        ll.p(h,How.STRAIGHT);
    }
}
