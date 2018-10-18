



/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Volume dan Massa jenis Kubus
 */

package pb03.pkg10117110.latihan41.massajenis;


public class PB0310117110Latihan41MassaJenis {

 
    public static void main(String[] args) {
        
        Kubus objK = new Kubus();
        System.out.println("==== Massa Jenis Kubus====");
        objK.setSisi(5);
        objK.setMassa(250);
        System.out.println("Sisi : "+objK.getSisi());
        System.out.println("Massa : "+objK.getMassa());
        System.out.println("");
        System.out.println("==== Hasil Perhitungan====");
        System.out.println("Volume : "+objK.hitungVolume(0));
        System.out.println("Massa Jenis : "+objK.hitungMassaJenis(0,0));

    }
    
}
