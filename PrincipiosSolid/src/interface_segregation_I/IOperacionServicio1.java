package interface_segregation_I;

/**
 * ETAPA__005
 * Para resolver este problema se separa las operaciones en varias interfaces.
 * De este modo �Client1� solo depender� de
 * �C1Ops� y �op1�, por lo que un cambio en �OPS� que no implique al �Client1�
 * no afectar� a su implementaci�n y compilaci�n.
 * 
 */
public interface IOperacionServicio1 {
	boolean op1();
}
