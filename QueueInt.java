public class QueueInt {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public QueueInt(int maxSize) {
        this.maxSize = (maxSize > 0) ? maxSize : 20; // Tamanho padrão é 20 se for inválido
        this.queueArray = new int[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean isFull() {
        return (currentSize == maxSize);
    }

    public int size() {
        return currentSize;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
            currentSize++;
        } else {
            System.out.println("A fila está cheia. Não é possível enfileirar.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedItem;
        } else {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return -1; 
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("A fila está vazia. Não há elemento para visualizar.");
            return -1;
        }
    }

    public void display() {
        if (!isEmpty()) {
            int index = front;
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queueArray[index] + " ");
                index = (index + 1) % maxSize;
            }
            System.out.println();
        } else {
            System.out.println("A fila está vazia. Não há elementos para exibir.");
        }
    }

    public void enqueue(Pedido pedido) {
    }
}

