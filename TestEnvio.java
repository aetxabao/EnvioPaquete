
/**
 * Clase con código para probar el resto de clases
 * 
 * @author -
 * 
 */
public class TestEnvio {

    /**
     * Código para probar todas las clases (leer enunciado)
     */
    public static void main(String[] args) {

        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40, 60, 40);

        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        System.out.println(envio.toString());

        System.out.println("----------------------------------------------------");
        Paquete paquete3 = new Paquete(new Dimension(50, 50, 70), 13);
        envio.addPaquete(paquete3);
        System.out.println(envio.toString());

        System.out.println("----------------------------------------------------");
        Paquete copiaDePaquete2 = paquete2.clone();
        envio.addPaquete(copiaDePaquete2);

    }

}
