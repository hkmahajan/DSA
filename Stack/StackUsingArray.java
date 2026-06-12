package Stack;

import java.util.Arrays;

public class StackUsingArray {

    int top = -1;
    int[] stack;

    StackUsingArray(int size){
        stack = new int[size];
    }

    void push(int data){
        if(top>=stack.length-1){
            System.out.println("Stack is overflow");
        }else {
            stack[++top]=data;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else {
            System.out.println(stack[top--]);
        }
    }

    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }

    void peak(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else {
            System.out.println(stack[top]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);
        stack.push(130);
        stack.push(140);
        stack.push(150);


        stack.display();
        stack.pop();
        System.out.println(stack);

    }
}
