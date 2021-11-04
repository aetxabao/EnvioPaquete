
/**
 * test
 * @author (inigo salinas) 
 */
public class TestHojaCalculo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestHojaCalculo
     */

        public static void main(String[] args)
        {
            Paquete paquete1 = new Paquete();
            Paquete paquete2 = new Paquete(40,60,40);
            
            Envio envio1 = new Envio();
            envio1.addPaquete(paquete1);
            envio1.addPaquete(paquete2);
            envio1.print();
            
            Paquete paquete3 = new Paquete(50,50,70);
            envio1.addPaquete(paquete3);
            envio1.print();
            
            Paquete paquete2Clone = new Paquete(paquete2.getDimension(), paquete2.getPeso());
            envio1.addPaquete(paquete2Clone);
        }
        
    
}
