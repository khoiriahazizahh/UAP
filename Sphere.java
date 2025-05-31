package uap.uap.models;

import uap.uap.bases.Shape;
import uap.uap.interfaces.MassCalculable;
import uap.uap.interfaces.MassConverter;
import uap.uap.interfaces.PiRequired;
import uap.uap.interfaces.ShippingCostCalculator;
import uap.uap.interfaces.ThreeDimensional;

// Class Sphere mewakili bentuk bola, dan mengimplementasikan berbagai interface
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    
    private final double radius; // Radius bola (jari-jari)

    // Konstruktor default, radius diset ke 0
    public Sphere() {
        this.radius = 0;
    }

    // Konstruktor dengan parameter radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Menghitung volume bola
    @Override
    public double getVolume() {
        return 4.0 / 3.0 * PI * Math.pow(radius, 3); // Rumus volume bola: (4/3)πr³
    }

    // Menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius; // Rumus luas permukaan bola: 4πr²
    }

    // Menghitung massa berdasarkan luas permukaan dan ketebalan
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // Konversi massa dari gram ke kilogram
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Menghitung biaya pengiriman berdasarkan berat dalam kg
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // Dibulatkan ke atas
    }

    // Menampilkan semua informasi bentuk bola
    @Override
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        System.out.println("Biaya kirim     : Rp" + (int) calculateCost());
    }
}

