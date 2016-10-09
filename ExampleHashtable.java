package javaapplication1;

import java.util.Hashtable;

/**
 *
 * @author nyongku
 */
public class JavaApplication1 {
 static class alamatbuku{
     String judulbuku;
	
     public alamatbuku( String namamatkul){
         this.judulbuku = namamatkul;
     }
     public String toString(){
         return this.judulbuku;
     }
 }
    public static void main(String[] args) {
        Hashtable<String,alamatbuku> data =  new Hashtable<String,alamatbuku>();
        data.put("B001", new alamatbuku("basisdata"));
        data.put("B002", new alamatbuku("matematika diskrit"));
        data.put("B003", new alamatbuku("kalkulus"));
        data.put("B004", new alamatbuku("sistem informasi"));
        data.put("B005", new alamatbuku("bahasa indonesia"));
        data.put("B006", new alamatbuku("pengantar teknologi informasi"));
        data.put("B007", new alamatbuku("pemprograman dasar I"));
        data.put("B008", new alamatbuku("pemprograman web"));
        data.put("B009", new alamatbuku("basis data lanjut"));
        data.put("B010", new alamatbuku("statistika"));
        System.out.println(data);
        System.out.println("Sisa data buku yang sudah terhapus ..!");
        data.remove("B001");
        data.remove("B002");
        System.out.println(data);
        
          
    }
    
}
