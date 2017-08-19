
package javaapplication44;
public class JavaApplication44 {
    public static void main(String[] args) {
        Chocolate c = new Chocolate("Milka ",12345," 100 grama ",2.25);
         System.out.println(c.toString());
         double x = c.cijenaSaPorezom();
         System.out.println("Cijena sa porezom "+ x);
        
        
       
         Wine w = new Wine("Vranac",12346,"1 litar",5.5);
         System.out.println(w.toString());
         double f = w.cijenaSaDodatnimPorezom();
         System.out.println("Cijena sa dodatnim porezom "+ f);
    }
    
}
