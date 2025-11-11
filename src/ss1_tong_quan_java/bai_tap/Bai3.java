package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập cân nặng : ");
        double weight = Double.parseDouble(scanner.nextLine());

        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI: " + bmi);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Chiu");
        } else if (number >= 0 && number < 10) {
            switch (number) {
                case 0: System.out.println("không"); break;
                case 1: System.out.println("một"); break;
                case 2: System.out.println("hai"); break;
                case 3: System.out.println("ba"); break;
                case 4: System.out.println("bốn"); break;
                case 5: System.out.println("năm"); break;
                case 6: System.out.println("sáu"); break;
                case 7: System.out.println("bảy"); break;
                case 8: System.out.println("tám"); break;
                case 9: System.out.println("chín"); break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int tensUnits = number % 100;
            int tens = tensUnits / 10;
            int units = tensUnits % 10;

            String result = "";

            switch (hundreds) {
                case 1: result += "one hundred"; break;
                case 2: result += "two hundred"; break;
                case 3: result += "three hundred"; break;
                case 4: result += "four hundred"; break;
                case 5: result += "five hundred"; break;
                case 6: result += "six hundred"; break;
                case 7: result += "seven hundred"; break;
                case 8: result += "eight hundred"; break;
                case 9: result += "nine hundred"; break;
            }

            if (tensUnits != 0) {
                result += " ";
                if (tensUnits < 10) {
                    // Đơn vị 1 chữ số
                    switch (units) {
                        case 1: result += "one"; break;
                        case 2: result += "two"; break;
                        case 3: result += "three"; break;
                        case 4: result += "four"; break;
                        case 5: result += "five"; break;
                        case 6: result += "six"; break;
                        case 7: result += "seven"; break;
                        case 8: result += "eight"; break;
                        case 9: result += "nine"; break;
                    }
                } else if (tensUnits < 20) {
                    switch (tensUnits) {
                        case 10: result += "ten"; break;
                        case 11: result += "eleven"; break;
                        case 12: result += "twelve"; break;
                        case 13: result += "thirteen"; break;
                        case 14: result += "fourteen"; break;
                        case 15: result += "fifteen"; break;
                        case 16: result += "sixteen"; break;
                        case 17: result += "seventeen"; break;
                        case 18: result += "eighteen"; break;
                        case 19: result += "nineteen"; break;
                    }
                } else {
                    switch (tens) {
                        case 2: result += "twenty"; break;
                        case 3: result += "thirty"; break;
                        case 4: result += "forty"; break;
                        case 5: result += "fifty"; break;
                        case 6: result += "sixty"; break;
                        case 7: result += "seventy"; break;
                        case 8: result += "eighty"; break;
                        case 9: result += "ninety"; break;
                    }

                    if (units != 0) {
                        result += " ";
                        switch (units) {
                            case 1: result += "one"; break;
                            case 2: result += "two"; break;
                            case 3: result += "three"; break;
                            case 4: result += "four"; break;
                            case 5: result += "five"; break;
                            case 6: result += "six"; break;
                            case 7: result += "seven"; break;
                            case 8: result += "eight"; break;
                            case 9: result += "nine"; break;
                        }
                    }
                }
            }

            System.out.println(result);
        } else {
            System.out.println("one write, bug every where");
        }

        scanner.close();
    }
}