package Stack;

public class StackUsingLinkedList {

    Node top;
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    StackUsingLinkedList(){
        this.head=null;
    }
    void push(int data){
        Node newNode = new Node(data);
        if (top==head){
            head=newNode;
            top=newNode;
        }else {
            top.next=newNode;
            top=newNode;
        }
    }
}

