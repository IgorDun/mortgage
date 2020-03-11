package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int priceHome = 1_950_000;
        double firstPaymentPercents = 0.25;
        System.out.println("priceHome = " + priceHome);
        System.out.println("firstPayment = " + firstPaymentPercents);
        double firstPayment = priceHome * firstPaymentPercents;
        System.out.println("firstPayment = " + firstPayment);
    }
}
