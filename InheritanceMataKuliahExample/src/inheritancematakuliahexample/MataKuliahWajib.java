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
public class MataKuliahWajib extends MataKuliah {
    private String jurusan;
    
    MataKuliahWajib(String nama, int sks, String jurusan) {
        super(nama, sks);
        this.jurusan = jurusan;
    }
    void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jurusan: " + jurusan);
    }
    
}
