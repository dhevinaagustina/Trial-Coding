import java.util.Scanner;
public class cobaifelse {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        System.out.println("Masukkan Suhu: ");
        int suhu=input.nextInt();

    if (suhu<16){
        System.out.println("Silahkan menggunakan jaket");

    }
    else{
        System.out.println("Tidak perlu menggunakan jaket");
    }
    }

    
}
