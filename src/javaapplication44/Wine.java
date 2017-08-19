
package javaapplication44;
public class Wine extends Product{
    public String zapremina;
    
    
    public Wine(String naziv, int barkod,String zapremina, double cijena){
        super(naziv,barkod,cijena);
        this.zapremina=zapremina;
    
    
    }
    
    @Override
    public String toString(){
      return "Naziv: "+this.naziv+" Barkod: "+this.barkod +" Cijena: "+this.cijena+" Zapremina "+ this.zapremina;   
            }
     
    
    public double cijenaSaDodatnimPorezom(){
     double novaCijena=cijena+cijena*POREZ;
     novaCijena=novaCijena*DODATNI_POREZ;
     return novaCijena+cijena+cijena*POREZ;
     }
}
