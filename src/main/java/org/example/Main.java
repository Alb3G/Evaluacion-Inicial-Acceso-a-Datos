package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        do {
            System.out.println("Escriba el numero inicial (0 para salir):");
            start = sc.nextInt();
            System.out.println("Escriba el numero final:");
            end = sc.nextInt();
            ArrayList<Integer> primeNums = searchPrimeNumbers(start, end);
            System.out.println("Buscando primos...");
            for(int n : primeNums) {
                System.out.println(n);
            }
            System.out.println("Se han encontrado " + primeNums.size() + " números primos");
        } while (start != 0);
    }

    public static ArrayList<Integer> searchPrimeNumbers(int start, int end) {
        ArrayList<Integer> primeNums = new ArrayList<>();
        for(int i = start; i < end; i++) {
            if(checkNum(i)) {
                primeNums.add(i);
            }
        }
        return primeNums;
    }

    public static boolean checkNum(int n) {
        boolean res = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}