public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        int firstNum = 25;
        int secondNum = 18;

        System.out.println("firstNum > secondNum: " + (firstNum > secondNum));
        System.out.println("firstNum < secondNum: " + (firstNum < secondNum));
        System.out.println("firstNum >= secondNum: " + (firstNum >= secondNum));
        System.out.println("firstNum <= secondNum: " + (firstNum <= secondNum));
        System.out.println("firstNum == secondNum: " + (firstNum == secondNum));
        System.out.println("firstNum != secondNum: " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        double price1 = 19.99;
        double price2 = 20.0;

        System.out.println("price1 < price2: " + (price1 < price2));
        System.out.println("price1 > price2: " + (price1 > price2));
        System.out.println("Selisih harga < 1.0: " + (Math.abs(price1 - price2) < 1.0));

        double fp1 = 0.1 + 0.2;
        double fp2 = 0.3;
        System.out.println("0.1 + 0.2 == 0.3? " + (fp1 == fp2));
        System.out.println("Tapi nilai 0.1 + 0.2: " + fp1 + " | 0.3: " + fp2);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        char letter1 = 'A';
        char letter2 = 'B';

        System.out.println("letter1 < letter2: " + (letter1 < letter2)); // 'A' < 'B'
        System.out.println("'a' > 'A': " + ('a' > 'A')); // huruf kecil punya nilai ASCII lebih besar
        char digit = '5';
        System.out.println("Apakah '5' adalah digit? " + (digit >= '0' && digit <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        String name1 = "Java";
        String name2 = "Java";
        System.out.println("name1 == name2: " + (name1 == name2)); // true, karena interning

        String name3 = new String("Java");
        System.out.println("name1 == name3: " + (name1 == name3)); // false, beda referensi
        System.out.println("name1.equals(name3): " + name1.equals(name3)); // true, isi sama

        System.out.println("\"Java\".equals(\"java\"): " + name1.equals("java")); // case-sensitive
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + name1.equalsIgnoreCase("java"));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;

        System.out.println("Siswa lulus? " + (grade >= passingGrade));
        System.out.println("Siswa masuk honor roll? " + (grade >= honorRoll));

        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;

        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum alkohol? " + (age >= drinkingAge));

        // ===== DISKON =====
        System.out.println("\n=== DISKON DAN BELANJA ===");

        double originalPrice = 100;
        double discountThreshold = 50;
        int customerAge = 65;
        int seniorAge = 60;

        boolean isBulkDiscount = originalPrice > discountThreshold;
        boolean isSeniorDiscount = customerAge >= seniorAge;

        System.out.println("Diskon bulk? " + isBulkDiscount);
        System.out.println("Diskon senior? " + isSeniorDiscount);
        System.out.println("Diskon akhir tersedia? " + (isBulkDiscount || isSeniorDiscount));

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        int score = 100;

        System.out.println("Skor valid (0-100)? " + (score >= 0 && score <= 100));

        // Uji nilai batas
        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        // Rentang suhu
        int temp = 25;
        System.out.println("Suhu valid (-10 s.d 40)? " + (temp >= -10 && temp <= 40));

        // ===== RANTAI PERBANDINGAN DAN SKOR =====
        System.out.println("\n=== KONDISI KOMPLEKS DAN PENILAIAN ===");

        int height = 175;
        int minHeight = 160;
        int maxHeight = 200;
        System.out.println("Tinggi dalam rentang? " + (height >= minHeight && height <= maxHeight));

        // Sistem penilaian
        int studentScore = 73;
        String gradeLetter;
        if (studentScore >= 90) {
            gradeLetter = "A";
        } else if (studentScore >= 80) {
            gradeLetter = "B";
        } else if (studentScore >= 70) {
            gradeLetter = "C";
        } else if (studentScore >= 60) {
            gradeLetter = "D";
        } else {
            gradeLetter = "F";
        }
        System.out.println("Nilai huruf: " + gradeLetter);
    }
}
