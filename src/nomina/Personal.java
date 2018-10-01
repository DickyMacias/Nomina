/*
Esta clase es abstracta porque tiene un constructor que es un metodo concreto y una metodo abstracto que es pagar.
 */
package nomina;

// Se importa la clase BigDecimal porque se usaran datos financieros para los decimales.
import java.math.BigDecimal;

/**
 *
 * @author dicky
 */


public abstract class Personal {
  
   public int id;
   public String name;
   public String surname;
   public String departament;

  // Constructor
  public Personal() {
  }

  // Metodo concreto (Constructor sobrecargado).
  public Personal(int id, String name, String surname, String departament) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.departament = departament;
  }

  // Setters y getters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getDepartament() {
    return departament;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }
  
  
   
  // Metodo abstracto tipo BigDecimal para el calculo de la nomina
   public abstract BigDecimal pagarNomina(); 
  
}
