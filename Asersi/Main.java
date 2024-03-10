package Asersi;

public class Main { 
    public static void main(String[] args) { 
        KeranjangObat keranjangObat = new KeranjangObat(); 
        keranjangObat.tambahObat("Paracetamol"); 
        keranjangObat.tambahObat("Vitamin C"); 
        keranjangObat.tambahObat("Antibiotik"); 
        keranjangObat.tambahObat("Obat Flu"); 
        keranjangObat.tambahObat("Obat Batuk"); 
        keranjangObat.tambahObat("Obat Sakit Kepala"); // Asersi: keranjang sudah penuh 
        keranjangObat.tampilkanObat(); 
    } 
    // Nama : Muhammad Irfan Mursyid
    // NIM : 24060122130046
    // A1
} 