package lesson1;

public class Course{
    private String tupeSport;
    public int run;
    public int jump;
    public int swim;
    public int drink;

    public Course(int run, int jump, int swim, int drink) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
        this.drink = drink;
          }

        @Override
    public String toString(){
        return "Бежать: "+this.run+" Прыгать: "+this.jump+" Плыть: "+this.swim+" Пить: "+this.drink;
    }

}

