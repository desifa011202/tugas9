package tugas8pbo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author desif
 */
public class Tugas8PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Selamat datang di Game Filkom Defend");
        System.out.print("Masukkan nama player : ");
        String nama = scan.nextLine();
        System.out.println("Silahkan pilih role anda: ");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        System.out.print("Masukkan pilihan: ");
        int pilih = 0;
        try {
            pilih = scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan pilihan yang sesuai");
            scan.nextLine();
            pilih = scan.nextInt();
        }
        scan.nextLine();

        if (pilih != 1 && pilih != 2 && pilih != 3){
            System.out.println("Masukkan pilihan yang sesuai");
            try {
                pilih = scan.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan pilihan yang sesuai");
                scan.nextLine();
                pilih = scan.nextInt();
            }
            scan.nextLine();
        }
    }
}

