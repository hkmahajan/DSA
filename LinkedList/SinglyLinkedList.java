package LinkedList;

public class SinglyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    SinglyLinkedList(){
        this.head=null;
    }

    void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else {
            Node current = head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            Node temp=head;
            head=newNode;
            newNode.next=temp;
        }

    }
    void insertAfter(int element,int data){
        Node newNode = new Node(data);
        if(head==null){
            System.out.println("Empty List");
        }else if (head.data==element){
            newNode.next=head.next;
            head.next=newNode;
        }else{
            Node current = head;
            while (current.data!=element && current.next!=null){
                current=current.next;
            }
            if(current.data==element){
                newNode.next=current.next;
                current.next=newNode;
            }else{
                System.out.println("Element not found");
            }

        }
    }

    void deleteAtFirst(){
        if(head==null){
            System.out.println("Empty List");
        }else {
            head=head.next;
        }
    }

    void delete(int element){
        if (head==null){
            System.out.println("Empty List");
        } else if (head.data==element) {
            head=head.next;
        }else {
            Node current = head;
            while (current.next!=null && current.next.data!=element){
                current=current.next;
            }
            if(current.next==null){
                System.out.println("Element Not found");
                return;
            }
            current.next=current.next.next;
        }
    }

    void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty List");
        }else if(head.next==null){
            head=null;
        }
        else{
            Node current = head;
            while (current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }

    void display(){
        if(head==null){
            System.out.println("Empty List");
        }else{
            Node current = head;
            while (current!=null){
                System.out.print(current.data);
                System.out.print("->");
                current=current.next;
            }
            System.out.println("Null");
        }
    }
    boolean search(int element){
        if(head==null){
            System.out.println("Empty String");
            return false;
        }else if(head.data==element){
            return true;
        }else {
            Node current = head;
            while (current.next!=null && current.next.data!=element){
                current=current.next;
            }
            if(current.next==null){
                return false;
            }else {
                return true;
            }
        }
    }
    int size(){
        int count = 0;
        Node current = head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;

    }
    void reverse(){
        if(head==null){
            System.out.println("empty list");
        }else {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current!=null){
                next=current.next;
               current.next=prev;
               prev=current;
               current=next;
            }
            head=prev;
        }
    }

    int findMiddle(){
        if (head==null){
            return -1;
        }
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    boolean detectCycle(){
        if (head==null){
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    void makeCycle(){
        if(head==null){
            System.out.println("Empty list");
        }else {
            Node current = head;
            while (current.next!=null) current=current.next;
            current.next=head;
        }
    }
    public static void main(String[] args) {
            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
            singlyLinkedList.insert(10);
            singlyLinkedList.insert(20);
            singlyLinkedList.insert(30);
            singlyLinkedList.insertAfter(30,35);
            singlyLinkedList.insert(40);
            singlyLinkedList.insert(50);
            singlyLinkedList.insert(60);
            singlyLinkedList.insertAtFirst(5);
            singlyLinkedList.insertAfter(54,10);
            singlyLinkedList.delete(70);
        singlyLinkedList.delete(5);
        singlyLinkedList.delete(35);
        singlyLinkedList.delete(100);
        singlyLinkedList.deleteAtEnd();
            singlyLinkedList.display();
        System.out.println(singlyLinkedList.search(50));
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.reverse();
        singlyLinkedList.display();
        singlyLinkedList.deleteAtFirst();
        singlyLinkedList.display();
        System.out.println(singlyLinkedList.findMiddle());
        singlyLinkedList.makeCycle();
        System.out.println(singlyLinkedList.detectCycle());
    }
}
