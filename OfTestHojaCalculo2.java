
/**
 * Write a description of class OfTestHojaCalculo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OfTestHojaCalculo2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class OfTestHojaCalculo2
     */
    public OfTestHojaCalculo2()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args)
    {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        
        Paquete paquete3 = new Paquete(50,50,70);
        envio.addPaquete(paquete3);
        envio.print();
        
        Paquete paquete2Clonado = new Paquete(paquete2.getDimension(), paquete2.getPeso());
        envio.addPaquete(paquete2Clonado);
        
    }
}
