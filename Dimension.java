
/**
 *  Representa una dimensión
 *  
 *  @author - Bautista
 */
public class Dimension extends TestHojaCalculo  
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
        Dimension clon = new Dimension(alto,ancho,largo);
        return clon;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String lineaFormateada = String.format("%20s%10.2d%4s\n%20s%10.2d\n%20s%10.2d\n",
                                "Alto:", alto,"(cm)","Ancho:", ancho,"(cm)","Largo:",largo,"(cm)");
        return lineaFormateada;

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
