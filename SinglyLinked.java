package jurnal3;

import java.util.NoSuchElementException;

public class SinglyLinked<A> {
    private Node<A> firstNode;
    private Node<A> lastNode;
    private String name;

    public SinglyLinked() {
        this("linked list");
    }

    public SinglyLinked(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }
    // Insert At Front
    public void insertAtFront(A insertItem) {
        Node newNode = new Node(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new Node<A>(insertItem);
        } else { // firstNode refers to new node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    // Insert At Back
    public void insertAtBack(A insertItem) {
        Node newNode = new Node(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new Node<A>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    //Remove from Back
    public A removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        A removedItem = lastNode.data;

        if (firstNode == null) {
            firstNode = lastNode = null;
        } else {
            Node<A> current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    //Remove from Front
    public A removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        A removedItem = firstNode.data;

        if(firstNode != null){
            Node temp = new Node(firstNode);
            firstNode = firstNode.next;
            temp = null;
        }
        return removedItem;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        Node<A> current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
    }
}