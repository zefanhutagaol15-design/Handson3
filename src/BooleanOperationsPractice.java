public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: AND (&&)
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel? " + canAccessAdmin);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: OR (||)
        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Apakah hari libur? " + isDayOff);

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: NOT (!)
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("Apakah cerah? " + isSunny);
        System.out.println("Double negasi (!(!isRaining)) = " + (!(!isRaining)));
        System.out.println("!(5 > 3) = " + !(5 > 3)); // false karena 5 > 3 adalah true, dan dibalik jadi false

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        boolean needsImprovement = !attendanceGood || !behaviorGood;

        System.out.println("Siswa Outstanding? " + isOutstanding);
        System.out.println("Siswa Memuaskan? " + isSatisfactory);
        System.out.println("Perlu Perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean accessDenied = !(normalAccess || emergencyAccess);

        System.out.println("Akses normal diberikan? " + normalAccess);
        System.out.println("Akses darurat diberikan? " + emergencyAccess);
        System.out.println("Akses ditolak? " + accessDenied);

        // Latihan 6: Keputusan berdasarkan cuaca
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        boolean roadsMayBeDangerous = isSnowing || (isRaining && temperature < 5);

        System.out.println("Cuaca bagus untuk outdoor? " + goodWeather);
        System.out.println("Perlu payung? " + needUmbrella);
        System.out.println("Jalan mungkin berbahaya? " + roadsMayBeDangerous);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        int a = 5;
        int b = 0;

        // Latihan 7:
        // (b != 0) && (a / b > 2)
        boolean safeDivision = (b != 0) && (a / b > 2); // Tidak menyebabkan error karena (b != 0) adalah false
        System.out.println("Safe AND division (b != 0 && a/b > 2): " + safeDivision);

        // (b == 0) || (a / b > 2)
        boolean skipDivision = (b == 0) || (a / b > 2); // Tidak menyebabkan error karena (b == 0) adalah true
        System.out.println("Safe OR division (b == 0 || a/b > 2): " + skipDivision);

        // Kedua ekspresi di atas AMAN karena Java menggunakan short-circuit evaluation,
        // artinya bagian kanan tidak dievaluasi jika bagian kiri sudah menentukan hasil akhir.

        // Latihan 8: Simulasi short-circuit dengan method
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        // Simulasi AND short-circuit
        boolean result1 = expensiveCheck1 && simulateExpensiveCheck("Check 2 (AND)");
        // Karena expensiveCheck1 == false, simulateExpensiveCheck tidak dipanggil
        System.out.println("Hasil AND short-circuit: " + result1);

        // Simulasi OR short-circuit
        boolean result2 = expensiveCheck2 || simulateExpensiveCheck("Check 1 (OR)");
        // Karena expensiveCheck2 == true, simulateExpensiveCheck tidak dipanggil
        System.out.println("Hasil OR short-circuit: " + result2);
    }

    // Method simulasi operasi mahal
    public static boolean simulateExpensiveCheck(String label) {
        System.out.println("Menjalankan: " + label);
        return true;
    }
}
