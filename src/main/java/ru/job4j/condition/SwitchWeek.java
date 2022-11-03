package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "mon";
                break;
            case 2:
                name = "tue";
                break;
            case 3:
                name = "wed";
                break;
            case 4:
                name = "thu";
                break;
            case 5:
                name = "fri";
                break;
            case 6:
                name = "sat";
                break;
            case 7:
                name = "sun";
                break;
            default:
                name = "error";
                break;
        }
        return name;
    }
}
