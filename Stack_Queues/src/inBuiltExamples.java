import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class inBuiltExamples {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(12);
//        stack.push(1);
//        stack.push(62);
//        stack.push(34);
//        stack.push(86);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(23);
//        queue.add(53);
//        queue.add(87);
//        queue.add(97);
//        queue.add(12);
//
//        System.out.println(queue.peek()); // just show the item but not remove
//        System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(21);
        deque.addLast(23);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

    }
}
