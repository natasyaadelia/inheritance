
package pewarisan;
public class Latihan1 {
    private int a = 10;
    
    protected void terpotek(){
        System.out.println("Method inihanya untuk anaknya");
    }
    
    public void info (){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass ().getName());
    }
}
