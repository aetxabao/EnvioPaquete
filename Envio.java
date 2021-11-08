
/**
 * Un objeto de esta clase representa un envío de varios paquetes, máximo tres
 * 
 * 
 * @author - Nombre autor
 * 
 */
public class Envio {
    private final double PRECIO_KILO = 2.2; // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor Inicializa los paquetes a null (inicialmente el envío no tiene
     * paquetes)
     */
    public Envio() {
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
     * Devuelve el nº de paquetes en el envío (dependerá de cuántos paquetes estén a
     * null)
     */
    public int getNumeroPaquetes() {
        int total = 0;
        if (this.paquete3 != null) {
            total = 3;
        } else if (this.paquete2 != null) {
            total = 2;
        } else if (this.paquete1 != null) {
            total = 1;
        }
        return total;
    }

    /**
     * Devuelve true si el envío está completo, false en otro caso (tiene
     * exactamente 3 paquetes)
     */
    public boolean isEnvioCompleto() {
        return this.getNumeroPaquetes() == 3;
    }

    /**
     * Se añade un nuevo paquete al envío Si el envío está completo se muestra el
     * mensaje "No se admiten más paquetes en el envío" Si no está completo se añade
     * el paquete al envío teniendo en cuenta si se añade como primero, segundo o
     * tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
        if (this.isEnvioCompleto()) {
            System.out.println("No se admiten más envíos\n");
        } else {
            int totalPaquetes = this.getNumeroPaquetes();
            switch (totalPaquetes) {
            case 0:
                paquete1 = paquete;
                break;
            case 1:
                paquete2 = paquete;
                break;
            case 2:
                paquete3 = paquete;
                break;
            }

        }
    }

    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste: - se obtiene el peso facturable de cada paquete - se
     * suman los pesos facturables de todos los paquetes del envío - se calcula el
     * coste en euros según el precio del Kg (cada Kg. no completo se cobra entero,
     * 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     * 
     * 
     */
    public double calcularCosteTotalEnvio() {
        double pesoFacturable = 0;
        int totalPaquetes = this.getNumeroPaquetes();
        if (totalPaquetes >= 1) {
            pesoFacturable += paquete1.calcularPesoFacturable();
            if (totalPaquetes >= 2) {
                pesoFacturable += paquete2.calcularPesoFacturable();
                if (totalPaquetes == 3) {
                    pesoFacturable += paquete3.calcularPesoFacturable();

                }
            }
        }
        return Math.ceil(pesoFacturable) * PRECIO_KILO;
    }

    /**
     * Representación textual del envío con el formato exacto indicado (leer
     * enunciado)
     */
    public String toString() {
        int totalPaquetes = this.getNumeroPaquetes();
        String strResul = "";
        strResul += "Nº de paquetes: " + totalPaquetes + "\n";
        if (totalPaquetes >= 1) {
            strResul += paquete1.toString();
            if (totalPaquetes >= 2) {
                strResul += paquete2.toString();
                if (totalPaquetes >= 3) {
                    strResul += paquete3.toString();
                }
            }
            strResul += String.format("%20s:%10.2f€\n", "Coste total envío", this.calcularCosteTotalEnvio());
        }
        return strResul;
    }

    /**
     * Muestra en pantalla el objeto actual Este método se incluye como método de
     * prueba de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

}
