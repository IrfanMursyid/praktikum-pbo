public class TokoProduk {
    public static void main(String[] args) {
        Penjual penjual1 = new Penjual("Irfan", "Jl. Raya Wiradesa No.54", "081908763927");
        Produk produk1 = new Produk("Samsung S24 Ultraaaa", 15000000, 5, "Handphone", penjual1);

        System.out.println("Informasi Produk:");
        System.out.println(produk1); 

        produk1.setNama("Samsung S24 Ultra");
        produk1.setHarga(16000000);

        System.out.println("Informasi Produk yang sudah di update:");
        System.out.println(produk1);

        System.out.println("Informasi Lengkap Penjual:");
        System.out.println(penjual1); 
    }
// Nama : Muhammad Irfan Mursyid
// NIM : 24060122130046
// A1
}