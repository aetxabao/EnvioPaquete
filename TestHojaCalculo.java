public class TestHojaCalculo
{
    public static void main(String[] args)
    {
        // borro la pantalla
        System.out.print("\u000C");

        // creo paquete1 con el primer constructor
        Paquete paquete1 = new Paquete();

        // creo paquete2 con el segundo constructor
        Paquete paquete2 = new Paquete(40, 60, 40);

        // creo un envio y añado los dos paquetes
        Envio miEnvio = new Envio();
        miEnvio.addPaquete(paquete1);
        miEnvio.addPaquete(paquete2);

        // muestro el envio por pantalla
        miEnvio.print();

        // creo paquete3 con el tercen constructor,
        // despues de crear una nueva dimension
        Dimension d = new Dimension(50, 50, 70);
        Paquete paquete3 = new Paquete(d, 13);

        // añado paquete3 al envio e imprimo
        miEnvio.addPaquete(paquete3);
        miEnvio.print();

        miEnvio.addPaquete(paquete2.clone());
    }    
}
