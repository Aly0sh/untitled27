package com.company;


public abstract class gadget {// так как переменные одинаковые я решил создать для них общий класс
    private String model;       // модель
    private int price;          // цена
    private int previousPrice;  // предыдущая цена до скидки
    private int discount=0;     // скидка

    gadget (String model, int price) {
        this.model=model;
        this.price=price;
        this.previousPrice=price;
    }

    public int getPrice(){
        return this.price;
    }

    public int getPreviousPrice(){
        return this.previousPrice;
    }

    public void setDiscount(int discount){  // создание скидки
        this.discount=discount;
        float d=this.discount/100f;
        this.price= (int) (this.previousPrice-(this.previousPrice*d));
    }
}
