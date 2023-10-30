import java.util.Scanner;
public class newcoba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, kuadrat,angka;

        System.out.print("Masukkan berapa angka :");
        angka = input.nextInt();

        while ( i <= angka ){
        kuadrat = i * i;
        System.out.println("Hasil kuadrat "+ i + " adalah : " + kuadrat);
        i++;



        }
         
       
    }
}

        
          


    
