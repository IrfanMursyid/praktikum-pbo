package Asersi;

public class KeranjangObat { 
    private String[] keranjang; 
    private int count; 
 
    public KeranjangObat() { 
        keranjang = new String[5]; 
        count = 0; 
    } 
 
    public void tambahObat(String obat) { 
        if (count <= 5) {
            keranjang[count] = obat;
            count++;
            System.out.println("Obat " + obat + " berhasil ditambahkan");
        } else {
            // Asersi keranjang penuh
            assert false : "Keranjang sudah penuh, tidak dapat menambahkan obat lagi";
        }
    } 

 
    public void tampilkanObat() { 
        for (int i = 0; i < keranjang.length; i++) { 
            System.out.println(keranjang[i]); 
        } 
    } 
    // Nama : Muhammad Irfan Mursyid
    // NIM : 24060122130046
    // A1
}
