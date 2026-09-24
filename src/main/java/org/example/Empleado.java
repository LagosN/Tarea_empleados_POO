package org.example;

public abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo,double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void asginarTelefono(String telefono) {
        if (telefono.isBlank()){
            System.out.println("Error, debes agregar al menos un numero");
            return;}

        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario(); /*Calcula el salario según ñas reglas de cada tipo*/
    public abstract String obtenerRol(); /*  // devuelve "Por Horas", "Asalariado", "Gerente" */

    public void activar(){
        this.activo = true;

    }
    public void desactivar(){
        this.activo = false;

    }


    public String mostrarInfo() {
        return "Empleado" +
                "Nombre:" + nombre  +
                " IdEmpleado: " + idEmpleado  +
                " Telefono" + telefono +
                " Activo: " + (activo ? "Si" : "No")  +
                " SalarioBase: " + salarioBase ;
        /*Falta agregar rol en clases hijas */
    }
}
