import java.util.Scanner;
/**
 * Utilizaremos esta clase para probar el resto de clases.
 * 
 * @author - Juan Garbayo
 */
public class TestHojaCalculo
{
    /**
     * Constructor for objects of class TestHojaCalculo
     */
    public static void main(String[] args)
    {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40, 60, 40);
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        System.out.println(envio.toString());
        System.out.println("------------------------------------");
        
        Paquete paquete3 = new Paquete(50, 50, 70);
        envio.addPaquete(paquete3);
        System.out.println(envio.toString());
        System.out.println("------------------------------------");
        
        envio.addPaquete(paquete2.clone());
        
    }
} 
