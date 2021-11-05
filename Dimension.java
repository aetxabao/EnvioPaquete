
/**
 *  Representa una dimensión
 *  
 * Adrian Garcia Galera - Nombre autor
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;
    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * calcula y devuelve el volumen de la dimensión (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() {
        double volumen;
        volumen = alto * largo * ancho;
        return volumen;
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        Dimension clon = new Dimension(this.alto, this.largo, this.ancho);
        return clon;

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString(){
        return String.format("Alto: " + alto + " cm\nLargo: " 
        + largo + " cm\nAncho: " + ancho +
        " cm\nVolumen: " + getVolumen() + " cm3");
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
