package hackerrank30Days;
/*
 * @created 22/06/2022 on 5:22
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.*;

public class QueuesAndStacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            queue.offer(word.charAt(i));
        }
//        System.out.println(stack);
//        System.out.println(queue);

        for (int i = 0; i < word.length(); i++) {
            if(stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
            }
        }
        if(stack.empty() && queue.isEmpty())
            System.out.println("The word, " + word +", is a palindrome.");
        else
            System.out.println("The word, " + word +", is not a palindrome.");
    }
}
