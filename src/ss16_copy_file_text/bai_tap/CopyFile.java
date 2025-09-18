package ss16_copy_file_text.bai_tap;

import java.io.*;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập  file nguồn: ");
        String sourcePath = scanner.nextLine();


        System.out.print("Nhập  file đích: ");
        String targetPath = scanner.nextLine();


        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println(" File nguồn không tồn tại!");

        }


        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại!");
            return;
        }


        try (

                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);


                FileWriter fw = new FileWriter(targetFile);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            int count = 0;
            while ((line = br.readLine())!= null){
                bw.write(line);
                count = count  + line.length();
            }


            System.out.println(" Đã sao chép xong. Tổng số ký tự: " + count);

        } catch (IOException e) {
            System.out.println(" Có lỗi khi sao chép: " + e.getMessage());
        }
    }
}