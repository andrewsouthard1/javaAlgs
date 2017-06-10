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
        System.out.println("Algs program");
        int[] testArray = {6, 22, 41, 5, 16, 37, 8, 9};

        Node fiveNode = new Node(5);
        Node fourNode = new Node(4);

        LinkedList myLinkedList = new LinkedList(fiveNode);
        myLinkedList.addNode(fourNode);

        System.out.println(fiveNode.getNext().getValue());

    }
}
