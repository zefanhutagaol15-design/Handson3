public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        int num1 = 25;
        int num2 = 4;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;      // integer division
        int remainder = num1 % num2;     // modulus

        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Pembagian (integer): " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        int intDiv = 17 / 5;
        double floatDiv1 = 17.0 / 5;
        double floatDiv2 = (double) 17 / 5;

        System.out.println("Pembagian Integer (17 / 5): " + intDiv);
        System.out.println("Pembagian Floating-point (17.0 / 5): " + floatDiv1);
        System.out.println("Pembagian dengan casting (double)17 / 5: " + floatDiv2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\n=== KALKULASI PRAKTIS ===");

        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);

        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalHarga = jumlahBarang * hargaBarang * (1 + pajak);

        System.out.printf("Total Harga (3 barang @ $15.99 + 8%% pajak): $%.2f\n", totalHarga);

        int celsius = 25;
        double fahrenheit = (celsius * 9.0 / 5) + 32;
        System.out.println("25°C dalam Fahrenheit: " + fahrenheit + "°F");

        int totalHari = 50;
        int minggu = totalHari / 7;
        int sisaHari = totalHari % 7;
        System.out.println("50 hari = " + minggu + " minggu dan " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;
        System.out.printf("Jarak tempuh (%.2f km/jam × %.2f jam): %.2f km\n", kecepatan, waktu, jarak);

        double pokok = 1000;
        double sukuBunga = 0.05;
        int tahun = 3;
        double jumlahAkhir = pokok * Math.pow((1 + sukuBunga), tahun);
        System.out.printf("Jumlah akhir dengan bunga majemuk: $%.2f\n", jumlahAkhir);

        int nilai1 = 85, nilai2 = 92, nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;
        System.out.printf("Rata-rata nilai ujian: %.2f\n", rataRata);
    }
}
