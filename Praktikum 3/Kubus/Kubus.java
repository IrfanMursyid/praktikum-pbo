public class Kubus {
    // Atribut
    private double sisi;

    // Konstruktor
    public Kubus(double sisi){
        this.sisi = sisi;
    }

    //Menghitung Volume kubus
    public double hitungVolume(){
        return Math.pow(sisi,3);
    }

    //Menghitung luas permukaan
    public double hitungLuasPermukaan(){
        return 6 * Math.pow(sisi,2);
    }

    public static void main(String[] args){
        Kubus kubus1 = new Kubus(6);
        Kubus kubus2 = new Kubus(5);
        System.out.println("Volume kubus1: " + kubus1.hitungVolume());
        System.out.println("Luas permukaan kubus1: " + kubus1.hitungLuasPermukaan());
        System.out.println("Volume kubus2: " + kubus2.hitungVolume());
        System.out.println("Luas permukaan kubus2: " + kubus2.hitungLuasPermukaan());
    }
// Nama : Muhammad Irfan Mursyid
// NIM : 24060122130046
// A1
}
