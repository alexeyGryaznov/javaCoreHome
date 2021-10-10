package lesson3;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        arayAny<Integer> massInt = new arayAny <>(1,2,3,4,5);
        arayAny<String> massStr=new arayAny <>("один","два","три","четыре","пять");
        System.out.println("стартовый массив: "+Arrays.toString(massInt.getMassiv()));
        massInt.changeElement();
        System.out.println("измененный массив: "+Arrays.toString(massInt.getMassiv()));
        System.out.println("стартовый массив: "+Arrays.toString(massStr.getMassiv()));
        massStr.changeElement();
        System.out.println("измененный массив: "+Arrays.toString(massStr.getMassiv()));
        Apple apple=new Apple(0.3);
        Orange orange=new Orange(0.6);
        Box <Apple>Box1=new Box(apple,2);
        Box<Orange>Box2=new Box(orange,4);
        Box<Orange>Box3=new Box(orange,2);
        Box<Apple>Box4=new Box(apple,4);
        Box1.getWeight();
        Box2.getWeight();
        Box1.compare(Box2);
        Box3.compare(Box4);
        Box1.changeBox(Box4);
        Box2.changeBox(Box3);
        Box1.changeBox(Box2);



    }
}
