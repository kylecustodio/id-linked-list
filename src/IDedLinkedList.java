/**
 *  Kyle Custodio | kyc180000
 *  CS3345 | Data Structures and Intro to Algorithmic Analysis
 *  Section 001
 *  Fall 2019
 *  Project 2: Takes an input file via command line, performs the instructions as per the file on a LinkedList
 *              and outputs when instructed to to an output file, name chosen via command line.
 */

public class IDedLinkedList<AnyType extends IDedObject> {
    private static class Node<AnyType extends IDedObject> {
        public Node(AnyType data) {
            this.data = data;
            next = null;
        }
        public AnyType data;
        public Node<AnyType> next;
    }

    private Node<AnyType> head;

    public IDedLinkedList() {
        makeEmpty();
    }

    public void makeEmpty() {
        head = null;
    }

    public AnyType findID(int ID) {
        Node<AnyType> ptr = head;
        if (head == null)
            return null;
        while (ptr != null) {
            if (ptr.data.getID() == ID) {
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }

    public boolean insertAtFront(AnyType x) {
        if (findID(x.getID()) != null)
            return false;
        Node<AnyType> node = new Node<>(x);
        node.next = head;
        head = node;
        return true;
    }

    public AnyType deleteFromFront() {
        if (head == null)
            return null;
        AnyType data = head.data;
        head = head.next;
        return data;
    }

    public AnyType delete(int ID) {
        if (head == null)
            return null;
        if (head.data.getID() == ID)
            return deleteFromFront();
        Node<AnyType> ptr = head;
        Node<AnyType> prev = null;
        while (ptr != null) {
            if (ptr.data.getID() == ID) {
                prev.next = ptr.next;
                return ptr.data;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        return null;
    }

    public int printTotal() {
        if (head == null)
            return -1;
        int total = 0;
        Node<AnyType> ptr = head;
        while (ptr != null) {
            total += ptr.data.getID();
            ptr = ptr.next;
        }
        return total;
    }
}
