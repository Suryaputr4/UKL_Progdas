package UKL;

import java.util.Scanner;

public class Diskon {

      public static void main (String[]args) {
            
            Scanner zora = new Scanner (System.in);
            System.out.println("Masukkan harga : ");
            Double harga = zora.nextDouble();
            int total = 0;
            int diskon;

            if (harga <= 100.000) {
                System.out.print ("Kamu tidak dapat Diskon");
            } else if (harga >= 100.000 && harga <= 200.000) {      
                total =(int)(harga/10);
                System.out.print("Diskon kamu 10% dan sebesar : " + total +".000" );
            } else if (harga >= 200.000) {      
                total =(int)(harga/20);
                System.out.print("Diskon kamu 20% dan sebesar : " + total +".000");
      }   
      }
}