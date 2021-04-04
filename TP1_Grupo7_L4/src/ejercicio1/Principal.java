package ejercicio1;



//Participantes: Brian Franco - Agustin Paez -


public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		emp1.setNombre("Pedro");
		emp1.setEdad(29);
		System.out.println(emp1.toString());
		
        Empleado emp2 = new Empleado();
		
		System.out.println(emp2.toString());
		
		Empleado emp3 = new Empleado();
		emp3.setNombre("Juan");
		emp3.setEdad(44);
		System.out.println(emp3.toString());
		
		Empleado emp4 = new Empleado();
		
		System.out.println(emp4.toString());
		
		Empleado emp5 = new Empleado();
		emp5.setNombre("Lucas");
		emp5.setEdad(34);
		System.out.println(emp5.toString());
		System.out.println(Empleado.devuelveProximoID());

	}

}
