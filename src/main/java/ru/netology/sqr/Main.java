package ru.netology.sqr;
public class Main {

    public static void main(String[] args) {

     // int min = 200;
     // int max = 300;
SQRService service = new SQRService();
int expected = 3;
int actual = service.calcSqrt(200, 300);
        System.out.println("1. " + expected + " == ? == " + actual);

    }
}
