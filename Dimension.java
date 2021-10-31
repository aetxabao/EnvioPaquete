
/**
 *  Representa una dimensión
 *  
 *  @author - Aritz Arrondo Villaplana
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
       
        double volumen = this.alto*this.ancho*this.largo;
        return volumen;
        
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        //TODO
        Dimension clone = new Dimension(this.alto,this.ancho,this.largo);
        return clone;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String str="";
        str += String.format("%20s%10.2f(cm)\n","Alto:",this.alto);
        str += String.format("%20s%10.2f(cm)\n","Ancho:",this.ancho);
        str += String.format("%20s%10.2f(cm)\n","Largo:",this.largo);
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
