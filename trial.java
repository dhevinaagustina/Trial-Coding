import java.util.Scanner;
public class trial {
    public static void main(String[] args) {
        String nama, jenisKelamin;
        int i;
    
        Scanner input = new Scanner(System.in);

        i = 1;
        while (i <= 30) {
            System.out.print("Masukkan nama mahasiswa ke " + i + ":");
            nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa ke- " + i + "(Pria/Wanita) :");
            jenisKelamin=input.nextLine();

            if( jenisKelamin.equalsIgnoreCase("Wanita")){
                System.out.println("Nama Mahasiswa ke- " + i + ":" + nama);
               
            }
             i++;
            
        }   

        
        }


        }





    
    
      

