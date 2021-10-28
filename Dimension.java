
/**
 *  Representa una dimensión
 *  
 *  @author - Evelin Virunurm
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
        double volumen = this.getAlto() * this.getAncho() * this.getLargo();
        return volumen;
    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        //TODO
        Dimension dimensionClone = new Dimension(this.getAlto(), this.getAncho(), this.getLargo());
        return dimensionClone;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        //TODO alinear el texto
        String str = "Alto:     " + this.getAlto() + "(cm)\n" +
                     "Ancho:    " + this.getAncho() + "(cm)\n" +
                     "Largo:    " + this.getLargo() + "(cm)\n";
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
