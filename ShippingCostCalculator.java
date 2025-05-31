package uap.uap.interfaces; 

public interface ShippingCostCalculator {
    int PRICE_PER_KG = 5000;       // Harga per kilogram dalam rupiah
    double calculateCost();        // Method untuk menghitung total biaya pengiriman
}
