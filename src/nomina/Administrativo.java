/*
// Clase hija que se extiende de Personal.
 */
package nomina;

import java.math.BigDecimal;

/**
 *
 * @author dicky
 */
public class Administrativo extends Personal{
  
  // Se crean atributos de salario y compensacion. Compensacion es metodo unicod e esta clase
  private BigDecimal compensation;
  private BigDecimal salary;

  public Administrativo() {

  }

  public Administrativo(int id, String name, String surname, String departament) {
    super(id, name, surname, departament);

  }

  public BigDecimal getCompensation() {
    return compensation;
  }

  public void setCompensation(BigDecimal compensation) {
    this.compensation = compensation;
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
    // La nómina se calcula multiplicando el sueldo base($42) x hora x 40 horas a la semana
    salary = new BigDecimal("42.0");
    BigDecimal time = new BigDecimal("40.0");
    BigDecimal amount = salary.multiply(time);
    return amount;   
    
  }
  
}
