package VetShop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data


public  abstract class Animal {
    private int id;
    private String name;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//Id
    //Nume
    //varsta
    //gen(m,f)
    //Descriere( se extinde  la o alta clasa pisoica, caine  si se poate adauga , rasa ...)

}
