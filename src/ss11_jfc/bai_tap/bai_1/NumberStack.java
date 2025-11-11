package ss11_jfc.bai_tap.bai_1;

import java.util.Stack;

public class NumberStack {
    public static void  main(String[] args){
        int[] a = { 1,2,3,4};
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i< n; i++){
            stack.push(a[i]);
        }
        for (int i = 0; i < n; i++) {
            a[i]= stack.pop();
        }
        System.out.println("mang sau khi dao");
        for(int i = 0; i < a.length; i++){
            int x = a[i];
            System.out.println(x +" ");
        }
    }
}
