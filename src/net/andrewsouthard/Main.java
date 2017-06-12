package net.andrewsouthard;

/**
 * Created by andrewsouthard on 5/31/17.
 */
public class Main {

    public static int binarySearch(int item, int[] array) {
        int i = 0;
        int j = array.length;
        int middle = (i + j) / 2;

        while (i < j) {
            if (array[middle] == item) {
                return middle;
            } else if (array[middle] < item) {
                i = middle + 1;
                middle = (i + j) / 2;
            } else {
                j = middle - 1;
                middle = (i + j) / 2;
            }
        }
        return -1;

    }


    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // create a node
        Node fiveNode = new Node(5);

        // create a linked list with fiveNode at the head
        LinkedList myLinkedList = new LinkedList(fiveNode);

        // add a node with the value 4
        myLinkedList.addNode(4);
        System.out.println(fiveNode.getNext().getValue());

        // get count of linked list, should be 2
        System.out.println(myLinkedList.getCount());

        // remove node, print count of linked list should be 1 and nextnode for fiveNode should be null
        myLinkedList.removeNode();
        System.out.println(myLinkedList.getCount());
        System.out.println(fiveNode.getNext());

        // add a node of value 8, get the second element from linked list--should be 8
        myLinkedList.addNode(8);
        System.out.println(myLinkedList.get(2));

    }
}
