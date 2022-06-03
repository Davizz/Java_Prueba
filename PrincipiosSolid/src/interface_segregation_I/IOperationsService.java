package interface_segregation_I;


/**
 * ETAPA__003
 * Imaginemosnos que clientes emplean las operaciones de la interfaz OPS,
 * "Client1" solo utiliza "op1", "Client2" solo utiliza "op2" y "Client3" solo
 * utiliza "op3".
 * 
 * En este caso �Client1� depender� involuntariamente de op2 y op3, aunque no
 * los utilice. Cada vez que se realice un cambio en OPS ser� necesario volver a
 * compilar los tres clientes aunque no haya cambiado ninguno de los elementos a
 * los que hace referencia.
 * 
 * En c�digo para la interfaz se ver�a de la siguiente forma:
 */
@Deprecated
public interface IOperationsService {
	boolean op1();
    String op2();
    void op3();
}
