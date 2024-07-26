/**
 * -- LinkedList --
 * 
 * LinkedList implements the List interface and uses a doubly-linked list to store elements.
 * It allows for efficient insertions and deletions but has slower random access compared to ArrayList.
 * 
 * -- Key Characteristics --
 * 
 * Allows null elements
 * Implements both List and Deque interfaces.
 * 
 * @author Adarsh_Kumar
 */

package notes.unit4;

import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("LinkedList: " + list);
    }
}
