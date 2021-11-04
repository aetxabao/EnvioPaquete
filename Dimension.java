
/**
 *  Representa una dimensión
 *  
 *  @author - Juan Garbayo
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
       return alto * ancho * largo;
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        return new Dimension(this.alto, this.ancho, this.largo);
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String str = "";
        String altura = "Alto: ";
        String anchura = "Ancho: ";
        String largura = "Largo: ";
        str += String.format("%20s %10.2f(cm)\n%20s %10.2f(cm)\n%20s %10.2f(cm)\n", altura, alto, anchura, ancho, largura, largo);
        return str;
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
