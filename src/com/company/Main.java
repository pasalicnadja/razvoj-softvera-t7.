package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void funkcija(Function<Double, Double> funk ) {

        for(double i=0;i<100;i++){
            System.out.println(funk.apply(i));
        }




    }

    public static void main(String [] args){
        System.out.println("Zadatak 1");
    funkcija(x -> Math.pow(x,2)+2*x+1);

    System.out.println("Zadatak 2");
        Scanner unos=new Scanner(System.in);
        int s=0;
        s=unos.nextInt();

        Integer niz []= new Integer[s];
        for(int i=0;i<s;i++){
            niz[i]=unos.nextInt();
        }

        Arrays.sort(niz,(a, b) ->suma(a) - suma(b)) ;

        for(int i=0;i<s;i++ ){
            System.out.println(niz[i]+", ");
        }

    }

    private static int suma(Integer a) {
        int suma = 0;
        while(a!=0){
            suma=suma+a%10;
            a=a/10;
        }

        return suma;

    }


}
