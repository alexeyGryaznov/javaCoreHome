package lesson1;

import java.util.Arrays;

public class APPles1 {
    public static void main(String[] args) {

        Team[] SportsMan = new Team[4];
        SportsMan[0] = new Team("Вася", "Бухарик", 30);
        SportsMan[1] = new Team("Ахелес", "Бегун", 20);
        SportsMan[2] = new Team("Ахмед", "Пловец", 25);
        SportsMan[3] = new Team("Дима", "Прыгун", 35);

        Course course1 = new Course(30, 10, 10, 40);
        Course course2 = new Course(20,15,15,30);

        for (int i = 0; i < SportsMan.length; i++) {
            SportsMan[i].info();
        }

        System.out.println();
        System.out.println("course1: " + course1);
        System.out.println("course2: " + course2);
        System.out.println();

        DoItCourse(SportsMan,course1);
        DoItCourse(SportsMan,course2);

    }
    public static void DoItCourse(Team SportsMan[],Course course){
        for (int i = 0; i < SportsMan.length; i++) {
            SportsMan[i].doItCourse(course);
        }
        for (int i = 0; i < SportsMan.length; i++) {
            SportsMan[i].infoStatus();
        }
        System.out.println();
    }


}

