// Base class
abstract class TaxCategory {
    // Abstract method for VAT calculation
    public abstract double calculateVAT(double amount);
}

// Retailer subclass
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18; // 18% VAT
    }
}

// Wholesaler subclass
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15; // 15% VAT
    }
}

// Importer subclass
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10; // 10% VAT
    }
}

// Main class to demonstrate polymorphism
public class EFRISDemo {
    public static void main(String[] args) {
        // Array of TaxCategory objects
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        // Transaction amounts to test
        double[] amounts = {1000.0, 2000.0, 3000.0};

        // Iterate through taxpayers and amounts, demonstrating polymorphism
        for (TaxCategory taxpayer : taxpayers) {
            System.out.println("\nTaxpayer Category: " + taxpayer.getClass().getSimpleName());
            for (double amount : amounts) {
                double vat = taxpayer.calculateVAT(amount);
                System.out.printf("Amount: $%.2f, VAT: $%.2f%n", amount, vat);
            }
        }
    }
}