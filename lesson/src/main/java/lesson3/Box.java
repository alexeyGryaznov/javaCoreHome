package lesson3;

import javafx.beans.value.ObservableDoubleValue;

public class Box <T extends Fruit> {
    private T obj;
    private int num;
    private double boxWeight;

    public Box(T obj,int num) {
        this.num=num;
        this.obj = obj;
    }
        public T getObj() {
        return obj;
    }
    public double getWeight(){
        if(getObj().getClass() ==Apple.class){
            boxWeight=getObj().getWeigtfruit(this.obj)*num;
        }
        if (getObj().getClass() == Orange.class){
            boxWeight=getObj().getWeigtfruit(this.obj)*num;
        }
        System.out.println("вес коробки с " + getObj().getClass().getSimpleName()+" = " +boxWeight);
        return boxWeight;
    }
    public void compare(Box<?> obj){
        boolean comp=Math.abs(this.getWeight()- obj.getWeight())<0.001;
        System.out.println("сравниваем коробку с "+getObj().getClass().getSimpleName()+" и "+obj.getObj().getClass().getSimpleName());
        System.out.println(comp);
    }
    public void changeBox(Box<?> box){
        if (getObj().getClass() == box.getObj().getClass()){
            System.out.println("в коробках одинаковое содержимое добавляем");
            this.num=this.num+box.num;
            box.num=0;
            System.out.println("Вес первой коробки "+ this.getWeight()+" Вес второй коробки "+box.getWeight());
        }else {
            System.out.println("в коробках разное содержимое");
            //Думал как сменить класс у объекта. Была идея только с перезаписью объектов, типа как приведение типов у массивов

        }
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}