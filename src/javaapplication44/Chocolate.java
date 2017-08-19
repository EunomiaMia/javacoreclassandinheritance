
package javaapplication44;
public class Chocolate extends Product{
    public String tezina;
    
    public Chocolate(String naziv, int barkod,String tezina, double cijena){
        super(naziv,barkod,cijena);
        this.tezina=tezina;
    
    
    }
    
    @Override
    public String toString(){
    return "Naziv: "+this.naziv+" Barkod: "+this.barkod +" Cijena: "+this.cijena+" Tezina "+ this.tezina;   
            }
    
    public double cijenaSaPorezom(){
    return this.cijena+this.cijena*POREZ;
    
    }
}
