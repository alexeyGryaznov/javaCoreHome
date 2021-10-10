package lesson3;

public class Fruit<T>{
    private T obj;
    private double weigtfruit;

    public Fruit(double weigtfruit) {
        this.weigtfruit=weigtfruit;
    }

    public double getWeigtfruit(T obj) {
        return weigtfruit;
    }
}






