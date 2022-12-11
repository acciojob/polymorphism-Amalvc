package com.driver;

public class Main {
    public static class Product{
        public static int Product(int x,int y){
            return x+y;
        }
        public static int Product(int x,int y,int z){
            return x+y+z;
        }
        public static double Product(double x,double y){
            return x+y;
        }
    }
    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.Product(4,5));
        System.out.println(p.Product(4,5,8));
        System.out.println(p.Product(4.2,5.3));
    }

}