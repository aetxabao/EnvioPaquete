import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - David Orayen
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        Dimension dimension = new Dimension(40,30,50);
        peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        // Crear nueva dimension 
        dimension = new Dimension(alto, ancho,largo);
        // Numero random
        generador = new Random();
        peso = (generador.nextDouble()*6.0 + 2.0);
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        //TODO
        this.dimension = dimension;
        this.peso = peso;
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() {

        return this.dimension.getVolumen();

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
        //Devolver el volumen del paquete/5000
        return getVolumen() / 5000;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        // Si es menor le doy el volumetrico, si no, el peso real
        if(getPesoVolumetrico() < peso){
            return getPesoVolumetrico();
        }else{
            return peso;
        }

    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
        // Devuelve un paquete con lo que se puede modificar(dimension y peso)
        Paquete paquete = new Paquete(dimension,peso);
        return paquete;
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        // Se puede hacer con menos texto pero asi me entiendo 
        String f = String.format("Descripción del paquete\n");
        String h = String.format("%20s%10.2f(cm)\n", "Alto:", dimension.getAlto());
        String a = String.format("%20s%10.2f(cm)\n", "Ancho:",dimension.getAncho());
        String b = String.format("%20s%10.2f(cm)\n", "Largo:",dimension.getLargo());
        String c = String.format("%20s%10.2f(Kg)\n", "Peso real:",calcularPesoFacturable());
        String d = String.format("%20s%10.2f(cm3)\n", "Volumen:",getVolumen());
        String e = String.format("%20s%10.2f(Kg)\n", "Peso Volumétrico:",getPesoVolumetrico());
        return f+h+a+b+c+d+e;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }
}
