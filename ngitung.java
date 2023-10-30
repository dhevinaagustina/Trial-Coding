import java.util.Scanner;
public class ngitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, tinggi = 0 , totalMahasiswa ; 
        double rataRata, jumlahTinggi = 0;
        String namaMahasiswa;
        
        System.out.println("Menghitung Tinggi Rata-Rata Mahasiswa");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan total mahasiswa yang akan dihitung: ");
        totalMahasiswa = input.nextInt();

        i = 1;
        while (i<=totalMahasiswa){
         System.out.print("Masukkan nama mahasiswa ke " + i + ":" );
         namaMahasiswa = input.next();  
         System.out.print("Masukkan tinggi mahasiswa ke " + i + ":");
         tinggi = input.nextInt();
           if (tinggi <= 100){
             System.out.print("Masukkan tinggi mahasiswa ke " + i + ":");
             tinggi = input.nextInt();
           }
        i++;
        jumlahTinggi += tinggi;
      }
        System.out.println("Jumlah tinggi mahasiswa adalah :" + jumlahTinggi);
        
        rataRata = jumlahTinggi / totalMahasiswa;
        System.out.println("Rata-rata tinggi mahasiswa adalah :" + rataRata);
        
        input.close();
    }
}
