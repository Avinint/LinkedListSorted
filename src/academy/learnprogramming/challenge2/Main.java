package academy.learnprogramming.challenge2;

import java.lang.Integer;
import InterLinkedList;

public class Main {

    public static void main(String[] args) {

        int[] values = {4, 6, 9, 11};
        IntegerLinkedList list = new IntegerLinkedLisr<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(11);
        list.insertSorted(10);

        list.printList();
    }
}
