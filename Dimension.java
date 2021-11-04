
/**
 *  Representa una dimensión
 *  
 *  @author - Carlos Conde Zudaire
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
       //TODO
       double volumen;
       volumen = alto * ancho * largo;
       return volumen; 
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        //TODO
        Dimension dimensionClon = new Dimension(alto, ancho, largo);
        return dimensionClon;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        //TODO
        String str = String.format("%20s%10.2f%s\n%20s%10.2f%s\n%20s%10.2f%s", "Alto: ", alto, "(cm)", "Ancho: ", ancho, "(cm)", "Largo: ", largo, "(cm)");
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
