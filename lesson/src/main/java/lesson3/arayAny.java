package lesson3;

import java.util.Random;

public class arayAny <T extends Object>{
    private T[] massiv;
    private T obj;

    public arayAny(T... massiv) {
        this.massiv = massiv;
    }
    public void changeElement() {
        Random x=new Random();
        int numElFirst= x.nextInt(massiv.length);
        int numElSec=x.nextInt(massiv.length);
        if(numElFirst==numElSec && numElFirst <massiv.length-1)
        {numElSec=numElSec+1;}
        if(numElFirst==numElSec && numElFirst ==massiv.length-1)
        {numElSec=numElSec-1;}
        System.out.println("в массиве размером "+ massiv.length + " меняем эл.номер "+(numElFirst+1)+ " с элементом "+ (numElSec+1)+" местами");
        obj = massiv[numElFirst];
        massiv[numElFirst]=massiv[numElSec];
        massiv[numElSec]=obj;
    }

    public T[] getMassiv() {
        return massiv;
    }
}
