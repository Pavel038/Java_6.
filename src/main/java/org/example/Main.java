package org.example;

import ru.netology.sqr.javaqimvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(200, 300));
    }
}
