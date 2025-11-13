
class CircularBuffer {
    int[] buffer;
    int size, front, rear, count;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void insert(int value) {
        rear = (rear + 1) % size;
        buffer[rear] = value;
        if (count < size)
            count++;
        else
            front = (front + 1) % size;  // Overwrite oldest element
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();
        cb.insert(4);  // Overwrites oldest (1)
        cb.display();
    }
}
