
package Praktikum;
import java.util.Scanner;
public class pojok2 extends pojokbaca{
    private String petugas;
    Scanner tata = new Scanner(System.in);
    
    public pojok2(String petugas,String judul, int halaman){
        System.out.println("Petugas = "+ petugas);
        System.out.println("Judul = "+ judul);
        System.out.println("Halaman buku = "+ halaman);
        this.petugas = petugas = petugas = tata.nextLine();
        super.pojokbaca(judul, halaman);
    }
    
    public void info(){
        super.info();
        System.out.println("Nama petugas = "+ petugas);
    }
    
}
