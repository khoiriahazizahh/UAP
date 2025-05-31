package uap.uap.models; 

import uap.uap.bases.Shape;
import uap.uap.interfaces.MassCalculable;
import uap.uap.interfaces.MassConverter;
import uap.uap.interfaces.PiRequired;
import uap.uap.interfaces.ShippingCostCalculator;
import uap.uap.interfaces.ThreeDimensional;

// Class Torus mewakili bentuk donat (torus) dan mengimplementasikan interface
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    
    private final double majorRadius; // Jari-jari utama (jarak dari pusat ke tengah tabung)
    private final double minorRadius; // Jari-jari kecil (radius tabung)

    // Konstruktor default, nilai radius diset ke 0
    public Torus() {
        this.majorRadius = 0;
        this.minorRadius = 0;
    }

    // Konstruktor dengan parameter jari-jari utama dan kecil
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // Menghitung volume torus
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius; // Rumus volume torus
    }

    // Menghitung luas permukaan torus
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius; // Rumus luas permukaan torus
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

    // Menampilkan semua informasi bentuk torus
    @Override
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        System.out.println("Biaya kirim     : Rp" + (int) calculateCost());
    }
}
