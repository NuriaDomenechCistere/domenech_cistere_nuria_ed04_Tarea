package com.mycompany.ud4_te1;

/**
  * La clase CCuenta crea una cuenta a través de diferentes atributos: el nombre de la persona dueña de la cuenta, el número de cuenta, el saldo que tiene y el tipo de Interés que se le aplica. <b>Tiene la funcionalidad de ingresar y retirar dinero de la misma.</b>
 * @author Núria
 * @version 6.0

 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     *
     */
    public CCuenta() {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
      * <u>Retorna el saldo de la cuenta</u> en el momento en que se llama al método.
     * @return Retorna el saldo en cuenta actual. En la clase Main se utiliza para devolver el valor en cuanto se ha llamado al método ingresar o retirar y se ha cambiado ese valor.
     * @see com.mycompany.ud4_te1.Main

     */
    public double getSaldo() {
        return saldo;
    }

    /**
      *Calcula la cantidad de dinero en la cuenta que queda después de realizar un movimiento de ingreso. De esta manera, se suma al saldo que había el valor que se introduce como cantidad.
     * @param cantidad Es un valor númerico que se suma al saldo de la cuenta en el momento de llamar al método.
     * @throws Exception Lanza una excepción si el valor del parámetro cantidad es menor que 0 ya que no es posible ingresar una cantidad negativa puesto que es <b>imposible</b> ingresar dinero en negativo.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }
    private static final int COMISION = 2;





}
