import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Juan Garbayo
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
        dimension = new Dimension(40, 30, 50);
        peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        dimension = new Dimension(alto, ancho, largo);
        generador = new Random();
        peso = generador.nextInt(7) + 2;
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        dimension = new Dimension(dimension.getAlto(), dimension.getAncho(), dimension.getLargo());
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
       return dimension.getAlto() * dimension.getAncho() * dimension.getLargo();
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
       return getVolumen() / 5000;
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
       if (peso > getPesoVolumetrico()) {
           return peso;
       } else {
           return getPesoVolumetrico();
       }
    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
        return new Paquete(dimension.clone(), this.peso);
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
       String descripcion = "Descripción del paquete\n";
       String pesoReal = "Peso real: ";
       String Volumen = "Volumen: ";
       String PesoVolumetrico = "Peso volumétrico: ";
       String str = "";
       str += String.format("%s", descripcion);
       str += dimension.toString();
       str += String.format("%20s %10.2f(Kg)\n%20s %10.2f(cm3)\n%20s %10.2f(Kg)", pesoReal, peso, Volumen, getVolumen(), PesoVolumetrico, getPesoVolumetrico());
       return str;
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
