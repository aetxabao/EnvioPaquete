/**
 * Clase que crea dos paquetes con diferentes constructores, un envío, añade al envío los paquetes,
 * crea una dimension y un paquete a partir del tercer constructor utilizando ésta, crea un clon del
 * segundo paquete, lo intenta añadir al envío pero está completo así que salta un mensaje de error.
 * 
 * @author Aritz Arrondo Villaplana
 */
public class TestHojaCalculo
{
    public static void main(String[] args) {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        Envio envio1 = new Envio();
        envio1.addPaquete(paquete1);
        envio1.addPaquete(paquete2);
        envio1.print();
    
        Dimension dimension1 = new Dimension(50, 50, 70);
        Paquete paquete3 = new Paquete(dimension1, 7);
        envio1.addPaquete(paquete3);
        envio1.print();
    
        Paquete paquete2Clone = new Paquete(paquete2.getDimension(), paquete2.getPeso());
        envio1.addPaquete(paquete2Clone);
}
    
}
