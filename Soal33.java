package UKL;

public class Soal33 {
      public static void main(String[] args) {
            int[] elemen = {3, 7, 3, 1, 7, 7, 5};
            int Elemen = elemen[0];
            int JumlahMaksimal = 1;
    
            for (int i = 0; i < elemen.length; i++) {
                int count = 1;
                for (int j = i + 1; j < elemen.length; j++) {
                    if (elemen[i] == elemen[j]) {
                        count++;
                    }
                }
                if (count > JumlahMaksimal) {
                    Elemen = elemen[i];
                    JumlahMaksimal = count;
                }
            }
            System.out.println("Elemen yang paling sering muncul adalah " + Elemen + " sebanyak " + JumlahMaksimal + " kali");
        }
      
}
