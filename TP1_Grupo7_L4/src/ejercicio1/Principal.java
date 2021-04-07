package ejercicio1;



//Participantes: Brian Franco - Agustin Paez -


public class Principal {

	public static void main(String[] args) {
			
		Empleado[] vEmp = new Empleado[5];
		vEmp[0] = new Empleado("Juan",30);
		vEmp[1] = new Empleado();
		vEmp[2] = new Empleado("Matu",40);
		vEmp[3] = new Empleado();
		vEmp[4] = new Empleado();
		vEmp[4].setNombre("Maxi");
		vEmp[4].setEdad(50);
		
		for (Empleado empleado : vEmp) {
			
			System.out.println(empleado.toString());
		}
		
		System.out.println("El Proximo ID será el: " + Empleado.devuelveProximoID());
		

	}

}
