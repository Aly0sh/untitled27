package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList <phone> phones = new LinkedList<>();
        phones.addAll(Arrays.asList(
                new phone("Huawei Nova 2", 21000),
                new phone("HTC U11", 31000),
                new phone("Xiaomi Mi6", 7000),
                new phone("Samsung Galaxy S8+", 40000),
                new phone("Xiaomi Mi8", 25000),
                new phone("Google Pixel 4a", 29000),
                new phone("Xiaomi Poco X3", 17600),
                new phone("Xiaomi Mi9T", 22000),
                new phone("Samsung Galaxy A9", 19000),
                new phone("Huawei P30 Lite", 15900)
                ));

        LinkedList <pad> pads=new LinkedList<>();
        pads.addAll(Arrays.asList(
                new pad("HUAWEI MediaPad M5 Lite", 15000),
                new pad("Apple iPad (2020)", 26000),
                new pad("HUAWEI MatePad T 10s", 17000),
                new pad("Apple iPad Pro 11", 83000),
                new pad("Microsoft Surface Pro 7 i5", 71000),
                new pad("Samsung Galaxy Tab A7", 17000),
                new pad("HUAWEI MatePad Pro LTE", 38000),
                new pad("Samsung Galaxy Tab A 8.0 SM-T290", 10000),
                new pad("Lenovo Tab M10 Plus TB-X606F", 16000),
                new pad("Samsung Galaxy Tab S7+", 53000)
        ));
        for (pad i: pads){
            i.setDiscount(20);  // назначение скидки для всех планшетов
        }

        int sumWithDiscount=0;
        for (phone i: phones){
            sumWithDiscount+=i.getPrice();
        }
        for (pad i: pads){
            sumWithDiscount+=i.getPrice();
        }

        int sumWithoutDiscount=0;
        for (phone i: phones){
            sumWithoutDiscount+=i.getPreviousPrice();
        }
        for (pad i: pads){
            sumWithoutDiscount+=i.getPreviousPrice();
        }

        System.out.println("Сумма цен плашетов и телефонов со скидкой: "+sumWithDiscount);
        System.out.println("Сумма цен плашетов и телефонов без скидок: "+sumWithoutDiscount);
    }
}
