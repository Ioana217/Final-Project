package VetShop;

public class Dog extends Animal {
    private String race;
    private String color;

    public Dog(int id, String name, int age, String gender) {
        super(id, name, age,gender);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

