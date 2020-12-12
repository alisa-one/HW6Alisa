package com.company;

public class Main {

    public static void main(String[] args) {


        Shop<Double, Integer> My_shop = new Shop(8.6, 6, 5.5, 10);
        Shop<Double, Integer> Sosed_shop = new Shop(12.2, 5, 8.2, 8);
        System.out.println("Два ларька ( я и сосед) продаем хлеб и молоко :");

        My_shop.countDay();
        Shop.countDaySosedi();


        private static void countDaySosedi () (Shop < Double, Integer > My_shop, Shop < Double, Integer > Sosed_shop){

            double resultM = My_shop.getBrad().doubleValue() * My_shop.getPriceBrad().doubleValue() +
                             My_shop.getMilk().doubleValue() * My_shop.getPriceMilk().doubleValue() +

                    Sosed_shop.getBrad().doubleValue() * Sosed_shop.getPriceBrad().doubleValue() +
                    Sosed_shop.getMilk().doubleValue() * Sosed_shop.getPriceMilk().doubleValue();


            System.out.println("Дневная выручка соседей = " + resultM);
        }
    }


}
