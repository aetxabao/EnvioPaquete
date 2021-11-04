import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author -   Inigo salinas..
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
        
        dimension= new Dimension(40,30,50);
        peso=8;
        
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        
        dimension= new Dimension(alto,ancho,largo);
        peso =(int)(Math.random()*8+2);

    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        
        this.dimension=dimension;
        this.peso=peso;

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
    
       return (getVolumen()/5000);

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        if (getPesoVolumetrico() > this.peso) 
        {
            return getPesoVolumetrico();
        }
        else
        {
            return this.peso;
        }
        
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
        //TODO
       Paquete paqueteClonado = new Paquete(dimension,peso);
       return paqueteClonado;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        //TODO
       String str="";
       str+=String.format("Descripcion del paquete\n");
       str+=String.format("%20s%10.2f(cm)\n" , "Alto:",this.dimension.getAlto());
       str+=String.format("%20s%10.2f(cm)\n" , "Largo:",this.dimension.getLargo());
       str+=String.format("%20s%10.2f(cm)\n" , "Ancho:",this.dimension.getAncho());
       str+=String.format("%20s%10.2f(Kg)\n" , "Peso real:",this.peso );
       str+=String.format("%20s%10.2f(cm3)\n" , "Volumen:",this.getVolumen() );
       str+=String.format("%20s%10.2f(Kg\n" , "Peso volumetrico:",this.getPesoVolumetrico());
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
