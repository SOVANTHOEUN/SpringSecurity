package com.example.demo.utils;

public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String trim(String str) {
        return str.trim();
    }

    public static String concat(String str1, String str2) {
        return str1.concat(str2);
    }

    public static boolean isEmpty(String str) {
        return str.isEmpty();
    }

    public static boolean isBlank(String str) {
        return str.isBlank();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isAlphabetic(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public static boolean isAlphanumeric(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }

    public static boolean isAlphaNumericWithSpace(String str) {
        return str.matches("[a-zA-Z0-9 ]+");
    }

    public static boolean isAlphaNumericWithSpecialCharacter(String str) {
        return str.matches("[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+");
    }

    public static boolean isAlphaNumericWithSpecialCharacterAndSpace(String str) {
        return str.matches("[a-zA-Z0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/? ]+");
    }

    public static boolean isEmail(String str) {
        return str.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public static boolean isPhoneNumber(String str) {
        return str.matches("^\\+(?:[0-9] ?){6,14}[0-9]$");
    }

    public static boolean isUrl(String str) {
        return str.matches("^(http|https)://.*$");
    }

    public static boolean isDate(String str) {
        return str.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    public static boolean isDateTime(String str) {
        return str.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$");
    }

    public static boolean isTime(String str) {
        return str.matches("^\\d{2}:\\d{2}:\\d{2}$");
    }

    public static boolean isIP(String str) {
        return str.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");
    }

    public static boolean isIPv6(String str) {
        return str.matches("^([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})$");
    }

    public static boolean isMACAddress(String str) {
        return str.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
    }

    public static boolean isCreditCardNumber(String str) {
        return str.matches("^4[0-9]{12}(?:[0-9]{3})?$");
    }

    public static boolean isHexadecimal(String str) {
        return str.matches("^[0-9a-fA-F]+$");
    }

    public static boolean isBinary(String str) {
        return str.matches("^[01]+$");
    }

    public static boolean isOctal(String str) {
        return str.matches("^[0-7]+$");
    }

    public static boolean isDecimal(String str) {
        return str.matches("^\\d+$");
    }

    public static boolean isASCII(String str) {
        return str.matches("^\\p{ASCII}+$");
    }

    public static boolean isUnicode(String str) {
        return str.matches("^\\p{IsAlphabetic}+$");
    }

    public static boolean isPrintable(String str) {
        return str.matches("^\\p{Print}+$");
    }
}
