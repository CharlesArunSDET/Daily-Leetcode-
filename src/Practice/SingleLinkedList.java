package Practice;

import java.util.Scanner;

class Node {
    int data;    // Holds the value of the node
    Node next;   // Reference to the next node in the list

    Node(int d) {
        data = d; // Initialize the data field with the provided value
        next = null; // Initialize the next field as null (no next node yet)
    }
}
public class SingleLinkedList {
    Node head; // Reference to the first node in the list

    // Insert a new node at the front of the list
    public void push(int newData) {
        Node newNode = new Node(newData); // Create a new node with the given data
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to be the new node
    }

    // Delete a node with a given key
    public boolean deleteNode(int key) {
        if (head == null) { // Check if the list is empty
            System.out.println("List is empty. Cannot delete.");
            return false;
        }

        Node temp = head, prev = null;

        // Check if the node to delete is the head node
        if (temp != null && temp.data == key) {
            head = temp.next; // Move the head to the next node
            return true;
        }

        // Search for the node to delete
        while (temp != null && temp.data != key) {
            prev = temp; // Keep track of the previous node
            temp = temp.next; // Move to the next node
        }

        // If the node was not found
        if (temp == null) {
            System.out.println("Practice.Node with data " + key + " not found.");
            return false;
        }

        // Remove the node by updating the previous node’s next reference
        prev.next = temp.next;
        return true;
    }

    // Print the linked list
    public void printList() {
        if (head == null) { // Check if the list is empty
            System.out.println("List is empty.");
            return;
        }
        Node tnode = head;
        while (tnode != null) { // Traverse through the list
            System.out.print(tnode.data + " "); // Print the data of the current node
            tnode = tnode.next; // Move to the next node
        }
        System.out.println(); // Print a newline after printing the list
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
            // Display menu options
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Print the linked list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read user choice

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert: ");
                    data = scanner.nextInt(); // Read data to insert
                    list.push(data); // Insert the data
                    System.out.println(data + " inserted.");
                    break;
                case 2:
                    System.out.print("Enter the key to delete: ");
                    data = scanner.nextInt(); // Read key to delete
                    if (list.deleteNode(data)) {
                        System.out.println("Practice.Node with data " + data + " deleted.");
                    }
                    break;
                case 3:
                    System.out.println("The linked list is: ");
                    list.printList(); // Print the list
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}