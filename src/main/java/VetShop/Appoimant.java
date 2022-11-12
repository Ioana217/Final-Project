package VetShop;

public class Appoimant {
    private int id;
    private String data;
    private String hour;
    private Animal animal;
    private Veterinary veterinary;
    private String description;

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

    public Veterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }
//
    //id
    //data+ora

    //Animalul pentru care este programarea
    //Rezumat probleme ale animalului
    //pt fiecare clasa getter si setter, se creaza obiectele si se insereaza in baza de date , o tabela pt fiecaare
}
