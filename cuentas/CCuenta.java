package cuentas;
/**
 * Sergio Radigales.
 * */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * this method is a constructor for CCuenta class.
     * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * this method return the saldo.
     * @return saldo.
     * */
    public double estado()
    {
        return saldo;
    }
    /**
     * this method is to put in the account money.
     * @param cantidad
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * this method is get money from the account.
     * @param cantidad
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * nombre getter
     * @return nombre
     * */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * nombre setter
     * @param nombre
     * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * nombre getter
     * @return cuenta
     * */
    public String getCuenta() {
        return this.cuenta;
    }
    /**
     * nombre setter
     * @param cuenta
     * */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * saldo getter
     * @return saldo
     * */
    public double getSaldo() {
        return this.saldo;
    }
    /**
     * saldo setter
     * @param saldo
     * */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * tipoInteres getter
     * @return tipoInteres
     * */
    public double getTipoInterés() {
        return this.tipoInterés;
    }
    /**
     * tipoInteres setter
     * @param tipoInterés
     * */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
