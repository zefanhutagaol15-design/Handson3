public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        int counter = 5;

        System.out.println("Pre-increment (++counter): " + ++counter); // counter jadi 6
        System.out.println("Post-increment (counter++): " + counter++); // tampilkan 6, lalu jadi 7
        System.out.println("Setelah post-increment, counter: " + counter); // 7

        counter = 5;
        System.out.println("Pre-decrement (--counter): " + --counter); // 4
        System.out.println("Post-decrement (counter--): " + counter--); // tampilkan 4, lalu jadi 3
        System.out.println("Setelah post-decrement, counter: " + counter); // 3

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10;
        int b = 10;

        int result1 = ++a; // pre-increment: a jadi 11 dulu, lalu assign ke result1
        System.out.println("a: " + a + ", result1 (dari ++a): " + result1);

        int result2 = b++; // post-increment: assign b ke result2 (10), lalu b jadi 11
        System.out.println("b: " + b + ", result2 (dari b++): " + result2);

        // Komentar:
        // Pre-increment langsung menaikkan nilai sebelum digunakan.
        // Post-increment menggunakan nilai awal, lalu menaikkannya.

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8;
        int y = 8;

        System.out.println("Pre-decrement (--x): " + --x); // x jadi 7 dulu
        System.out.println("Nilai x sekarang: " + x);       // tetap 7

        System.out.println("Post-decrement (y--): " + y--); // tampilkan 8, lalu y jadi 7
        System.out.println("Nilai y sekarang: " + y);       // 7

        // Komentar:
        // Pre-decrement terjadi sebelum nilai digunakan.
        // Post-decrement terjadi setelah nilai digunakan.

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive;
        int backToPositive = -negative;
        int stillPositive = +positive;

        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);
        System.out.println("stillPositive (+positive): " + stillPositive);

        // Unary plus tidak mengubah nilai, hanya menunjukkan tanda positif.

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;

        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady (!isReady): " + isNotReady);

        int angka = 7;
        boolean notZero = !(angka == 0); // true, karena angka != 0
        System.out.println("Apakah angka TIDAK nol? " + notZero);

        boolean doubleNegation = !!isReady;
        System.out.println("!!isReady: " + doubleNegation); // tetap true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int attempts = 0;
        System.out.println("Attempt: " + ++attempts);
        System.out.println("Attempt: " + ++attempts);
        System.out.println("Attempt: " + ++attempts);

        int lives = 3;
        System.out.println("Lives remaining: " + --lives);
        System.out.println("Lives remaining: " + --lives);
        System.out.println("Lives remaining: " + --lives);

        System.out.println("\nLoop increment menggunakan post-increment:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Counter: " + i++);
        }

        System.out.println("\nCountdown menggunakan post-decrement:");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown--);
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int hasil1 = value++ + ++value;
        System.out.println("Hasil value++ + ++value: " + hasil1); // 5 + 7 = 12
        System.out.println("Nilai akhir value: " + value); // 7

        value = 5;
        int hasil2 = --value + value--;
        System.out.println("Hasil --value + value--: " + hasil2); // 4 + 4 = 8
        System.out.println("Nilai akhir value: " + value); // 3

        /*
         * Prediksi:
         * value++ + ++value
         * -> value (5), lalu value jadi 6
         * -> ++value = 7, jadi hasil = 5 + 7 = 12
         * -> nilai akhir = 7
         *
         * --value + value--
         * -> --value = 4
         * -> value-- = 4, lalu value jadi 3
         * -> hasil = 4 + 4 = 8
         */

        int score = 10;
        int max1 = Math.max(++score, 12); // score jadi 11, lalu bandingkan dengan 12 → 12
        System.out.println("Math.max(++score, 12): " + max1);
        System.out.println("Score sekarang: " + score); // 11

        score = 10;
        int max2 = Math.max(score++, 12); // bandingkan 10 dan 12 → 12, lalu score jadi 11
        System.out.println("Math.max(score++, 12): " + max2);
        System.out.println("Score sekarang: " + score); // 11

        /*
         * Perbedaan:
         * - Pre-increment menaikkan score sebelum dibandingkan.
         * - Post-increment membandingkan nilai lama, baru kemudian menaikkannya.
         */
    }
}
