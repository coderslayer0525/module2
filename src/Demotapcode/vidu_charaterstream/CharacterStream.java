package Demotapcode.vidu_charaterstream;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) {
        String docGhiFile = "vidu.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(docGhiFile))) {
            writer.write("ajinomoto");
            writer.newLine();
            writer.write(" BufferedWriter hello ajnomoto.");
            System.out.println("okela");
        } catch (IOException e) {
            System.out.println("loi ghi file" + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(docGhiFile))) {
            String line;
            System.out.println("doc noi dung filename:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("loi khi doc" + e.getMessage());
        }
    }
}
