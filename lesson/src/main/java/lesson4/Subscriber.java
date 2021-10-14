package lesson4;

public class Subscriber {
    private String name;
    private String number;

    public Subscriber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Фaмилия: " + this.name+ " Тел.: "+ this.number;
    }
}
