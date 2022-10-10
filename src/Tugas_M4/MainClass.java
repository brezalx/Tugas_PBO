/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author BmeX
 */

import java.io.*;
public class MainClass {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        String bookingID = "", nik = "", nama = "", jenis_kelamin = "", tglBerangkat, tglKembali, kotaAsal;
        int jumlahPenumpang, harga = 0, total = 0, temp =0;
        String kotaTujuan = " ", noPesawat = " ", noKursi = "";
        
        try{
            System.out.println("=== PESAN TIKET ===");
            //jmlh array ditentukan user 
            //1. entry jumlah 
            System.out.print("Masukkan Jumlah Penumpang : ");
            int jumlah = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Kota Asal : ");
            kotaAsal =  br.readLine();
            System.out.println("Pilih rute tujuan : ");
            System.out.println(" Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
            
            //2. buat object 
            LionAir la[] = new LionAir [jumlah];
            Citilink ctl[] = new Citilink [jumlah];
            
            //input 
                System.out.println(" ");
                System.out.print("Entry Tujuan : ");
                kotaTujuan = br.readLine();
                System.out.print("Entry Tanggal Berangkat : ");
                tglBerangkat = br.readLine();
                System.out.print("Pesan pulang-pergi? (Y/N) : ");
                String PP = br.readLine();
                System.out.print("Entry Tanggal Kembali : ");
                tglKembali = br.readLine();
                
                System.out.print("\n ");
                System.out.println("== Pilih Maskapai ==");
                System.out.println("1. Lion Air");
                System.out.println("2. Citilink");
                System.out.print("Pilih Maskapai : ");
                int pilih = Integer.parseInt(br.readLine());
                
                //masukkan object 
                if(pilih == 1){
                    System.out.println("== SELAMAT DATANG DI LION AIR ==");
                    System.out.println("Silihkan isi data penumpang ");
                    for(int i = 0 ; i < la.length ; i++){
                    System.out.print("Entry Booking ID : ");
                    bookingID = br.readLine();
                    System.out.print("Entry NIK : ");
                    nik = br.readLine();
                    System.out.print("Entry Nama : ");
                    nama = br.readLine();
                    System.out.print("Entry Jenis kelamin (P/L) : ");
                    jenis_kelamin = br.readLine();
                    System.out.print("Entry No Pesawat : ");
                    noPesawat = br.readLine();
                    System.out.print("Entry No Kursi : ");
                    noKursi = br.readLine();
                    System.out.println(" ");
                    }
                }
                    if(pilih == 2){
                        System.out.println("== SELAMAT DATANG DI LION AIR ==");
                        System.out.println("Silihkan isi data penumpang ");
                        for(int i = 0 ; i < ctl.length ; i++){
                        System.out.print("Entry Booking ID : ");
                        bookingID = br.readLine();
                        System.out.print("Entry NIK : ");
                        nik = br.readLine();
                        System.out.print("Entry Nama : ");
                        nama = br.readLine();
                        System.out.print("Entry Jenis kelamin (P/L) : ");
                        jenis_kelamin = br.readLine();
                        System.out.print("Entry No Pesawat : ");
                        noPesawat = br.readLine();
                        System.out.print("Entry No Kursi : ");
                        noKursi = br.readLine();
                        System.out.println(" ");
                        }
                }
                    
            //output 
                if(pilih == 1){
                    for(int i = 0 ; i < la.length ; i++){
                    la[i] = new LionAir (jumlah, kotaTujuan, noPesawat, noKursi, bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
                            la [i].getCetak();
                    }
                    for(int i = 0; i < la.length; i++){
                        temp += la[i].getHarga();
                    } 
                    System.out.println("Harga Total : " + temp);
                    temp = 0;
                }
               
                if(pilih == 2){
                    for(int i = 0 ; i < ctl.length ; i++){
                    ctl[i] = new Citilink (jumlah, kotaTujuan, noPesawat, noKursi, bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
                                ctl [i].getCetak();
                    }
                    for(int i = 0; i < ctl.length; i++){
                        temp += ctl[i].getHarga();
                    } 
                    System.out.println("Harga Total : " + temp);
                    temp = 0;
                }
        }catch(Exception e){
        
        }
    }
    
}
