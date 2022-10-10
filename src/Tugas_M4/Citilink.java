/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author BmeX
 */
public class Citilink extends Tiket{
    String kotaTujuan,noPesawat,noKursi;
    int jumlahPenumpang,harga,total;
    
    public Citilink(String bookingID, String nik, String nama, String jen_kel, String tglBerangkat, String tglKembali, 
            String kotaAsal,String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang){
        super(bookingID, nik, nama, jen_kel, tglBerangkat, tglKembali, kotaAsal);
        this.kotaTujuan=kotaTujuan;
        this.noPesawat=noPesawat;
        this.noKursi=noKursi;
        this.jumlahPenumpang=jumlahPenumpang;
    }

    Citilink(int jumlah, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
    
    public int getHarga(){
        if (getKotaAsal().equalsIgnoreCase("surabaya")){
            if (getKotaTujuan().equalsIgnoreCase("bali") || getKotaTujuan().equalsIgnoreCase("lombok")){
                harga = 700000;
            }else if (getKotaTujuan().equalsIgnoreCase("jakarta") || getKotaTujuan().equalsIgnoreCase("yogyakarta")){
                harga = 800000;
            }else if (getKotaTujuan().equalsIgnoreCase("balikpapan") || getKotaTujuan().equalsIgnoreCase("makasar")){
                harga = 850000;
            }
        }else if (getKotaAsal().equalsIgnoreCase("jakarta")){
            if (getKotaTujuan().equalsIgnoreCase("bali") || getKotaTujuan().equalsIgnoreCase("lombok")){
                harga = 1000000;
            }else if (getKotaTujuan().equalsIgnoreCase("surabaya") || getKotaTujuan().equalsIgnoreCase("yogyakarta")){
                harga = 750000;
            }else if (getKotaTujuan().equalsIgnoreCase("balikpapan") || getKotaTujuan().equalsIgnoreCase("makasar")){
                harga = 900000;
            }
        }
        return harga;
    }
    
    public int getTotal(){
        total = getHarga() * getJumlahPenumpang();
        return total;
    }
    
    public void getCetak (){
        System.out.println("===================================");
        System.out.println("====  Preview Tiket Citilink  =====");
        System.out.println("===================================");
        System.out.println("Booking ID : " + super.getBookingID());
        System.out.println("NIK : " + super.getNik());
        System.out.println("Nama : " + super.getNama());
        System.out.println("Kota Asal : " + super.getKotaAsal());
        System.out.println("Kota Tujuan : " + getKotaTujuan());
        System.out.println("Tanggal Berangkat : " + super.getTglBerangkat());
        System.out.println("Tanggal Kembali : " + super.getTglKembali());
        System.out.println("Nomor Pesawat : " + getNoPesawat());
        System.out.println("Nomor Kursi : " + getNoKursi());
        System.out.println("Harga Tiket : " + getHarga());
        System.out.println(" ");
    }
}
