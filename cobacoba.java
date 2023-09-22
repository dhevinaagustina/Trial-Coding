import java.util.Scanner;
public class cobacoba {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        //Deklarasi
        int panjang,lebar,tinggi,volume;

        //Input
        System.out.print("Masukkan panjang:");
        panjang=input.nextInt();

        System.out.print("Masukkan lebar:");
        lebar=input.nextInt();

        System.out.print("Masukkan tinggi:");
        tinggi=input.nextInt();

        //Operator
        volume=panjang*lebar*tinggi;

        //Output
        System.out.print("Volume adalah:" + volume);













    }
}