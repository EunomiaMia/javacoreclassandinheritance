
package javaapplication44;
public abstract class Product {
    public String naziv;
    public int barkod;
    public double cijena;
    final static double POREZ=0.2;
    final static double DODATNI_POREZ=0.1;
    
    
    public Product(String naziv, int barkod, double cijena){
    this.naziv=naziv;
    this.barkod=barkod;
    this.cijena=cijena;
    
    }
}
