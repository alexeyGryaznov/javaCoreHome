package lesson4;

import java.util.*;

public class APP {
    public static void main(String[] args) {
        String[] firstArr={"One","Two","Free","Two", "Six","Nine","Seven","One"};
        System.out.println("исходный массив: " + Arrays.toString(firstArr));
        FindRepeat(firstArr);
        RemoveRepeat(firstArr);
        Subscriber sub1=new Subscriber("Ivanov","89282034567");
        Subscriber sub2=new Subscriber("Petrov","89065545789");
        Subscriber sub3=new Subscriber("Petrov","89135568543");
        Subscriber sub4=new Subscriber("Vovochkin","89030567901");
        Subscriber sub5=new Subscriber("Petrov","893445678434");
        Subscriber sub6=new Subscriber("Ivanov","891326754325");
        TelBook telBook=new TelBook(sub1,sub2,sub3); //инициализация сразу элементами коллекции
        telBook.add(sub4);//добавление в коллекцию родительским методом add
        telBook.add(sub5);
        telBook.add(sub6);
        System.out.println(telBook);
        System.out.println(telBook.get(2));
        telBook.FindSub();


    }
    public static void FindRepeat (String [] Arr){
        List<String> listfirstArr= new ArrayList<>(Arrays.asList(Arr));
        ListIterator<String> iter=listfirstArr.listIterator();
        int checkReapet=0;
        HashMap<String, Integer> hm= new HashMap<>();
            while (iter.hasNext()){
                String it= iter.next();
                for(int i=0;i<Arr.length; i++){
                if(it.equals(Arr[i])){
                    checkReapet=checkReapet+1;
                }
            }
                hm.put(it, checkReapet);
                checkReapet=0;
        }
        System.out.println(hm);
    }

    public static void RemoveRepeat(String [] Arr){
        Set<String> listfirstArr1= new HashSet<>(Arrays.asList(Arr));
        System.out.println(listfirstArr1);
        }
    }

