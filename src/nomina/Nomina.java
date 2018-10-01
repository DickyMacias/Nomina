/*
Integrantes del Equipo:
== Ricardo Ivan Macias
== Daniel Emir Olivas
== Luis Orozco
== Victor Valdez
== Karen Peña
 */
package nomina;

import java.util.ArrayList;
import java.math.BigDecimal;

/**
 *
 * @author dicky
 */
public class Nomina {

  // Se crea Arreglo en un ArrayList para agregarle los empleados
  public static ArrayList<Personal> nomina = new ArrayList<Personal>();
    
  public static void main(String[] args) {
    
   
  // Se instancian los usuarios y se pasan parametros.
    Personal admin1 = new Administrativo(1,"Jose","Castaneda","Gerencia"); 
    Personal admin2 = new Administrativo(2,"Elias","Castaneda","Gerencia");
    Personal admin3 = new Administrativo(3,"Arlette","Chavira","Sucursal");
    Personal admin4 = new Administrativo(4,"Antonio","Jagou","Sucursal");
    Personal admin5 = new Administrativo(5,"Mario","Porras","Campo");
    Personal ventas1 = new Ventas(101,"Malu","Grijalva","Campo",new BigDecimal("100000.0"));
    Personal ventas2 = new Ventas(102,"Veronica","Juarez","CAC",new BigDecimal("75000.0"));
    Personal oper1 = new Operativo(1001,"Maria","Palma","CAC",new BigDecimal("10.0"));
    Personal oper2 = new Operativo(1002,"Ernesto","Rodriguez","CAC",new BigDecimal("12.0"));
    Personal oper3 = new Operativo(1003,"Ivan","Macias","Almacen",new BigDecimal("1.0"));
    Personal oper4 = new Operativo(1004,"Humberto","Montano","Almacen",new BigDecimal("5.0"));
    Personal oper5 = new Operativo(1005,"Victor","Salinas","Campo",new BigDecimal("15.0"));
    Personal oper6 = new Operativo(1006,"Daniel","Olivas","Campo",new BigDecimal("0.0"));
    Personal oper7 = new Operativo(1007,"Karen","Pena","Operaciones",new BigDecimal("17.0"));
    Personal oper8 = new Operativo(1008,"Ricardo","Naranjo","Operaciones",new BigDecimal("45.0"));

    // Se agregan los empleados al ArreyList
    nomina.add(admin1);
    nomina.add(admin2);
    nomina.add(admin3);
    nomina.add(admin4);
    nomina.add(admin5);
    nomina.add(ventas1);
    nomina.add(ventas2);
    nomina.add(oper1);
    nomina.add(oper2);
    nomina.add(oper3);
    nomina.add(oper4);
    nomina.add(oper5);
    nomina.add(oper6);
    nomina.add(oper7);
    nomina.add(oper8);
    
    // Se imprime informacion de la nomina
    System.out.println("Los pagos de nomina son: \n");
    
    // Se inicializa el totalizador de sueldos.
    BigDecimal totalAmount = new BigDecimal("0.0");
    
    // Se da un formato tipo tabla.
    System.out.println("\t " + "ID" + "\t " + "Nombre" +"\t "+ "Apellido" + "\t " + "Pago de la semana");
    
    // Se hace un foreach para llamar a cada empleado del ArrayList
    for (Personal empleado : nomina){ 
      // Se suma la cantidad de cada empleado al totalizador
      totalAmount = totalAmount.add(empleado.pagarNomina());
      // Se imprime la informacion de cada usuario
      System.out.println("\t " + empleado.getId() +"\t " + empleado.getName() +"\t "+ empleado.getSurname() + "\t " + empleado.pagarNomina());
    
    }
    // Se imprime la cantidad total a pagar por la semana de nomina.
    System.out.println("");
    System.out.println("El total a pagar es: " + totalAmount);
    
  }
  
}
