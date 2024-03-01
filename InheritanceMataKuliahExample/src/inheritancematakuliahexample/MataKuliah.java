/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancematakuliahexample;

/**
 *
 * @author HP
 */
public class MataKuliah {
    private String nama;
    private int sks;
    
    MataKuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    void tampilkaninfo() {
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
    }
    
}
