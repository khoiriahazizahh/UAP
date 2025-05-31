package uap.uap.bases; 

public abstract class Shape {
    // Atribut privat untuk menyimpan nama bentuk
    private String name;

    // Method setter untuk mengatur nama bentuk
    public void setName(String name) {
        this.name = name;
    }

    // Method abstrak untuk menghitung volume
    public abstract double getVolume();

    // Method abstrak untuk menghitung luas permukaan
    public abstract double getSurfaceArea();

    // Method abstrak untuk mencetak informasi bentuk
    public abstract void printInfo();
}

