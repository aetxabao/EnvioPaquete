/**Esta clase sirva para probar el resto de clases
 * 
 * @author - Joan García
 * 
 */

public class TestHojaCalculo
{
    public static void main(String[]args)
    {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        System.out.println("-----------------------------------------------------------");
        
        Dimension dimension = new Dimension(50,50,70);
        Paquete paquete3 = new Paquete(dimension,13);
        envio.addPaquete(paquete3);
        envio.print();
        System.out.println("-----------------------------------------------------------");
        
        Paquete paquete2cln = new Paquete();
        paquete2cln = paquete2.clone();
        envio.addPaquete(paquete2cln);
    }
}
