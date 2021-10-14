package lesson4;

import java.util.*;


public class TelBook extends ArrayList {
    private ArrayList<Subscriber> obj;
    private Subscriber m;

    public TelBook(Subscriber... m) {
        for(int i=0;i<m.length;i++){
            super.add(m[i]);
        }
    }

    public void FindSub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя абонента: ");
        String FindName="";
        try {
            FindName = sc.nextLine();
        }
        catch (InputMismatchException e){
            System.out.println("ошибка ввода, еще раз");
        }
        HashMap<String, String> hm= new HashMap<>();
        ListIterator<Subscriber> iter=super.listIterator();
        while (iter.hasNext()){
            m=iter.next();
            hm.put(m.getName(), m.getNumber());//Заменяет значения у ключей. Нужно переопределить метод сравнения ключей
        }
        System.out.println(hm);
        System.out.println(hm.get(FindName));
    }
}


