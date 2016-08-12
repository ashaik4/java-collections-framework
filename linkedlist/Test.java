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

        CS401SortedLinkedListImpl<Chores> sortedList = new CS401SortedLinkedListImpl<>();
        Chores testChore = new Chores("Exercise", 15);
        Chores hh = new Chores("chore 1",10);
        sortedList.add(hh);
        sortedList.add(new Chores("Chore 2",20));
        sortedList.add(new Chores("chore 3",30));
        sortedList.add(testChore);
        System.out.println(sortedList.contains(testChore));
        sortedList.reverse_print();
        sortedList.straight_print();

        System.out.println(ll);

        // Test code for doubly linked list
        CS401DblLinkedListImpl<Chores> doubly_linked_list = new CS401DblLinkedListImpl<>();
        doubly_linked_list.add(new Chores("This is first element in doubly linked list",1));
        doubly_linked_list.add(Where.BACK,new Chores("Adding an element at the back of the linked list",2));
        doubly_linked_list.add(Where.FRONT,new Chores("Adding element at the front of the linked list",3));


    }
}
