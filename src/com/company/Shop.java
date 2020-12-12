package com.company;

public class  Shop <T extends Number, S extends Number>implements Countable {

    private S brad;
    private T priceBrad;
    private S milk;
    private T priceMilk;

    public S getBrad() {
        return brad;
    }

    public T getPriceBrad() {
        return priceBrad;
    }

    public S getMilk() {
        return milk;
    }

    public T getPriceMilk() {
        return priceMilk;
    }

    public Shop (S brad,T priceBrad, S milk, T priceMilk){
        this.brad=brad;
        this.priceBrad=priceBrad;
        this.milk=milk;
        this.priceMilk=priceMilk;

    }
    public void countDay(){
        double result = getBrad().doubleValue()*getPriceBrad().doubleValue()
                +getMilk().doubleValue()*getPriceMilk().doubleValue();
        System.out.println("Моя дневная выручка  = "+result);
    }

    @Override
    public static void countDaySosedi() {

    }


}
