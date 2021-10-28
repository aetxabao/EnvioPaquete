import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Evelin Virunurm
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
        this.dimension = new Dimension(40, 30, 50);
        this.peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        //TODO compobar que el num generado random esta ok
        this.dimension = new Dimension(alto, ancho, largo);
        // this.peso = (generador.nextDouble() * 7) + 2;
        this.peso = 2;
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
       //TODO comprobar que ok
       // double volumen = this.dimension.getVolumen();
       return this.dimension.getVolumen();
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
        //TODO comprobar que ok
        // double pesoVolumentrico = this.getVolumen() / 5000.0;
        return this.getVolumen() / 5000.0;
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        //TODO comprobar que ok
        // double pesoFacturable = this.getPesoVolumetrico() > this.getPeso() ? this.getPesoVolumetrico() : this.getPeso();
        return (this.getPesoVolumetrico() > this.getPeso() ? this.getPesoVolumetrico() : this.getPeso());
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
        //TODO comprobar que ok
        Paquete paqueteCopy = new Paquete(this.dimension.clone(), this.peso);
        return paqueteCopy;
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        //TODO ask teacher if we should use format since we have to return a simple string
        String str = "Descripcicón del paquete\n" + 
                     "                   :" + "         :" + 
                     "               Alto:" + "        00" +
                     "              Ancho:" + "         :" +
                     "              Largo:" + "         :" +
                     "          Peso real:" + "         :" +
                     "            Volumen:" + "         :" +
                     "   Peso volumétrico:" + "         :";
                     
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
