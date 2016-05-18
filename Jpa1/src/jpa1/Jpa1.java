/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

public class Jpa1 {

 public static void main(String[] args) {

 final CtrlConocidos ctrlConocidos = new CtrlConocidos();

 final Conocido pp = new Conocido("Pp", "55555555");

 System.out.print("Contenido original de pp: ");

 System.out.println(pp);

 ctrlConocidos.agrega(pp);

 System.out.println("Después de agregar: " + pp);

 final Long idPp = pp.getId();

 System.out.println(pp);

 pp.setNombre("Pp Pp");

 pp.setTelefono("555555556");

 System.out.println("Después de modificar: " + ctrlConocidos.modifica(pp));

 System.out.println("El objeto de la referencia pp: " + pp);

 System.out.println("El objeto en la base de datos: " + ctrlConocidos.busca(

 idPp));

 ctrlConocidos.agrega(new Conocido("Qk", "121212121212"));

 ctrlConocidos.agrega(new Conocido("Tt", "777777777777"));
 System.out.println("Contenido de la base: " + ctrlConocidos.lista());

 ctrlConocidos.elimina(idPp);

 System.out.println("Sin Pp: " + ctrlConocidos.lista());

 }

}
    

