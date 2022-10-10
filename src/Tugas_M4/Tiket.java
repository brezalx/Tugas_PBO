/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author BmeX
 */
public class Tiket {
    String bookingID, nik, nama, jen_kel, tglBerangkat, tglKembali, kotaAsal;
    
    public Tiket(String bookingID, String nik, String nama, String jen_kel, String tglBerangkat, String tglKembali, String kotaAsal){
        this.bookingID=bookingID;
        this.nik=nik;
        this.nama=nama;
        this.jen_kel=jen_kel;
        this.tglBerangkat=tglBerangkat;
        this.tglKembali=tglKembali;
        this.kotaAsal=kotaAsal;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJen_kel() {
        return jen_kel;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    
}
