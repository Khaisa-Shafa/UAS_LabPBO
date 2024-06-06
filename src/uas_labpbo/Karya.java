/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_labpbo;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class Karya {
    public String namakarya;
    public String namapelukis;
    public int tahunrilis;
    //tambah image lukisan.datatype???
    
    static ArrayList<Karya> daftarKarya;
    
    public static void loadDetailKarya()
    {
        daftarKarya = new ArrayList<Karya>();
        Karya karya;
        
        try{
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * FROM karya";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                karya = new Karya();
                karya.namakarya = rs.getString("namakarya");
                karya.namapelukis = rs.getString("namapelukis");
                karya.tahunrilis = rs.getInt("tahunrilis");
                //tambah image lukisan. data type????
            }
        }
        catch (Exception ex){
            
        }
    }
}
