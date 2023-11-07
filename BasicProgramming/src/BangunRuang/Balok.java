package BangunRuang;
import java.util.Scanner;

public class Balok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double luasPermukaan = hitungLuasPermukaan(panjang, lebar, tinggi);
        double volume = hitungVolume(panjang, lebar, tinggi);
        System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
        System.out.println("Volume balok adalah: " + volume);
        input.close();
    }

    public static double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasPermukaan;
    }

    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        return volume;
    }
}