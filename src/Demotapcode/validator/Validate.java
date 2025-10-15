package Demotapcode.validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validate {
    public static boolean isValidNumber(String input) {
        return input.matches("^[0-9]+$");
    }

    public static boolean isValidName(String input) {
        return input.matches("^[A-Za-zÀ-ỹ\\s]+$");
    }

    public static boolean isValidDate(String input) {
        try {
            LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("ngay khong hop le");
        }
    }

    public static boolean isValidEmail(String input) {

        return input.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean isValidPhone(String input) {
        // bat dau = so 0,dai 10 chu so
        return input.matches("^0[0-9]{9}$");
    }

    public static boolean isValidPass(String input) {
        // it nhat 8 ky tu, bao gom, in hoa, thuong,so,ky tu dac biet
        return input.matches("String regexPassword = \"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$\";");
    }

    public static boolean isValidMaThuoc(String input) {
        // ma thuoc nhap theo dinh dang THxxx
        return input.matches("String regexMaThuoc = \"^TH\\\\d{3}$\";");
    }

    public static boolean isValidTime(String input) {
        return input.matches("^([01]\\d|2[0-3]):[0-5]\\d$");
    }
}


