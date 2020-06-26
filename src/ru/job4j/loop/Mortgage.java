package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int i = 0;
        while (amount > 0) {
            amount += amount * (percent * 0.01);
            amount = amount - salary;
            year++;
          }
        return year;
        }
    }
