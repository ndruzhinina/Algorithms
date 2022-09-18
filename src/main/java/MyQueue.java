import java.util.Stack;

public class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            return first.peek();
        }
        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(12);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());

        queue.push(4);
        System.out.println(queue.peek());

    }
}