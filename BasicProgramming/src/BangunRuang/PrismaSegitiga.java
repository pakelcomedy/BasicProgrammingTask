package BangunRuang;
import java.util.Scanner;

public class PrismaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas segitiga: ");
        double panjangAlasSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();
        double luasAlasSegitiga = (panjangAlasSegitiga * tinggiSegitiga) / 2;
        double kelilingAlasSegitiga = panjangAlasSegitiga + (2 * Math.sqrt(Math.pow(panjangAlasSegitiga / 2, 2) + Math.pow(tinggiSegitiga, 2)));
        double luasPrismaSegitiga = 2 * luasAlasSegitiga + kelilingAlasSegitiga * tinggiPrisma;
        System.out.println("Luas Prisma Segitiga: " + luasPrismaSegitiga);
        input.close();
    }
}