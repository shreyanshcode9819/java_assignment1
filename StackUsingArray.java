import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;


    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow. Unable to push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed onto the stack.");
        }
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. The stack is empty.");
            return -1;
        } else {
            return stack[top--];
        }
    }


    public int peek() {
        if (top == -1) {
            System.out.println("The stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public void display() {
        if (top == -1) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        StackUsingArray stack = new StackUsingArray(size);

        int choice;
        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped value: " + popped);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }
}

