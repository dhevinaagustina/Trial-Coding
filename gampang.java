import java.util.Scanner;
public class gampang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        i = 1;
        while (i<=angka){
            if (i % 2 == 0){
                System.out.println(i + " Bilangan Genap");
            }else{
                System.out.println(i + " Bilangan Ganjil");
            }
        i++;
        }
        
       
        
    }
    
}

