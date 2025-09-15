public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Augmented Assignments
         */

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        int score = 100;

        score += 25;
        System.out.println("Score setelah += 25: " + score); // 125

        score -= 15;
        System.out.println("Score setelah -= 15: " + score); // 110

        score *= 2;
        System.out.println("Score setelah *= 2: " + score); // 220

        score /= 4;
        System.out.println("Score setelah /= 4: " + score); // 55

        score %= 10;
        System.out.println("Score setelah %= 10: " + score); // 5

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        int value1 = 50;
        int value2 = 50;

        value1 = value1 + 30;
        value2 += 30;

        System.out.println("value1 (regular): " + value1); // 80
        System.out.println("value2 (augmented): " + value2); // 80

        value1 = 80;
        value2 = 80;

        value1 = value1 * 3;
        value2 *= 3;

        System.out.println("value1 * 3: " + value1); // 240
        System.out.println("value2 *= 3: " + value2); // 240

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        double bankBalance = 1000;

        bankBalance += 250; // Deposit
        bankBalance -= 75;  // Penarikan
        bankBalance *= 1.05; // Bunga 5%

        System.out.printf("Saldo akhir bank: $%.2f\n", bankBalance);

        int totalSales = 0;
        totalSales += 150;
        totalSales += 200;
        totalSales += 175;

        int productionCount = 1000;
        productionCount -= 25; // Barang cacat
        productionCount *= 1.1; // Bonus produksi (10%)

        System.out.println("Total Sales (3 hari): " + totalSales); // 525
        System.out.println("Production Count akhir: " + productionCount); // 1072

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        double temperature = 20.5;
        temperature += 5.7;       // Tambah suhu
        temperature *= 1.8;       // Celsius ke Fahrenheit (×1.8)
        temperature += 32;        // Tambah 32

        System.out.printf("Suhu dalam Fahrenheit: %.2f°F\n", temperature);

        String message = "Hello";
        message += " World";
        message += "!";
        System.out.println("Pesan: " + message); // Hello World!

        double investment = 5000;
        investment *= 1.07; // Tahun 1
        investment *= 1.07; // Tahun 2
        investment *= 1.07; // Tahun 3

        System.out.printf("Nilai investasi akhir: $%.2f\n", investment);

        double profit = investment - 5000;
        System.out.printf("Profit setelah 3 tahun: $%.2f\n", profit);
    }
}
