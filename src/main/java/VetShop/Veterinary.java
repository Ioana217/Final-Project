package VetShop;

public class Veterinary {
    private String name;
    private int id;
    private String specialization;

    public Veterinary(String name, int id, String specialization) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //Nume = Valentin
    //Id
    //Specializare(doar caini, pisici)
}
