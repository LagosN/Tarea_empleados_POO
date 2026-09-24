package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados =new ArrayList<>();
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Felipe","001","123456789",true, 5000, 10000);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Tomas", "002", "123456987", true, 200,12,0);
        Empleado empleadoGerente = new Gerente("Ignacio", "003", "789456123", true, 10000,"Finanzas", 0.0,0.0);

        empleados.add(empleadoPorHoras);
        empleados.add(empleadoAsalariado);
        empleados.add(empleadoGerente);

        for (Empleado empleado: empleados){
            System.out.println(empleado.mostrarInfo());
            System.out.println(" Salario calculado" + empleado.calcularSalario() + " Rol" + empleado.obtenerRol() );


        }


        // Aquí puedes probar tus clases
    }
}
