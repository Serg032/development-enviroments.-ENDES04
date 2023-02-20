package cuentas;

/***
 * This class is the main class of the software.
 *
 * Sergio Radigales.
 */

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = operativa_cuenta("Antonio López", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    /**
     * This is method is to operate over cuenta object.
     * @param nombre to give an owner to the bank account.
     * @param cantidad to give a quantity.
     * @param tipo to give this attribute.
     * @return the whole account.
     * */
    public static CCuenta operativa_cuenta(String nombre, float cantidad, float tipo) {
        CCuenta cuenta = new CCuenta(nombre, "1000-2365-85-1230456789", cantidad, tipo);
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        return cuenta;
    }
}
