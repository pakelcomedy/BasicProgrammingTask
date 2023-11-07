package BangunRuang;
import java.util.Scanner;

public class Tabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double luasTabung = hitungLuasTabung(jariJari, tinggi);

        System.out.println("Luas permukaan tabung adalah: " + luasTabung);

        input.close();
    }

    public static double hitungLuasTabung(double jariJari, double tinggi) {
        double luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        return luasPermukaan;
    }
}
