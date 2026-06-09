package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    class Node{

      Node prev;
      int data;
      Node next;

      Node(int data){
          this.prev=null;
          this.data=data;
          this.next=null;
      }
    }
    DoublyLinkedList(){
      this.head=null;
      this.tail=null;
    }

    void insert(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }

    void insertAtFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    void deleteAtFirst(){
        if(head==null){
            System.out.println("Empty list");
        }else if(head.next==null) {
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty list");
        }else if(head.next==null){
            head=null;
            tail=null;
        }else {
            tail=tail.prev;
            tail.next=null;
        }
    }

    boolean search(int element){

        if(head == null) return false;

        Node current = head;

        while (current!=null){
            if(current.data==element) return true;
            current=current.next;
        }
        return false;
    }

    void displayForword(){
        if(head==null){
            System.out.println("Empty list");
        }else {
            Node current = head;
            System.out.print("null <-> ");
            while (current!=null){
                System.out.print(current.data+" <-> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }
    void displayBackword(){
        if(head==null){
            System.out.println("Empty list");
        }else {
            Node current = tail;
            System.out.print("null <-> ");
            while (current!=null){
                System.out.print(current.data+" <-> ");
                current=current.prev;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.insert(60);
        doublyLinkedList.displayForword();
        doublyLinkedList.displayBackword();
        System.out.println(doublyLinkedList.search(30));
    }
}
