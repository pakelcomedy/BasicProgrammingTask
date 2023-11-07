package BangunRuang;
import java.util.Scanner;

public class Kerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari kerucut (r): ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut (h): ");
        double tinggi = input.nextDouble();
        double luasKerucut = hitungLuasKerucut(jariJari, tinggi);

        System.out.println("Luas permukaan kerucut adalah: " + luasKerucut);
    }
    public static double hitungLuasKerucut(double r, double h) {
        double sisiMiring = Math.sqrt(r * r + h * h);
        double luasKerucut = Math.PI * r * (r + sisiMiring);
        return luasKerucut;
    }
}