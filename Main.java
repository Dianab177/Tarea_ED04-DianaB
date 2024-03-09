

/**
 * Clase principal que opera con la cuenta.
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1; // Cambio de nombre de la variable

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativaCuenta(cuenta1, 695); // Llamada al nuevo método operativaCuenta con un ingreso

        // Realizar operaciones adicionales si es necesario
    }

    /**
     * Realiza operaciones con la cuenta, como retiradas e ingresos.
     *
     * @param cuenta   Cuenta a operar.
     * @param cantidad Cantidad a ingresar.
     */
    private static void operativaCuenta(CCuenta cuenta, double cantidad) {
        double saldoActual = cuenta.obtenerSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.err.println("Error al retirar: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad); // Nuevo parámetro para el método ingresar
        } catch (Exception e) {
            System.err.println("Error al ingresar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
