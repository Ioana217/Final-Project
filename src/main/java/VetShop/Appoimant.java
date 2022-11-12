package VetShop;

public class Appoimant {
    private int id;
    private String data;
    private String hour;
    private Animal animal;
    private String veterinary;
    private String description;

    public Appoimant(int id, String data, String hour, Animal animal, String veterinary, String description) {
        this.id = id;
        this.data = data;
        this.hour = hour;
        this.animal = animal;
        this.veterinary = veterinary;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVeterinary(String veterinary) {
        this.veterinary = veterinary;
    }

    public String getVeterinary() {
        return veterinary;
    }
    }
//
    //id
    //data+ora

    //Animalul pentru care este programarea
    //Rezumat probleme ale animalului
    //pt fiecare clasa getter si setter, se creaza obiectele si se insereaza in baza de date , o tabela pt fiecaare


