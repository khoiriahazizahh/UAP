package uap.uap.interfaces; 

public interface MassCalculable {
    
    int DENSITY = 8;           // Konstanta DENSITY (massa jenis), diasumsikan 8 g/cm^2
    double THICKNESS = 0.5;    // Konstanta ketebalan material dalam cm, diasumsikan 0.5 cm

    double getMass();          // Method abstrak untuk menghitung massa, akan diimplementasikan oleh class lain
}

