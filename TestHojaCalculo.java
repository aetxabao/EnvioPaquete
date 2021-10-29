/**
 * Clase de pruba que imprime un envío de dos paquetes primero, luego añade una más y 
 * lo vuuelve a imprimir. Y finalmente intenta añadir un cuarto pedido, que 
 * acaba siendo rechazado.
 *
 * @author - Evelin Virunurm
 */
public class TestHojaCalculo {
    public static void main(String[] args) {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40, 60, 40);
        
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();

        Dimension dimension = new Dimension(50, 50, 70);
        Paquete paquete3 = new Paquete(dimension, 13);
        envio.addPaquete(paquete3);
        envio.print();
        
        Paquete paquete2Copia = new Paquete(paquete2.getDimension(), paquete2.getPeso());
        envio.addPaquete(paquete2Copia);
    }
}
