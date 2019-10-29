
package Praktikum;
import java.util.Scanner;
public class pojokbaca {
    private String judul;
    private int halaman;
    Scanner tata = new Scanner(System.in);
    
    public void pojokbaca (String judul, int halaman){
        this.judul = judul = tata.nextLine();
        this.halaman = halaman = tata.nextInt();
    }
    
    public void info (){
        System.out.println("Judul : "+ this.judul);
        System.out.println("Halaman : "+ this.halaman);
    }
}
