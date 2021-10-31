
/**
 * Clase para probar las clases Envio, Paquete y Dimension.
 * 
 * 
 * @author - Sergio Cobos 
 * 
 */
public class TestHojaCalculo
{
    public static void main(String[] args){
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        
        Dimension dimension = new Dimension(50,50,70);
        Paquete paquete3 = new Paquete(dimension,13);
        envio.addPaquete(paquete3);
        envio.print();
        
        envio.addPaquete(paquete2.clone());
    }
}
