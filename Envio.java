
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author -   Joan García
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;
    private int numeroPaquetes;
    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;
        numeroPaquetes = 0;

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
        //TODO
        if(paquete1 == null && paquete2 == null && paquete3 == null){
            numeroPaquetes = 0;
        }
        else if((paquete1 != null && paquete2 == null && paquete3 == null)) //|| (paquete1 == null && paquete2 != null && paquete3 == null) || (paquete1 == null && paquete2 == null && paquete3 != null))
        {
            numeroPaquetes = 1;
        }
        else if((paquete1 != null && paquete2 != null && paquete3 == null)) //|| (paquete1 == null && paquete2 != null && paquete3 != null) || (paquete1 != null && paquete2 == null && paquete3 != null))
        {
            numeroPaquetes = 2;
        }
        else if(paquete1 != null && paquete2 != null && paquete3 != null){
            numeroPaquetes = 3;
        }
        return numeroPaquetes;

    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean isEnvioCompleto() {
        //TODO
        if(getNumeroPaquetes() == 3){
            return true;
        }
        return false;

    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
        //TODO
        if(isEnvioCompleto() == true){
            System.out.println("No se admiten más paquetes en el envío");
        }
        if(paquete1 == null){
            paquete1 = paquete;
        }
        else if(paquete2 == null){
            paquete2 = paquete;
        }
        else if(paquete3 == null){
            paquete3 = paquete;
        }
        numeroPaquetes++;


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
    public double calcularCosteTotalEnvio() {
        //TODO
        double totalPesoF = 0;
        double total;

        // totalPesoF = paquete1.calcularPesoFacturable() + paquete2.calcularPesoFacturable() 
        // + paquete3.calcularPesoFacturable();;
        // total = PRECIO_KILO * (Math.ceil(totalPesoF));
        if(getNumeroPaquetes() == 1){
            totalPesoF = paquete1.calcularPesoFacturable();
        }
        if(getNumeroPaquetes() == 2){
            totalPesoF = paquete1.calcularPesoFacturable() + paquete2.calcularPesoFacturable();
        }
        if(isEnvioCompleto() == true){
            totalPesoF = paquete1.calcularPesoFacturable() + paquete2.calcularPesoFacturable() + paquete3.calcularPesoFacturable();
        }
        total = PRECIO_KILO * (Math.ceil(totalPesoF));
        return total;

    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
        //TODO
        String str = ""; 
        if(paquete1 != null && paquete2 == null && paquete3 == null){
            String str1 = String.format("Nº de paquetes: %d \n\n%s \n\nCoste total envío: %.2f€" ,
                getNumeroPaquetes(),paquete1.toString(), calcularCosteTotalEnvio());
            return str1;
        }
        if(paquete1 != null && paquete2 != null && paquete3 == null){
            String str2 = String.format("Nº de paquetes: %d \n\n%s \n\n%s \n\nCoste total envío: %.2f €" ,
                getNumeroPaquetes(),paquete1.toString(),paquete2.toString(), calcularCosteTotalEnvio());
            return str2;
        }
        if(paquete1 != null && paquete2 != null && paquete3 != null){
            String str3 = String.format("Nº de paquetes: %d \n\n%s \n\n%s \n\n%s \n\nCoste total envío: %.2f €" ,
                getNumeroPaquetes(),paquete1.toString(),paquete2.toString(), paquete3.toString(), calcularCosteTotalEnvio());
            return str3;
        }
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
