package com.company;

public class Main {

    public static void main(String[] args) {


        Shop<Double, Integer,Double,Integer> shop1 = new Shop<>(" Мой магазинчик: ",9.0,6,12.5,7);
        Shop<Double, Integer,Double,Integer> shop2 = new Shop<>(" Магазинчик соседа: ", 12.2, 5, 8.2, 8);
        Shop<Double, Integer,Double,Integer> shop3 = new Shop<>(" Магазинчик на углу ", 11.0, 5, 9.2, 8);

        System.out.println("Три ларька  продают рис и муку :");

        shop1.countDay(9.0,6,12.5,7);
        shop2.countDay(12.2,5,8.2,8);
        shop3.countDay(11.0,5,9.2,8);
        System.out.println("---------------------------------");

        countDaySosedi(shop1,shop2,shop3);
    }

    public static <T,S>void countDaySosedi(Shop<? , ?,?,? > shop1,
                                      Shop<?, ?, ?, ?> shop2,
                                      Shop<?, ?, ?, ?> shop3) {

        double valueV = shop1.getRice().doubleValue()*shop1.getPriceRice().doubleValue() + shop1.getFlour().doubleValue()*shop1.getPriceFlour().doubleValue()
                      + shop2.getRice().doubleValue()*shop2.getPriceRice().doubleValue() + shop2.getFlour().doubleValue()*shop2.getPriceFlour().doubleValue()
                      + shop3.getRice().doubleValue()*shop3.getPriceRice().doubleValue() + shop3.getFlour().doubleValue()*shop3.getPriceFlour().doubleValue();

        System.out.println("Дневная выручка трех магазинов (рис, мука)= " + valueV + " сом ");
    }

}
