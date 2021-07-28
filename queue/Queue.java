package queue;
/*

----> rear 10 20 30 40 50 60 -->front

1. insertion always from rear
2. deletion always takes place from front

 */
 class QueueInitialize {
    int front, rear, size, capacity;
    int[] queue;

    //initialize constructore for q
    public QueueInitialize(int capacity) {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    //add items into the queue
    public void enqueue(int item){
        if (isQueueFull())
            return;
        rear++;
        queue[rear] = item;
        size++;
    }

    //remove item from the queue
     public void dequeue(){
        if (isQueueEmpty())
            return;
        size--;
     }

    //queue status
     public boolean isQueueEmpty(){
        return size==0;
     }
    public boolean isQueueFull(){
        return size == capacity;
    }

    //print the items of queue
//    public void showQueue(){
//        for (int i: queue) {
//            System.out.println(i);
//        }
//    }


}

public class Queue{
    public static void main(String[] args) {
        QueueInitialize q = new QueueInitialize(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("front element is "+q.queue[q.front]);
        System.out.println();
        System.out.println("rear element is "+q.queue[q.rear]);
        System.out.println();
        System.out.println("No. of items in queue "+q.size);
        q.dequeue();
        System.out.println();
        System.out.println("no. of item after dequeue "+q.size);


    }
}