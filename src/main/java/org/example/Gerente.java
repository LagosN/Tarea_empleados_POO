package org.example;

public class Gerente extends Empleado implements Bonificable {
    private String departamento;
    private double bonificacionAnual;
    private double metaAnual;

    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, String departamento, double bonificacionAnual, double metaAnual) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);
        this.departamento = departamento;
        this.bonificacionAnual = bonificacionAnual;
        this.metaAnual = metaAnual;
    }


    public double getMetaAnual() {
        return metaAnual;
    }

    public void setMetaAnual(double metaAnual) {
        this.metaAnual = metaAnual;
    }

    public double getBonificacionAnual() {
        return bonificacionAnual;
    }

    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void asignarDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularBonificacion() {
        return 0;
    }

    @Override
    public void asinarMeta(double meta) {
        metaAnual = meta;

    }

    @Override
    public double calcularSalario() {
        double sueldo;
        if (metaAnual >= 100.0){
            bonificacionAnual = getSalarioBase() * 0.2;
            sueldo = getSalarioBase() + bonificacionAnual;
            return  sueldo;


        }

        sueldo = getSalarioBase();
        return sueldo;
    }

    @Override
    public String obtenerRol() {
        return "Gerente";
    }
}
