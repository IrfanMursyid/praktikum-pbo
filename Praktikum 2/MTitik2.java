
public class MTitik2 {
    public static void main(String[] args){
        Titik2 t1 = new Titik2(2,3);
        Titik2 t2 = new Titik2(4,5);
        Garis g1 = new Garis(t1,t2);

        //Enkapsulasi
        System.out.println("absis dengan enkapsulasi: " + t1.getAbsis());

        //Garis
        System.out.println("Titik awal garis : (" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat() + ")" );
        System.out.println("Titik akhir garis : (" + g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat() + ")" );

        //Jarak Pusat
        double jarak = t1.getJarakPusat();
        System.out.println("jarak pusat pada t1 adalah : " + jarak );

        //Refleksi
        t1.refleksiX();
        System.out.println("Hasil dari refleksi X pada t1 adalah :" + t1.getAbsis() + "," + t1.getOrdinat());
        t2.refleksiY();
        System.out.println("Hasil dari refleksi Y pada t2 adalah :" + t2.getAbsis() + "," + t2.getOrdinat());
        
        //getRefleksiX
        Titik2 titikRefleksiX = t1.getRefleksiX();
        System.out.println("Titik refleksi X: (" + titikRefleksiX.getAbsis() + "," + titikRefleksiX.getOrdinat() + ")");

        //getRefleksiY
        Titik2 titikRefleksiY = t1.getRefleksiY();
        System.out.println("Titik refleksi Y: (" + titikRefleksiY.getAbsis() + "," + titikRefleksiY.getOrdinat() + ")");

        //Menampilkan panjang garis
        System.out.println("Panjang garis g1 adalah: " + g1.getPanjang()); 

        //Menampilkan gradien garis
        System.out.println("Gradien garis g1 adalah: " + g1.getGradien()); 

        //getRefleksiY
        Garis garisRefleksiY = g1.getRefleksiY();
        System.out.println("Garis refleksi Y:");
        System.out.println("Titik awal: (" + garisRefleksiY.getTitikAwal().getAbsis() + "," + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir: (" + garisRefleksiY.getTitikAkhir().getAbsis() + "," + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        //isTegakLurus
        Garis g2 = new Garis(t1, new Titik2(2, 7));   //Membuat garis baru untuk dibandingkan
        System.out.println("Apakah garis g1 tegak lurus dengan garis g2? " + g1.isTegakLurus(g2)); 

    }
// Nama : Muhammad Irfan Mursyid
// NIM : 24060122130046
// Lab A1
}
