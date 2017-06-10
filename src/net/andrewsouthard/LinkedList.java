package net.andrewsouthard;

/**
 * Created by andrewsouthard on 6/10/17.
 */
public class LinkedList {
    // properties
    Node head;
    int count;

    // constructors
    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public LinkedList (Node head){
        this.head = head;
        this.count = 1;
    }

    // methods
    public void addNode(int value) {
        Node current = head;
        Node temp = new Node(value);

        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count += 1;
    }

    public void removeNode() {
        Node current = head;

        if(current == null) {
            System.out.println("no Nodes to remove, empty Linked List");
            System.exit(0);
        }

        else if(getCount() == 1) {
            System.out.println("only one Node in Linked List, deleting Node");
            this.head = null;
            System.exit(0);
        }

        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;

    }

    public int getCount() {
        return this.count;
    }

    public Boolean isEmpty() {
        return getCount() == 0;
    }
}
