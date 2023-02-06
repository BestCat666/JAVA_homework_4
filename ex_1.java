//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
//import org.w3c.dom.Node;

public class ex_1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.print("\n");
        myList = reverse(myList);
        System.out.print(myList);

    }

    private static LinkedList<Integer> reverse(LinkedList<Integer> reverseList) {
        for (int i = 0; i < reverseList.size() / 2; i++) {
            // int prev = myList.get(i);
            // int next = myList.get(i + 1);
            Integer temp = reverseList.get(i);
            reverseList.set(i, reverseList.get(reverseList.size() - i - 1));
            reverseList.set(reverseList.size() - i - 1, temp);

        }
        return reverseList;
    }
}
// Node head = new Node(1);
// head.next = new Node(2);
// head.next.next = new Node(3);
// head.next.next.next = new Node(4);
// int prev = myList.get(i);
// int next = myList.get(i + 1);