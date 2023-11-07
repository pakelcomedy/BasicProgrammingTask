package BangunRuang;
import java.util.Scanner;

public class Bola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();
        double luas = 4 * Math.PI * jariJari * jariJari;
        System.out.println("Luas permukaan bola adalah: " + luas);
        input.close();
    }
}