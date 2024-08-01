package queue;

public class CircularQueue {

        private int[] queue;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int item) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int item = queue[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public int size() {
            return size;
        }

        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("Dequeue: " + queue.dequeue());

            queue.enqueue(6);
            queue.enqueue(7);

            System.out.println("Size: " + queue.size());
            System.out.println("Is empty? " + queue.isEmpty());
            System.out.println("Is full? " + queue.isFull());
        }
    }

