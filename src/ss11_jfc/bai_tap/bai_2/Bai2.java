package ss11_jfc.bai_tap.bai_2;

import java.util.Stack;

public class Bai2 {
    public static void main(String[] args){
        int number =  2;
        Stack<Integer> stack = new Stack<>();
        int n = number;
        while (n>0){
            int newN = n % 2;
            stack.push(newN);
            n = n/2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
    System.out.println("So nhap vao : "+ number +
            "\nChuyen doi qua he nhi phan la :"+ stringBuilder);
    }
}
