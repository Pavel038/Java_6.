package ru.netology.sqr.javaqimvn.services;

public class SQRService {
    public int calcSqrt(int lowerValue, int upperValue) {
        int r = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerValue && i * i <= upperValue) {
                r++;
            }
        }
        return r;
    }
}






