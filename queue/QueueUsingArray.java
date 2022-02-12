package queue;
/*

----> rear 10 20 30 40 50 60 -->front

1. insertion always from rear
2. deletion always takes place from front

 */
public class QueueUsingArray {
    int[] queue;
    int front, rear, size, capacity;

    QueueUsingArray(int capacity){
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.queue = new int[capacity];
    }

    void enqueue(int data){
        if (isFull())
            return;
        queue[++rear] = data;
        size++;
    }

    int dequeue(){
        if (isEmpty())
            return -1;
        return queue[size--];
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return rear < 0;
    }

    boolean isFull(){
        return rear > capacity;
    }

    public static void main(String[] args) {
        QueueUsingArray t = new QueueUsingArray(10);
        t.enqueue(10);
        t.enqueue(20);
        t.enqueue(30);
        t.enqueue(40);
        t.enqueue(50);
        System.out.println(t.dequeue());
        System.out.println(t.dequeue());
        System.out.println(t.size());
        System.out.println(t.isEmpty());
        System.out.println(t.isFull());

        for (int i = 0; i < t.size; i++) {
            System.out.println(t.queue[i]);
        }
    }
}