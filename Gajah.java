
package pewarisan3;
public class Gajah extends hewan {
    public static void testClassMethod() {
        System.out.println("The class method in Hewan");
    }
    //meng-override method pada class Hewan
    public void testInstaanceMethod()
    {
        System.out.println("The instance method Gajah");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        hewan myhewan = myGajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
        
    }
}
