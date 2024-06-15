//Main
package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        System.out.println("Traversing DLL:");
        doublyLinkedList.traverseDLL();

        System.out.println("Reverse Traversing DLL:");
        doublyLinkedList.reverseTraverseDLL();

        System.out.println("Searching for value 2:");
        int location = doublyLinkedList.searchDLL(2);
        if (location != -1) {
            System.out.println("Value found at location: " + location);
        } else {
            System.out.println("Value not found in the list.");
        }

        System.out.println("Deleting node at location 1:");
        doublyLinkedList.deleteNodeDLL(1);
        doublyLinkedList.traverseDLL();

        System.out.println("Deleting entire DLL:");
        doublyLinkedList.deleteDLL();
        doublyLinkedList.traverseDLL();
    }
}
