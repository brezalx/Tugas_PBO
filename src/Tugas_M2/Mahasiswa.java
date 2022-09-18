/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M2;

/**
 *
 * @author BmeX
 */
public class Mahasiswa {
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;
    
    //setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSpp() {
        if (getAngkatan()<17){
            spp = 12000000;
        } else {
            spp = 15000000;
        }
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    //getter
    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSpp() {
        return spp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }
    
    public int getSPP() {
        bayar_spp_semester = this.spp*this.semester;
        return bayar_spp_semester;
    }
}
