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
        double bono;
            bono = bonificacionAnual * getSalarioBase();

            return  bono;



    }

    @Override
    public void asinarMeta(double meta) {
        metaAnual = meta;

    }

    @Override
    public double calcularSalario() {
        double bono;
        if (metaAnual >= 100.0){
            bonificacionAnual =  0.2;

            return  bonificacionAnual;
        }
        bonificacionAnual = 0;
        return bonificacionAnual;
    }

    @Override
    public String obtenerRol() {
        return "Gerente";
    }
}
