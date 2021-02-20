/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119082.zainulrifqimuwaffaq.pkg2;

/**
 *
 * @author Zainul Rifqi
 * Nama : Zainul Rifqi Muwaffaq
 * NIM : 10119082
 * Kelas : IF2
 * Tanggal : 20/02/2021
 * Nomor Soal : 2
 */
public class UASIF210119082ZAINULRIFQIMUWAFFAQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 100000, bonus, i;
        int bulan = 5;
        saldoAwal = saldoAwal + 500;
        for  (i = 1; i <= bulan ; i++) {
            System.out.println("Saldo di bulan ke-" + i +  " : " + saldoAwal);
            saldoAwal = saldoAwal + 500;
        }
    }
    
}
