public class task3 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.size());
        stack.push(34);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
