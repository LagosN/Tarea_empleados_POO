package org.example;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, double valorHora, int horasTrabajadas, double salarioBase) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public double calcularSalario() {
        double salario;
        salario = this.horasTrabajadas * this.valorHora;

        return salario;
    }

    @Override
    public String obtenerRol() {
        return "Por horas";
    }
    @Override
    public String mostrarInfo() {
        String mensaje;
        mensaje = super.mostrarInfo() + "horas trabajas='" + horasTrabajadas + '\'' +
                ", valor Hora='" + valorHora;
        return mensaje;
    }
}
