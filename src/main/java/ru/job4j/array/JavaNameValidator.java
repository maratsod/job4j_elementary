package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!(name.isEmpty() || Character.isDigit(name.codePointAt(0))
                || Character.isUpperCase(name.codePointAt(0)))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (Character.isDigit(code) || isLowerLatinLetter(code)
                        || isSpecialSymbol(code) || isUpperLatinLetter(code)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
