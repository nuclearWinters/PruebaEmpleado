/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaempleado;
import java.math.BigDecimal;

/**
 *
 * @author Armando
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private BigDecimal salario;
    public Empleado(){
    }
    public String getNombre () { return nombre; } 
    public String getApellido () { return apellido; } 
    public BigDecimal getSalario () { return salario; } 
    //método para asignar nombre pais en el objeto Pais.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setSalario(double salario){
        this.salario = new BigDecimal(salario);
    }
    public void salarioAnual(){
        System.out.println("Salario anual: " + this.salario.multiply(new BigDecimal("12")));
    }
    public void aumento(){
        this.salario = this.salario.multiply(new BigDecimal("1.1"));
    }
    public void caracteristicasEmpleado(){
        System.out.println("Nombre: " + this.nombre + ", Apellidos: " + this.apellido + ", Salario mensual: " + this.salario);
    }
    public void salarioAnualAumento(){
        System.out.println("Salario anual con aumento: " + this.salario.multiply(new BigDecimal("12")));
    }
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Antonio");
        empleado1.setApellido("Morales");
        empleado1.setSalario(6000.0);
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Armando");
        empleado2.setApellido("Rueda");
        empleado2.setSalario(10000.0);
        empleado1.caracteristicasEmpleado();
        empleado2.caracteristicasEmpleado();
        empleado1.salarioAnual();
        empleado2.salarioAnual();
        empleado1.aumento();
        empleado2.aumento();
        empleado1.salarioAnualAumento();
        empleado2.salarioAnualAumento();
    }
}
