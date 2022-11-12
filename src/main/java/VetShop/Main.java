package VetShop;

public class Main {
    public static void main(String[] args) {
        Cat cat= new Cat(1356, "Miti", 5, "Female");
        Dog dog= new Dog(1223, "Angelo", 10, "Male");
        Appoimant appoimant = new Appoimant(1213,"12.11.2022", "12:30", cat, "Valentin", "rabies");
        Veterinary veterinary = new Veterinary("Valentin", 2123, "Animal welfare");

cat.setRace("British");
cat.setColor("Gray");
dog.setColor("Black");
dog.setRace("Rottweiler");
    }
}