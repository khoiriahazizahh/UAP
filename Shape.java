package uap.uap.bases;

public abstract class Shape {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getVolume();
    public abstract double getSurfaceArea();
    public abstract void printInfo();
}
