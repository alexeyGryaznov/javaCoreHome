package lesson2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class mass {
    private int dem;
    public mass(int dem) {
        this.dem = dem;
    }
    private String[][] test;
    private String[][] testarr;
    private int[][] arrOFint;

    public String[][] createMass() {
        test=new String[dem][dem];
        Random x = new Random();
        for (int i = 0; i < dem; i++) {
            for (int j = 0; j < dem; j++) {
                test[i][j] = String.valueOf(x.nextInt(10));
            }
        }
        return test;
    }

    public void printmass() {
        System.out.println("Массив размерности " + dem);
           for (int i = 0; i < dem; i++) {
           for (int j = 0; j < dem; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
        public void MyArraySizeException(){
        try {
            test=new String[dem-4][4-dem];
            System.out.println("ошибки нет"+" размер массива "+ dem);
        }
        catch (NegativeArraySizeException e){
            System.out.println("ошибка размера =! 4"+" размер массива "+ dem);
        }
    }
    public String[][] writeArr(){
        testarr=new String[dem][dem];
        Scanner sc=new Scanner(System.in);
        System.out.println("введите 2 мерный массив из "+dem+" элементов, посимвольно через Enter");
         for (int i = 0; i < dem; i++) {
             for (int j = 0; j < dem; j++) {
                 try {
                     testarr[i][j] = sc.nextLine();
                 }
                 catch (InputMismatchException e){
                     j--;
                     System.out.println("ошибка ввода, еще раз");
                 }
             }
         }
         return testarr;
            }

    public void printmassWriteArr() {
        System.out.println("Массив размерности " + dem);
        for (int i = 0; i < dem; i++) {
            for (int j = 0; j < dem; j++) {
                System.out.print(testarr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
public void MyArrayDataException() {
    int summ = 0;
    arrOFint=new int[dem][dem];
    for (int i = 0; i < dem; i++) {
        for (int j = 0; j < dem; j++) {
            try {
                arrOFint[i][j] = Integer.parseInt(testarr[i][j]);
                summ=summ+arrOFint[i][j];
            } catch (NumberFormatException e) {
                System.out.println("ошибка приведения формата в столбце " + j + " строке " + i);
            }
        }
    }
    System.out.println("сумма элементов массива = " + summ);
}
}
