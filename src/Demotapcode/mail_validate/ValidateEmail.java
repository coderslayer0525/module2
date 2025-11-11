package Demotapcode.mail_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    private static final String EMAIL_TEXT ="^[A-Z][A-Za-z0-9_]{5,31}@[A-Za-z0-9]{2,12}\\.[A-Za-z0-9]{2,12}$";
    private static final Pattern EMAIL_BACK = Pattern.compile(EMAIL_TEXT);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap Email vao day Viet hoa Chu cai dau:(vidu: Nguyenvana94@gmail.com hoac NguyenVanA94@gmail.com");
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("vui long khong duoc de trong");
                continue;
            }
            String[] email = line.split("[,;]");
            boolean checkInputEmail = false;
            for (String Email : email) {
                String e = Email.trim();
                if (e.isEmpty()) continue;
                if (!validateEmail(e)) {
                    System.out.println("nhap sai dinh dang" + e);
                    checkInputEmail = true;
                } else {
                    System.out.println("Email dung dinh dang" + e);
                }
            }
            if (!checkInputEmail) {
                System.out.println("Email da nhap dung");
                break;
            } else {
                System.out.println("Nhap lai Email");
            }
        }
    }

    public static boolean validateEmail(String mail) {
        Matcher matcher = EMAIL_BACK.matcher(mail);
        return matcher.matches();
    }
}
