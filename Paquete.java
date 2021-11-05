import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Nombre autor
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private double volumen;    
    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        //TODO
        alto = 40 ;
        ancho = 30;
        largo = 50;
        peso = 8;
        volumen = alto * ancho * largo;
        this.dimension = new Dimension(alto,ancho,largo);

    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        peso = (int)Math.random()*7 + 2;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        volumen = alto * ancho * largo;
        this.dimension = new Dimension(alto,ancho,largo);

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
        volumen = this.dimension.getVolumen();  
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
       
       return volumen;

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
        
       return volumen/5000;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        double pesoVolumetrico = getPesoVolumetrico();
        if(peso > pesoVolumetrico)
           return peso;
        else{
           return pesoVolumetrico;
        }

    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
       Paquete clone = new Paquete(alto,ancho,largo);
       return clone;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
       System.out.println("Descripción del paquete");
       dimension.print();
       System.out.println("                    Peso real          "+ peso + ("kg "));
       System.out.println("                    Volumen          "+ volumen + ("cm3 "));
       System.out.println("                    Peso volumétrico          "+  getPesoVolumetrico() + ("kg "));
       return null;

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
