/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.math.BigDecimal;

/**
 *
 * @author dicky
 */
public class Operativo extends Personal{
  
    // Se crean atributos de salario y tiempo extra
  private BigDecimal overtime;
  private BigDecimal salary;

  public Operativo() {

  }

  public Operativo(int id, String name, String surname, String departament, BigDecimal overtime) {
    super(id, name, surname, departament);
    this.overtime = overtime;
  }

  public BigDecimal getOvertime() {
    return overtime;
  }

  public void setOvertime(BigDecimal overtime) {
    this.overtime = overtime;
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
    //La nómina se calcula multiplicando el sueldo base ($38) x hora x 40 horas a la semana + ($17 las horas extra)
    
    
    // Se ingresa el salario por hora y se multiplica por horas semana
    // Se calcula la hora extra (hora + $17 pesos de extra por hora).
    // Se suma la comision al sueldo semanal y se regresa
    salary = new BigDecimal("38.0");
    BigDecimal time = new BigDecimal("40.0");
    BigDecimal overpay = new BigDecimal("17.0");
    BigDecimal extraTime = salary.add(overpay).multiply(overtime);
    BigDecimal amount = salary.multiply(time).add(extraTime);
    return amount;  
    
  }
  
}
