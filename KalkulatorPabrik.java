package uap.uap.mains; 

import java.util.Scanner;
import uap.uap.bases.Shape;
import uap.uap.models.Sphere;
import uap.uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input radius

        // Langsung deklarasi nama dan NIM tanpa input user
        String nama = "KHOIRIAH AZIZAH NUR LATFAH"; // Nama Mahasiswa
        String nim = "2451507011111016";           // NIM Mahasiswa

        // Menampilkan header program
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nama: " + nama); // Menampilkan nama
        System.out.println("NIM : " + nim);  // Menampilkan NIM
        System.out.println("=============================================");

        // Input data untuk bentuk donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius luar (major) : ");
        double major = scanner.nextDouble(); // Input jari-jari luar (utama)

        System.out.print("Isikan radius dalam (minor): ");
        double minor = scanner.nextDouble(); // Input jari-jari dalam (kecil)

        // Membuat objek torus dengan radius yang diberikan
        Shape torus = new Torus(major, minor);
        torus.setName("Torus"); // Menetapkan nama bentuk
        System.out.println("=============================================");
        torus.printInfo(); // Menampilkan informasi torus

        // Input data untuk bentuk donat tanpa lubang (Sphere)
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius              : ");
        double r = scanner.nextDouble(); // Input radius bola

        // Membuat objek sphere (bola) dengan radius yang diberikan
        Shape sphere = new Sphere(r);
        sphere.setName("Sphere"); // Menetapkan nama bentuk
        System.out.println("=============================================");
        sphere.printInfo(); // Menampilkan informasi sphere
        System.out.println("=============================================");
    }
}

