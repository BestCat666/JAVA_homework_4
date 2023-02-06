//Реализуйте очередь с помощью LinkedList со следующими методами: 
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;

public class ex_2_itog {
    //class Queue<T> {
    //    LinkedList<T> list = new LinkedList<T>();
    //    public void enqueue(T item) {
    //        list.addLast(item);
    //    }
    //}
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
        myList.addLast(25);
        System.out.print(myList);
        System.out.print("\n");
        myList.addFirst(250);
        System.out.print(myList);
        System.out.print("\n");
        myList.removeFirst();
        System.out.print(myList);

}
}
