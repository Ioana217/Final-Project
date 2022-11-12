package VetShop;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "cat")

public class Cat extends Animal {
    private String race;
    private String color;

    public Cat(int id, String name, int age, String gender) {
        super(id, name, age, gender);
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
