package com.grosfiler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task: ");
        int i = scanner.nextInt();

        switch (i){
            case 1: task1();
                break;
            case 2: task2();
                break;
            case 3: task3();
                break;
            case 4: task4();
                break;
            case 5: task5();
                break;
            case 6: task6();
                break;
            case 7: task7();
                break;
            case 8: task8();
                break;
            case 9: task9();
                break;
            case 10: task10();
                break;
            case 11: task11();
                break;
        }
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter h:");
        double h = scanner.nextDouble();

        System.out.println("a)");
        for (double x = a; x <= b; x+=h){
            double fX = x - Math.sin(x);
            System.out.println("x = " + x + "     F(x) = " + fX);
        }

        System.out.println("b)");
        for (double x = a; x <= b; x+=h){
            double fX = Math.pow(Math.sin(x), 2);
            System.out.println("x = " + x + "     F(x) = " + fX);
        }

        System.out.println("c)");
        for (double x = a; x <= b; x+=h){
            double fX = 2 * Math.cos(x) - 1;
            System.out.println("x = " + x + "     F(x) = " + fX);
        }

    }

    private static void task2() {
        final int A = 3;
        final int B = -5;

        for (double x = 1; x <= 5; x+=0.5) {
            double y = A * Math.pow(x, 2) + B;
            System.out.println("x = " + x + "     y = " + y);
        }
    }

    private static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int n = scan.nextInt();
        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("Enter number b: ");
        int b = scan.nextInt();

        int count = 0;

        while (n > 0) {
            if (n % 10 == a)
                count++;
            else if (n % 10 == b)
                count--;
            n/=10;
        }

        if (count < 0)
            System.out.println(a +" is less common");
        else
            System.out.println(b +" is less common");
    }

    private static void task4() {
        Scanner scan = new Scanner(System.in);

        double x = 0;
        double numerator = 0;
        double denominator = 1;
        double z = 0;
        final int N = 20;
        for (int i = 1; i <= 20; i++) {
            denominator = 1;
            System.out.println("Enter x of index " + i);
            x = scan.nextInt();
            for (int k = 1; k <= N; k++) {
                numerator = Math.pow(x , k);
                denominator *=  k;
                z += numerator/denominator;
            }
        }
        System.out.println("z = " + z);
    }

    private static void task5() {
        Scanner scan = new Scanner(System.in);

        double x = 0;
        double numerator = 0;
        double denominator = 1;
        double z = 0;

        for (int i = 1; i <= 15 ; i++) {
            System.out.println("Enter x of index " + i);
            x = scan.nextInt();
            numerator = i + x;
            denominator *= i;
            z += numerator/denominator;
        }
        System.out.println("z = " + z);
    }

    private static void task6() {

        for (int x = 1; x <= 30; x++) {
            for (int y = x; y <= 30; y++) {
                for (int k = 1; k <= 30; k++) {
                    if ( Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(k, 2)) {
                        System.out.println( x + "^2 + " + y + "^2 = " + k + "^2");
                    }
                }
            }
        }
    }

    private static void task7() {
        int count = 1;
        for (int i = 100; count <= 15; i++) {
            if( i % 19 == 0){
                System.out.println(count + ": " + i);
                count++;
            }
        }
    }

    private static void task8() {
        int count = 1;
        for (int i = 500; count <= 20; i++) {
            if( i % 13 == 0 || i % 17 == 0){
                System.out.println(count + ": " + i);
                count++;
            }
        }
    }

    private static void task9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter z:");
        int z = scan.nextInt();

        int a = 2;
        int b = 4;
        int progressionValue = a;
        int count;
        int sum = 0;
        for (count = 1; sum < z; count++) {
            progressionValue += b;
            sum += progressionValue;
        }

        System.out.println("Required number of summations: " + count);
        System.out.println("Sum total: " + sum);
        System.out.println("Last added value: " + progressionValue);
    }

    private static void task10() {
        int a = 1;
        int b = 4;
        int progressionValue = a;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += progressionValue;
            System.out.print(progressionValue);
            if (i != 10){
                System.out.print(" + ");
            }
            progressionValue += b;
        }
        System.out.println(" = " + sum);
    }

    private static void task11() {
        final int N = 5;
        System.out.println("прямоугольник:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        System.out.println("прямоугольный треугольник:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println("равносторонний треугольник:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                System.out.print(i == N - 1 || i == N - 1 - j || i == -(N - 1 - j) ? '*' : ' ');
            }
            System.out.println("");
        }

        System.out.println("ромб:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(j == N/2 + i || j == N/2 - i || j == i - N/2 || j == N - i + N/2 -1 ? '*' : ' ');
            }
            System.out.println("");
        }
    }

}
