package java_professional.lesson_notes.second_lesson;

public class SimpleStack { // LiFo
    private int maxSize;
    private long [] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean empty() {
        return (top == -1);
    }
}

class StackMain{
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(16);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        System.out.println(simpleStack.peek());

        while (!simpleStack.empty()){
            System.out.println(simpleStack.pop());
        }
    }
}