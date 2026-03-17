package com.gla.Polymorphism;

public class Runner {
    public static void main(String args[]){
        Calculator C1=new Calculator();
        int Sum1 =C1.add(11,12);
        System.out.println("Sum of Integer"+Sum1);
        double Sum2 =C1.add(111.222,111.2233);
        System.out.println("Sum of double"+Sum2);
    }
}
