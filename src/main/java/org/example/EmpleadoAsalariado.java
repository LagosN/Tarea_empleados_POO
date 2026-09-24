package org.example;

public class EmpleadoAsalariado extends Empleado {
    private double sueldoMensual;

    public EmpleadoAsalariado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);
        this.sueldoMensual = sueldoMensual;
    }


    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSalario() {
        return this.sueldoMensual;
    }

    @Override
    public String obtenerRol() {
        return "Asalariado";
    }
}
