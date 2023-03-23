package Homework_6;

public class Laptop {
    String NameLaptop;
    String colorLaptop;
    int RAMLaptop;

    @Override
    public String toString() {
        return String.format("NameLaptop: %s, colorLaptop = %s, RAMLaptop = %d", NameLaptop, colorLaptop, RAMLaptop);
    }

    @Override
    public boolean equals(Object obj) {
        Laptop check = (Laptop) obj;
        
        return NameLaptop == check.NameLaptop || colorLaptop == check.colorLaptop || RAMLaptop == check.RAMLaptop;
    }
}
