package Lecture5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        /*============================== ArrayList ============================================*/
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        System.out.println(list); // [5]
        list.add(6);
        System.out.println(list); // [5, 6]
        list.add(0, 1);
        System.out.println(list); // [1, 5, 6]
        list.remove(new Integer(6));
        System.out.println(list); // [1, 5]
        list.add(1);
        System.out.println(list); // [1, 5, 1]
        list.remove(1);
        System.out.println(list); // [1, 1]
        System.out.println(list.size()); // 2
        System.out.println(list.contains(new Integer(2))); // false
      /*  =============================== LinkedList ========================================*/
        System.out.println("==================================================");
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.push(5); // [5]
        list1.push(1); // [1, 5]
        list1.push(2); // [2, 1, 5]
        list1.push(3); // [3, 2, 1, 5]
        list1.push(1); // [1, 3, 2, 1, 5]
        list1.remove(2);
        System.out.println(list1); // [1, 3, 1, 5]
        System.out.println(list1.size()); // 4
        System.out.println(list1.peekFirst()); // 1
        System.out.println(list1.peekLast());  // 5
        System.out.println(list1.pop());       // 1
    }
}
