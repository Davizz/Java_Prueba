package refundicion_complejo;

public class Main {

	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Enrique");
		misEmpleados[1] = new Empleado("Patricia", 100000, 1995, 12, 17);
		misEmpleados[2] = new Empleado("Edith", 120000, 1996, 12, 1);
		misEmpleados[3] = new Empleado("Martina", 135000, 1997, 9, 1);
		misEmpleados[4] = new Jefe("Ludovic", 155000, 1998, 11, 24);
		misEmpleados[5] = new Jefe("María", 155000, 1998, 10, 25);

		Jefe jefeFinanciero = (Jefe) misEmpleados[5];
		jefeFinanciero.setIncentivo(10000);
		System.out.println(jefeFinanciero.getIncentivo());
	//	Jefe jefeSeguridad = (Jefe) misEmpleados[1];

		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + "\nSueldo: " + e.getSueldo() + " Euros / año\n "
					+ "Fecha de alta" + e.getFechaEntrada() + "\nId: " + e.getId() + " \n ");
		}
	}

}
