
/**
 * Write a description of class TestHojaCalculo here.
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
        // no hay peso
        Dimension dimension = new Dimension(50, 50, 70);
        Paquete paquete3 = new Paquete(dimension, 13);
        envio.addPaquete(paquete3);
        
        Paquete paquete2Copia = new Paquete(paquete2.getDimension(), paquete2.getPeso());
        envio.addPaquete(paquete2Copia);
        
        envio.print();
        
    }
}
