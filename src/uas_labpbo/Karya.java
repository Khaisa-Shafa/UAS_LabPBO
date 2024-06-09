/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_labpbo;

/**
 *
 * @author USER
 */
public class Karya {
    private String nama_lukisan;
    private String pelukis;
    private int tahun;
    private String jenis_aliran;
    private String gambar_lukisan;
    //tambah image lukisan.datatype???
    
   
    public Karya(String nama_lukisan,String pelukis, int tahun, String jenis_aliran, String gambar_lukisan) //tambah gambar_lukisan
    {
        this.nama_lukisan = nama_lukisan;
        this.pelukis = pelukis;
        this.tahun = tahun;
        this.jenis_aliran = jenis_aliran;
        this.gambar_lukisan = gambar_lukisan;
        }  

    public String getNama_lukisan() {
        return nama_lukisan;
    }

    public String getPelukis() {
        return pelukis;
    }

    public int getTahun() {
        return tahun;
    }

    public String getJenis_aliran() {
        return jenis_aliran;
    }
    
    public String getGambar_lukisan() {
        return gambar_lukisan;
    }
}
