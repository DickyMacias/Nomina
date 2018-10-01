/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author dicky
 */
public class Ventas extends Personal{
  
    // Se crean atributos de salario y ventas
  private BigDecimal sales;
  private BigDecimal salary;

  public Ventas() {
  }

  public Ventas(int id, String name, String surname, String departament, BigDecimal sales) {
    super(id, name, surname, departament);
    this.sales =sales;
  }

  public BigDecimal getSales() {
    return sales;
  }

  public void setSales(BigDecimal sales) {
    this.sales = sales;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
  
  
   // La clase BigDecimal tiene sus propios metodos para adicion, sustraccion, multiplicacion y division 
  @Override
  public BigDecimal pagarNomina() {
    //La nómina se calcula con base en el sueldo base: $5000 mensuales + 5% de comisión por ventas
    
    // Se ingresa el salario mensual y se divide entre 30.5 que son los dias promedio por mes
    // Se saca salario diario y se multiplica por dias de la semana (7)
    // Se calcula la comision multiplicando las ventas por el porcentaje
    // Se suma la comision al sueldo semanal y se regresa
    salary = new BigDecimal("5000.0");
    BigDecimal monthDays = new BigDecimal("30.5");
    BigDecimal weekDays = new BigDecimal("7.0");
    BigDecimal percent  = new BigDecimal("0.05"); 
    BigDecimal day = salary.divide(monthDays, 2, RoundingMode.HALF_EVEN);
    BigDecimal week = day.multiply(weekDays);
    BigDecimal commission = sales.multiply(percent);
    BigDecimal amount =  week.add(commission);
    return amount;
    
  }
  
  
  
}
