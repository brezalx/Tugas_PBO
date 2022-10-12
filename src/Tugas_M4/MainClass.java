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
        
        String tglKembali = "";
        int maskapai = 0, index = 0;
        String PL;

        try {
            do {
                System.out.println("------- PEMESANAN TIKET PESAWAT -------");
                System.out.print("Masukkan Jumlah Penumpang: ");
                int jml = Integer.parseInt(br.readLine());
                System.out.print("Kota Asal (Surabaya/Jakarta): ");
                String kotaAsal = br.readLine();
                System.out.print("Pilih Rute Tujuan");
                if (kotaAsal.equalsIgnoreCase("Surabaya")) {
                    System.out.println(" ( Bali, Lombok, Jakarta, Yogyakarta, Balikpapan, Makassar )");
                    System.out.print("Kota Tujuan: ");
                    String kotaTujuan = br.readLine();
                    System.out.print("Tanggal Berangkat: ");
                    String tglBerangkat = br.readLine();
                    System.out.print("Pesan Tiket Pulang Pergi (Y/N): ");
                    String pp = br.readLine();
                    if (pp.equalsIgnoreCase("Y")) {
                        System.out.print("Tanggal Kembali: ");
                        tglKembali = br.readLine();
                    }

                    System.out.println("------- PILIH MASKAPAI -------");
                    System.out.println("1. Lion Air");
                    System.out.println("2. Citilink");
                    System.out.print("Pilih Maskapai: ");
                    maskapai = Integer.parseInt(br.readLine());
                    switch (maskapai) {
                        case 1:
                            LionAir lion[] = new LionAir[jml];

                            System.out.println("------- Selamat Datang di Lion Air -------");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jml; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = br.readLine();
                                System.out.print("NIK: ");
                                String nik = br.readLine();
                                System.out.print("Nama: ");
                                String nama = br.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = br.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = br.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = br.readLine();
                                System.out.println("");

                                lion[i] = new LionAir(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jml);
                            }

                            // Print
                            for (int i = 0; i < jml; i++) {
                                System.out.println("------------------------------------------");
                                System.out.println("Tiket Lion Air");
                                System.out.println("------------------------------------------");
                                System.out.println("Booking ID: " + lion[i].getBookingID());
                                System.out.println("NIK: " + lion[i].getNik());
                                System.out.println("Nama: " + lion[i].getNama());
                                System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                                System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                                System.out.println("No. Kursi: " + lion[i].getNoKursi());
                                System.out.println("Harga Tiket: " + lion[i].getHarga());
                            }

                            index = jml - 1;
                            System.out.println("Total: " + lion[index].getTotal());
                            break;

                        case 2:
                            Citilink citilink[] = new Citilink[jml];

                            System.out.println("------- Selamat Datang di Citilink -------");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jml; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = br.readLine();
                                System.out.print("NIK: ");
                                String nik = br.readLine();
                                System.out.print("Nama: ");
                                String nama = br.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = br.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = br.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = br.readLine();
                                System.out.println();

                                citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jml);

                            }

                            // Print
                            for (int i = 0; i < jml; i++) {
                                System.out.println("------------------------------------------");
                                System.out.println("Tiket Citilink");
                                System.out.println("------------------------------------------");
                                System.out.println("Booking ID: " + citilink[i].getBookingID());
                                System.out.println("NIK: " + citilink[i].getNik());
                                System.out.println("Nama: " + citilink[i].getNama());
                                System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                                System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                                System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                                System.out.println("Harga Tiket: " + citilink[i].getHarga());
                            }

                            index = jml - 1;
                            System.out.println("Total: " + citilink[index].getTotal());
                            break;

                        default:
                            break;
                    }
                } else if (kotaAsal.equalsIgnoreCase("jakarta")) {
                    System.out.println(" ( Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar )");
                    System.out.print("Kota Tujuan: ");
                    String kotaTujuan = br.readLine();
                    System.out.print("Tanggal Berangkat: ");
                    String tglBerangkat = br.readLine();
                    System.out.print("Pesan Tiket Pulang Pergi (Y/N): ");
                    String pp = br.readLine();
                    if (pp.equalsIgnoreCase("Y")) {
                        System.out.print("Tanggal Kembali: ");
                        tglKembali = br.readLine();
                    }

                    System.out.println("------- PILIH MASKAPAI -------");
                    System.out.println("1. Lion Air");
                    System.out.println("2. Citilink");
                    System.out.print("Pilih Maskapai: ");
                    maskapai = Integer.parseInt(br.readLine());
                    switch (maskapai) {
                        case 1:
                            LionAir lion[] = new LionAir[jml];

                            System.out.println("------- Selamat Datang di Lion Air -------");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jml; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = br.readLine();
                                System.out.print("NIK: ");
                                String nik = br.readLine();
                                System.out.print("Nama: ");
                                String nama = br.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = br.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = br.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = br.readLine();
                                System.out.println("");

                                lion[i] = new LionAir(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jml);
                            }

                            // Print
                            for (int i = 0; i < jml; i++) {
                                System.out.println("------------------------------------------");
                                System.out.println("Tiket Lion Air");
                                System.out.println("------------------------------------------");
                                System.out.println("Booking ID: " + lion[i].getBookingID());
                                System.out.println("NIK: " + lion[i].getNik());
                                System.out.println("Nama: " + lion[i].getNama());
                                System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                                System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                                System.out.println("No. Kursi: " + lion[i].getNoKursi());
                                System.out.println("Harga Tiket: " + lion[i].getHarga());
                            }

                            index = jml - 1;
                            System.out.println("Total: " + lion[index].getTotal());
                            break;

                        case 2:
                            Citilink citilink[] = new Citilink[jml];

                            System.out.println("------- Selamat Datang di Citilink -------");
                            System.out.println("Silahkan isi data penumpang");
                            for (int i = 0; i < jml; i++) {
                                System.out.print("Booking ID: ");
                                String bookingID = br.readLine();
                                System.out.print("NIK: ");
                                String nik = br.readLine();
                                System.out.print("Nama: ");
                                String nama = br.readLine();
                                System.out.print("Jenis Kelamin (L/P): ");
                                String kelamin = br.readLine();
                                System.out.print("No. Pesawat: ");
                                String noPesawat = br.readLine();
                                System.out.print("No. Kursi: ");
                                String noKursi = br.readLine();
                                System.out.println();

                                citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali,
                                        kotaAsal, kotaTujuan, noPesawat, noKursi, jml);

                            }

                            // Print
                            for (int i = 0; i < jml; i++) {
                                System.out.println("------------------------------------------");
                                System.out.println("Tiket Citilink");
                                System.out.println("------------------------------------------");
                                System.out.println("Booking ID: " + citilink[i].getBookingID());
                                System.out.println("NIK: " + citilink[i].getNik());
                                System.out.println("Nama: " + citilink[i].getNama());
                                System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                                System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                                System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                                System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                                System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                                System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                                System.out.println("Harga Tiket: " + citilink[i].getHarga());
                            }

                            index = jml - 1;
                            System.out.println("Total: " + citilink[index].getTotal());
                            break;

                        default:
                            break;
                    }
                }

                System.out.print("\n\nPesan Lagi (Y/N): ");
                PL = br.readLine();
            } while (PL.equalsIgnoreCase("y"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
