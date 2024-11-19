import java.util.Scanner;

public class QueueUsingArray {
    private int[] queue;
    private int front, rear, size, capacity;


    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }


    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow. Unable to enqueue " + value);
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to the queue.");
        }
    }


    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow. The queue is empty.");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }
    }


    public int peek() {
        if (size == 0) {
            System.out.println("The queue is empty.");
            return -1;
        } else {
            return queue[front];
        }
    }


    public void display() {
        if (size == 0) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();

        QueueUsingArray queue = new QueueUsingArray(size);

        int choice;
        do {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued value: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);


    }
}
