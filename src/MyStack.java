/*
* Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().

* */
public class MyStack {
    private int[] values;
    private int size = 0;
    int capacity;
    private int top;

    public MyStack() {
        this.capacity = 10;
        this.values = new int[capacity];
        this.top = -1;
    }

    private void addCapacity() {
        capacity = capacity + capacity / 2;
        int[] temp = new int[capacity];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(int newValue) {
        if (isFull()) {
            addCapacity();
        }
        values[++top] = newValue;
        size++;
    }

    private boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        try {
            return values[top];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Stack is empty!");
        }
    }

    public int pop() {
        if (!empty()) {
            peek();
            return values[top--];
        } else {
            throw new RuntimeException("Stack is empty!");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]).append(", ");
        }
        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }


}
