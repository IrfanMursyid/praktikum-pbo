package Eksepsi;

public class Main {
    public static void main(String[] args) {
        //buat entitas pembeli
        Pembeli pembeli1 = new Pembeli("Kirito");
        Pembeli pembeli2 = new Pembeli("Asuna");
        // set ketersediaan obat
        Obat obat1 = new Obat("Promag");
        obat1.setTersedia(true);
        Obat obat2 = new Obat("Betadin");
        obat2.setTersedia(false);
        Obat obat3 = new Obat("Panadol");
        obat3.setTersedia(true);


        try {
            pembeli1.beliObat(obat1);
            System.out.println("Pembelian " + obat1.getNama() + " berhasil!");

            pembeli2.beliObat(obat3);
            System.out.println("Pembelian " + obat3.getNama() + " berhasil!");

            pembeli1.beliObat(obat2);
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        }

        //info pembeli
        System.out.println("Pembeli: " + pembeli1.getNama());
        System.out.println("Pembeli: " + pembeli2.getNama());

        //info keranjang
        System.out.println("Keranjang " + pembeli1.getNama() + ":");
        for (Obat obat : pembeli1.getKeranjangObat()) {
            if (obat != null) {
                System.out.println(" - " + obat.getNama());
            }
        }
    }
    // Nama : Muhammad Irfan Mursyid
    // NIM : 24060122130046
    // A1
}