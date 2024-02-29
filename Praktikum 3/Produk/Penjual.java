public class Penjual {
        // Atribut
        private String nama;
        private String alamat;
        private String nomorTelepon;
    
        // Constructor
        public Penjual(String nama, String alamat, String nomorTelepon) {
            this.nama = nama;
            this.alamat = alamat;
            this.nomorTelepon = nomorTelepon;
        }
    
        // Getter dan setter untuk atribut nama
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        // Getter dan setter untuk atribut alamat
        public String getAlamat() {
            return alamat;
        }
    
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
    
        // Getter dan setter untuk atribut nomorTelepon
        public String getNomorTelepon() {
            return nomorTelepon;
        }
    
        public void setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
        }
    
        @Override
    public String toString() {
        return "Penjual: " + nama + ", " + alamat + ", " + nomorTelepon;
    }
// Nama : Muhammad Irfan Mursyid
// NIM : 24060122130046
// A1   
}
