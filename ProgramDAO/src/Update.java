/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    fasilitas perintah = new fasilitas();
    barang atk = new barang();
    atk.setKode_barang("B002");
    atk.setNama_barang("Kamus");
    atk.setJumlah(20);
    atk.setHarga(30000);
    perintah.update(atk);
    }
    
}
