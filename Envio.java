
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author - Evelin Virunurm
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;
    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1() {
        return paquete1;
    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2() {
        return paquete2;
    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3() {
        return paquete3;
    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes() {
        //TODO igual se puede hacer con loop
        int numPaquetes = 0;
        if (this.getPaquete1() != null) {numPaquetes++;}
        if (this.getPaquete2() != null) {numPaquetes++;}
        if (this.getPaquete3() != null) {numPaquetes++;}
        return numPaquetes;
    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean isEnvioCompleto() {
       //TODO igual entre parentesis
       return getNumeroPaquetes() == 3 ? true : false;
    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
        //TODO comporbar que no se puede hacer loop.
        if (isEnvioCompleto()) {
            System.out.println("\n");
            System.out.println("--------------------------------------");
            System.out.println("No se admiten más paquetes en el envío");
            return;
        }
        
        if (this.getPaquete1() == null) {
            this.paquete1 = paquete;
        } else if (this.getPaquete2() == null) {
            this.paquete2 = paquete;
        } else {
            this.paquete3 = paquete;
        }
    }

    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste:
     *      - se obtiene el peso facturable de cada paquete 
     *      - se suman los pesos facturables de todos los paquetes del envío
     *      - se calcula el coste en euros según el precio del Kg 
     *      (cada Kg. no completo se cobra entero, 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     *     
     */
    public double calcularCosteTotalEnvio() {
        //TODO
        double pesoFacturableTotal = 0;
        double coste = 0;
        if (getPaquete1() != null) {
            pesoFacturableTotal += this.getPaquete1().calcularPesoFacturable();
        }
        if (getPaquete2() != null) {
            pesoFacturableTotal += this.getPaquete2().calcularPesoFacturable();
        }
        if (getPaquete3() != null) {
            pesoFacturableTotal += this.getPaquete3().calcularPesoFacturable();
        }
        coste = Math.ceil(pesoFacturableTotal) * this.PRECIO_KILO;
        return coste;
    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
       //TODO formatear
       String str = "Nº de paquetes: " + this.getNumeroPaquetes() + "\n" +
                    "Descripción del paquete\n" +
                    "                Alto:" + " " + "\n" +
                    "               Ancho:" + " " + "\n" +
                    "               Largo:" + " " + "\n" +
                    "           Peso real:" + " " + "\n" +
                    "             Volumen:" + " " + "\n" +
                    "    Peso volumétrico:" + " " + "\n" +
                    "\n" +
                    "Descripción del paquete\n" +
                    "                Alto:" + " " + "\n" +
                    "               Ancho:" + " " + "\n" +
                    "               Largo:" + " " + "\n" +
                    "           Peso real:" + " " + "\n" +
                    "             Volumen:" + " " + "\n" +
                    "    Peso volumétrico:" + " " + "\n" +
                    "\n" +
                    "Descripción del paquete\n" +
                    "                Alto:" + " " + "\n" +
                    "               Ancho:" + " " + "\n" +
                    "               Largo:" + " " + "\n" +
                    "           Peso real:" + " " + "\n" +
                    "             Volumen:" + " " + "\n" +
                    "    Peso volumétrico:" + " " + "\n" +
                    "\n" +
                    "   Coste total envío:" + this.calcularCosteTotalEnvio() + "\n";
       
       return str;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
