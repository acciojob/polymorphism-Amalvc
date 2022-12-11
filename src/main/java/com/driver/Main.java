package com.driver;

public class Main {
    public static class product{
        public static int product(int x,int y){
            return x+y;
        }
        public static int product(int x,int y,int z){
            return x+y+z;
        }
        public static double product(double x,double y){
            return x+y;
        }
    }
    public static void main(String[] args) {
        product p=new product();
        System.out.println(p.product(4,5));
        System.out.println(p.product(4,5,8));
        System.out.println(p.product(4.2,5.3));
    }

}