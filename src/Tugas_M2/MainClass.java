/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M2;

import java.io.*;
public class MainClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Undika U = new Undika ();
        Mahasiswa M = new Mahasiswa ();
        Karyawan K = new Karyawan ();
        
        try {
            do{
                System.out.println("-cek SPP dan Gaji-");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawaan");
                System.out.println("3. Keluar");
                System.out.print("Pilih :");
                int pilih = Integer.parseInt(br.readLine());
                switch(pilih){
                    case 1:
                        System.out.println("---Input Data---");
                        System.out.print("Nama : ");
                        U.setNama(br.readLine());
                        System.out.print("Alamat : ");
                        U.setAlamat(br.readLine());
                        System.out.print("NIM : ");
                        M.setNim(br.readLine());
                        System.out.print("Prodi : ");
                        M.setProdi(br.readLine());
                        System.out.print("Angkatan : ");
                        M.setAngkatan(Integer.parseInt(br.readLine()));
                        M.setSpp();
                        System.out.print("Semester : ");
                        M.setSemester(Integer.parseInt(br.readLine()));
                        
                        System.out.println("---SPP MAHASISWA---");
                        System.out.println("Nama        : "+U.getNama());
                        System.out.println("Alamat      : "+U.getAlamat());
                        System.out.println("NIM         : "+M.getNim());
                        System.out.println("Prodi       : "+M.getProdi());
                        System.out.println("Angkatan    : "+M.getAngkatan());
                        System.out.println("Semester    : "+M.getSemester());
                        System.out.println("SPP         : "+M.getSPP());
                        break;
                    
                    case 2:
                        System.out.println("---Input Data---");
                        System.out.print("Nama : ");
                        U.setNama(br.readLine());
                        System.out.print("Alamat : ");
                        U.setAlamat(br.readLine());
                        System.out.print("NIK : ");
                        K.setNik(br.readLine());
                        System.out.print("Bagian : ");
                        K.setBagian(br.readLine());
                        System.out.print("Kehadiran : ");
                        K.setKehadiran(Integer.parseInt(br.readLine()));
                        System.out.print("Gaji/Hari : ");
                        K.setGaji_per_hari(Integer.parseInt(br.readLine()));
                        
                        System.out.println("---GAJI KARYAWAN---");
                        System.out.println("Nama        : "+U.getNama());
                        System.out.println("Alamat      : "+U.getAlamat());
                        System.out.println("NIK         : "+K.getNik());
                        System.out.println("Bagian      : "+K.getBagian());
                        System.out.println("Kehadiran   : "+K.getKehadiran());
                        System.out.println("Gaji/Hari   : "+K.getGaji_per_hari());
                        System.out.println("Total Gaji  : "+K.getGaji());
                        break;
                    case 3:
                        System.out.println("Good-_-Bye");
                        System.exit(0);
                }
            }while(true);
        }catch (Exception e){
            System.out.println("Input Salah");
        }
    }
    
}
