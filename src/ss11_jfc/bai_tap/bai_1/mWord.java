package ss11_jfc.bai_tap.bai_1;

import java.util.Stack;

public class mWord {
    public static void main(String[] args){
        String input = " Hello CodeGym ";
        Stack<String> wStack = new Stack<>();
        String[] words = input.split(" ");
        for ( int i = 0; i < words.length; i++ ){
            String mWord = words[i];
            wStack.push(mWord);
        }
        StringBuilder out = new StringBuilder();
        while (!wStack.isEmpty()){
            String mWord = wStack.pop();
            out.append(mWord);
        }
        System.out.println("chuoi ban dau :"+ input);
        System.out.println("chuoi dao nguoc :" + out.toString().trim());
    }
}
