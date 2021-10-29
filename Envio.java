
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres 
 *  
 * 
 * @author -   Nombre autor
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
    public Envio()
    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;
    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1()
    {
        return paquete1;
    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2()
    {
        return paquete2;
    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3()
    {
        return paquete3;
    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes()
    {
        int numP = 0;

        if(paquete1 != null) numP ++;
        if(paquete2 != null) numP ++;
        if(paquete3 != null) numP ++;
        return numP;
    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean isEnvioCompleto()
    {
        return getNumeroPaquetes() == 3;
    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete)
    {
        if(getPaquete1() == null)
        {
            paquete1 = paquete;
            return;
        }
        if(getPaquete2() == null)
        {
            paquete2 = paquete;
            return;
        }
        if(getPaquete3() == null)
        {
            paquete3 = paquete;
            return;
        }
        System.out.println("No se admiten mas paquetes en el envio.");
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
     *  
     */
    public double calcularCosteTotalEnvio()
    {
        double peso = 0;
        if(paquete1 != null)
        {
            peso += paquete1.calcularPesoFacturable();
        }
        if(paquete2 != null)
        {
            peso += paquete2.calcularPesoFacturable();
        }
        if(paquete3 != null)
        {
            peso += paquete3.calcularPesoFacturable();
        }
        return PRECIO_KILO * Math.ceil(peso);
    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString()
    {
        String salida = "Nº de paquetes: " + getNumeroPaquetes() + "\n";
        if(paquete1 != null)
        {
            salida += paquete1.toString();
        }
        if(paquete2 != null)
        {
            salida += paquete2.toString();
        }
        if(paquete3 != null)
        {
            salida += paquete3.toString();
        }
        salida += String.format("%20s%10.2f€", "Coste total del envio: ", calcularCosteTotalEnvio());
        salida += "\n--------------------------------------------------\n";
        return salida;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print()
    {
        System.out.println(this.toString());
    }

    
}
