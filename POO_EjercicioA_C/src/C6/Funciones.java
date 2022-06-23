package C6;



public class Funciones {
	
		public double CalculoDTO(double venta) {
			double Total = 0;
			double dto = 20;
			
			if(venta>300) {
				Total = venta - (venta * dto/100);
			}else {
				Total = venta;
			}
			
			return Total;
		}
		
		public double CalculoSalario(double horas) {
			double salario = 0;
			double precioHora = 16;
			double precioHoraExtra = 20;
			
			if(horas>40) {
				salario = 40 * precioHora;
				salario = salario + ((horas-40)*precioHoraExtra);
			}else {
				salario = horas * precioHora;
			}
			
			
			return salario;
		}
}


