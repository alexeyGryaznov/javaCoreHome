package lesson2;

import java.util.Arrays;

public class APPles2 {

    public static void main(String[] args) {
        mass Test=new mass(4); //создание объекта класса с размерностью 4
        Test.createMass(); //метод создание массива в классе
        Test.printmass();//печать массива в консоль
        Test.MyArraySizeException();//проверка размерности массива из 4-х элементов
        mass Test2=new mass(5);
        Test2.createMass();
        Test2.printmass();
        Test2.MyArraySizeException();//проверка размерности массива из 5-ти элементов
        mass Test3=new mass(3);
        Test3.createMass();
        Test3.printmass();
        Test3.MyArraySizeException();//проверка размерности массива из 3-х элементов
        mass Test4=new mass(2);
        Test4.writeArr();
        Test4.printmassWriteArr();
        Test4.MyArrayDataException();// проверка введенного вручную массива на тип данных

    }


}
