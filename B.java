
package pewarisan4;
class B extends A{
    private int b;
    public void setB (int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    
    //melakukan override terhadao method talmpilakn Nilai()
    //yang terdapat pada kelas A
    
    public void tampilNilai (){
        super.tampilkanNilai (); // memanggil method dalam kelas A
        System.out.println("nilai b : "+getB());
    }
    
}
