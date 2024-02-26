public class Titik2 {
        // Atribut
        private double absis;
        private double ordinat;
        //Constructor

        public Titik2(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        }
    
        public Titik2(){
            this(0,0);
        }

        public double getAbsis(){
            return this.absis;
        }
    
        public double getOrdinat(){
            return this.ordinat;
        }
    
        public void setAbsis(double absis){
            this.absis = absis;
        }
    
        public void setOrdinat(double ordinat){
            this.ordinat = ordinat;
        }

        public double getJarakPusat(){
            double jarak = Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
            return jarak;
        }

        public void refleksiX(){
            this.ordinat = -this.ordinat;
        }

        public void refleksiY(){
            this.absis = -this.absis;
        }

        public Titik2 getRefleksiX(){
            Titik2 t = new Titik2(-absis, ordinat);
            return t;
        }
    
        public Titik2 getRefleksiY(){
            Titik2 t = new Titik2(absis, -ordinat);
            return t;
        }
// Nama : Muhammad Irfan Mursyid
// NIM : 24060122130046
// Lab A1
 }
        

