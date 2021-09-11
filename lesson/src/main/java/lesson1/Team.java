package lesson1;

public class Team {
    private String Name;
    public String TupeSport;
    int age;
    int kage;
    int propertyRun;
    int propertyJump;
    int propertySwim;
    int propertyDrink;
    private int run;
    private int jump;
    private int swim;
    private int drink;

    public Team(String name, String tupeSport, int age) {
        this.Name = name;
        this.TupeSport = tupeSport;
        this.age = age;
        checkTupe();
    }
    public void checkTupe(){
        if(TupeSport.equals("Бегун")){
                propertyRun=100;
                propertyJump=70;
                propertySwim=50;
                propertyDrink=60;
            }
            if(TupeSport.equals("Прыгун")){
                 propertyRun = 70;
                 propertyJump = 100;
                 propertySwim = 60;
                 propertyDrink = 40;
        }
        if(TupeSport.equals("Пловец")){
            propertyRun = 80;
            propertyJump = 40;
            propertySwim = 100;
            propertyDrink = 70;
        }
        if(TupeSport.equals("Бухарик")){
            propertyRun = 50;
            propertyJump = 20;
            propertySwim = 30;
            propertyDrink = 120;
        }
    }

    public void doItCourse(Course c){
        this.kage = age/4;//поправочное значение дял не проф. препятствий
        if (TupeSport.equals("Бегун")){
            run=propertyRun-c.run;
            jump=propertyJump-c.jump-kage;
            swim=propertySwim-c.swim-kage;
            drink=propertyDrink-c.drink-kage;
        }
        if (TupeSport.equals("Прыгун")){
            run=propertyRun-c.run-kage;
            jump=propertyJump-c.jump;
            swim=propertySwim-c.swim-kage;
            drink=propertyDrink-c.drink-kage;
        }
        if (TupeSport.equals("Пловец")){
            run=propertyRun-c.run-kage;
            jump=propertyJump-c.jump-kage;
            swim=propertySwim-c.swim;
            drink=propertyDrink-c.drink-kage;
        }
        if (TupeSport.equals("Бухарик")){
            run=propertyRun-c.run-kage;
            jump=propertyJump-c.jump-kage;
            swim=propertySwim-c.swim-kage;
            drink=propertyDrink-c.drink;
        }
    }
    public void info(){
        System.out.println("имя: "+this.Name+" тип: "+this.TupeSport+" возраст: "+this.age+" Свойства: "+"Бег: "+this.propertyRun+" прыжки: "+this.propertyJump+" Плавание: "+this.propertySwim+" Выпивка: "+this.propertyDrink);
    }
    public void infoStatus() {
        if (run <= 0)
            System.out.println(this.TupeSport + " " + this.Name + " выбыл на этапе бег" + " не добежал: " + this.run + " поправка на возраст:" + kage);
        if (jump <= 0)
            System.out.println(this.TupeSport + " " + this.Name + " выбыл на этапе прыжков" + " не допрыгнул: " + this.jump + " поправка на возраст:" + kage);
        if (swim <= 0)
            System.out.println(this.TupeSport + " " + this.Name + " выбыл на этапе плавания" + " не доплыл: " + this.swim + " поправка на возраст:" + kage);
        if (drink <= 0)
            System.out.println(this.TupeSport + " " + this.Name + " выбыл на этапе празднования" + " не добухал: " + this.drink + " поправка на возраст:" + kage);
        if (run>0&&jump>0&&swim>0&&drink>0) {
            System.out.println(this.TupeSport + " " + this.Name + " прошел полосу c результатом(ост. энергии) Бег: " + this.run + " Прыжки: " + this.jump + " Плавание: " + this.swim + " Выпивка: " + this.drink + " поправка на возраст:" + kage);
        }
    }

    }


