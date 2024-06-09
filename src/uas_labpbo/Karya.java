/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_labpbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Karya {
    private int id;
    private String nama_lukisan;
    private String pelukis;
    private int tahun;
    private String jenis_aliran;
    private byte[] gambar_lukisan;

    public Karya(String nama_lukisan, String pelukis, int tahun, String jenis_aliran, byte[] gambar_lukisan) {
        this.nama_lukisan = nama_lukisan;
        this.pelukis = pelukis;
        this.tahun = tahun;
        this.jenis_aliran = jenis_aliran;
        this.gambar_lukisan = gambar_lukisan;
    }
    public Karya() {
    }
    
    public int getId() {
        return id;
    }

    public String getNamaLukisan() {
        return nama_lukisan;
    }

    public String getPelukis() {
        return pelukis;
    }

    public int getTahun() {
        return tahun;
    }

    public String getJenisAliran() {
        return jenis_aliran;
    }

    public byte[] getGambarLukisan() {
        return gambar_lukisan;
    }

    static ArrayList<Karya> daftarKarya;

    public static void LoadKarya() {
        daftarKarya = new ArrayList<Karya>();

        try {
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * from lukisan";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                // Use default constructor and setters or the constructor directly
                Karya karya = new Karya();
                karya.id = rs.getInt("id");
                karya.nama_lukisan = rs.getString("nama_lukisan");
                karya.pelukis = rs.getString("pelukis");  // Correct field for pelukis
                karya.tahun = rs.getInt("tahun");
                karya.jenis_aliran = rs.getString("jenis_aliran");
                karya.gambar_lukisan = rs.getBytes("foto");

                daftarKarya.add(karya);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("error");
        }
    }
}
