package com.company;

public class Shop<M extends Number, L extends Number,T extends Number,
        S extends Number> implements Countable <T,S, M, L>{
    private String name;
    private T rice;
    private S priceRice;
    private M flour;
    private L priceFlour;

    public  T  getRice() {
        return rice;
    }
    public S getPriceRice() {
        return priceRice;
    }
    public M getFlour() {
        return flour;
    }
     public L getPriceFlour() {
        return priceFlour;
    }

    public String getName() {
        return name;
    }


    public Shop(String name, T rice, S priceRice, M  flour, L priceFlour) {
        this.name = name;
        this.rice = rice;
        this.priceRice = priceRice;
        this.flour = flour;
        this.priceFlour = priceFlour;
    }
    @Override
    public void countDay(T t, S s, M m, L l) {
        double value = getRice().doubleValue()  * getPriceRice().doubleValue()
                     + getFlour().doubleValue() * getPriceFlour().doubleValue();

        System.out.println(" Дневная выручка " + name + " = " + value + " сом ");
    }
}






