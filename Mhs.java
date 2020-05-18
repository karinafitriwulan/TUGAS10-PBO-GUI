 public class Mhs {
     private String nim;
     private String nama;
     private String jurusan;
     private String kelas;
     private boolean jenisKelamin;
     public Mhs(String nim, String nama) {
         this.nim = nim;
         this.nama = nama;
     }
     public boolean getJenisKelamin() {
         return jenisKelamin;
     } 
    public void setJenisKelamin(boolean jenisKelamin) {
         this.jenisKelamin = jenisKelamin; 
    }     public String getJurusan() {   
      return jurusan;   
  }
     public void setJurusan(String jurusan) {
         this.jurusan = jurusan;
     }
     public String getKelas() {
         return kelas;
     } 
    public void setKelas(String kelas) { 
        this.kelas = kelas; 
    }  
   public String getNama() { 
        return nama;  
   }
     public void setNama(String nama) {  
       this.nama = nama;  
   }
     public String getNim() {   
      return nim;   
  }
     public void setNim(String nim) {
         this.nim = nim;
     }
     }


