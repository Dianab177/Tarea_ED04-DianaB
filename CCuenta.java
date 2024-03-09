

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    // Getters y setters necesarios...

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o superior al saldo.
     */
    public void retirar(double cantidad) throws Exception {
        // Implementación existente...
    }

    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        // Implementación existente...
    }
}
