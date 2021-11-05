import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Inigo Gutierrez
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
        Random numerosRandom = new Random();
        peso = (int)(numerosRandom.nextDouble() * 8 + 2);
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
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
       
       return dimension.getVolumen();

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
       
       return getVolumen()/5000;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
       if(getPesoVolumetrico() > peso){
           return getPesoVolumetrico();
       }
       else{
           return peso;
       }
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
       
        dimension =  this.dimension.clone();
        Paquete paquete = new Paquete(dimension, this.peso);
        return paquete;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
       String str="";
        str= String.format("Descripcion del paquete: \n               Alto: %10.2f(cm)\n              Ancho: %10.2f(cm)\n              Largo: %10.2f(cm)\n          Peso real: %10.2f(kg)\n            Volumen: %10.2f(cm3)\n   Peso Volumetrico: %10.2f(kg)"
        , dimension.getAlto(), dimension.getAncho(), dimension.getLargo(), peso, getVolumen(), getPesoVolumetrico());
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
