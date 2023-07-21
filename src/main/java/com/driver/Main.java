package com.driver;

public class Main {

    public static class Product{

        public static int product(int x, int y) {

        }

        public static int product(int x, int y, int z) {

        }

        public double product(double x, double y) {

        }
    }



    // main method
    public static void main(String args[]){

        Product p = new Product();
        p.product(5,2);
        p.product(5,2,3);
        p.product(5.0,2.0);

    }

}