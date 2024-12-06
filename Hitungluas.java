package UKL;

import java.util.Scanner;

public class Hitungluas {
        public static void main(String[] args) {
        double pi = 3.14;
        int HasilLingkar = 0;
        
        Scanner zora = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        int radius = zora.nextInt();
        HasilLingkar += 4 * pi * radius * radius;
        System.out.println("Luas permukaan bola : 4 * " + pi + " * " + radius + " * " + radius );
        System.out.println("Luas permukaan lingkaran adalah : " + HasilLingkar );
    }
      
}