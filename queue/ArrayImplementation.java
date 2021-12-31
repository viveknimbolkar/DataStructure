package queue;

public class ArrayImplementation {

    final int SIZE = 10;
    int front = -1, rear = -1;
    int[] queue = new int[SIZE];

    void enqueue(int x){
        if (rear == SIZE-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = x;

        if (front == -1) front++;
    }

    int dequeue(){
        if (front == -1 || front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        front++;
        return queue[front];
    }

    boolean isEmpty(){
        if (front == -1 || front > rear-1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayImplementation arrImp = new ArrayImplementation();
        arrImp.enqueue(10);
        arrImp.enqueue(20);
        arrImp.enqueue(30);
        arrImp.enqueue(40);
        arrImp.enqueue(50);

        System.out.println("Dequeued: "+arrImp.dequeue());
        System.out.println("Dequeued: "+arrImp.dequeue());
        System.out.println("Dequeued: "+arrImp.isEmpty());
    }
}
