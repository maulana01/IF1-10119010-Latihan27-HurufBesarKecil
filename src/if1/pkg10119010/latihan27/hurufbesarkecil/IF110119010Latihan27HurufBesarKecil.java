/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan huruf besar
 *                     dan kecil
 */
public class IF110119010Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String besar, kecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String nama = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+nama.toUpperCase());
        System.out.println("Huruf Kecil : "+nama.toLowerCase());
    }
    
}
