package F17;

//Crear un programa que lista 10 Productos de una tienda disponibles a la venta. 
//Las clases que tienes que crear en este caso serían ProductoDisponible, Menu y el Main. 
//Pero puedes utilizar más clases si lo deseas. Como por ejemplo para listar los productos 
//en la cesta junto a sus cantidades. 
//La información disponible acerca de los productos de la clase ProductoDisponible se limitará a: 
//su nombre🡪 ej: “pantalón verde, camisa roja…”
//su precio sin IVA. 
//Su IVA double y final,
//El usuario podrá desde el Menú realizar las acciones siguientes: 
//Consultar la lista de productos
//Añadir 1 producto en varios ejemplares a su Cesta de la compra
//Pasar a caja (disponible una vez creada la cesta de compra)
//Salir de la aplicación
//La cesta es un array de productos (o una lista), 
//Una vez añadidos productos en la cesta de la compra, el usuario puede pasar a caja. 
//Si lo hace, el sistema listará los productos de la cesta y el precio final a pagar 
//más IVA. Dando un resultado similar al siguiente: 
//Nombre producto ----------- Precio-------CANTIDAD------------- IVA -------------------Precio Total
//Producto1 -------------------12,12 € -------1------------------ 2,55---------------------14,67 €
//Producto2--------------------20, 00 € ------1-------------------4,20---------------------24,20 €
//Total a Pagar ---------------------------------------------------------------------------38,87 €
//A continuación, tendrá acceso a un nuevo menú dónde podrá: 
//Vaciar la cesta y volver a la lista de productos
//Validar la compra
//Salir de la aplicación
//El programa tiene que utilizar la concepción “orientada a objetos” y no contener duplicación de código.
//
//EXTRA: Mejorar la tienda online.
//Si quieres ir todavía más lejos con el ej F17_1, puedes hacer lo siguiente: 
//Si el cliente valida la compra, tendrá que insertar datos personales como 
//el móvil, DNI, Nombre y apellidos, dirección de entrega y número de cuenta bancaria (CCC).  
//El sistema comprobará la validez de los datos insertados. Se considerará válido 
//Un móvil de 9 dígitos que empieza por un 6
//Un DNI verdadero
//Nombre compuesto por mínimo de 2 letras
//Apellidos compuestos por un mínimo de 2 letras 
//Dirección de entrega no nula y no compuesta por únicamente caracteres y espacios en blancos
//Número de cuenta CCC válido
//Una vez validados lo datos, se le informará al usuario que el pedido le llegará en 3 días en la dirección que ha comunicado y la aplicación se apagará.  

public class Producto {

	public String nombre_producto;
	public double precio_SinIva;
	public int cantidad;
	public double IVA;
	public double precio_total;
	private int id;
	static int staticId = 0;

	static int contador = 1;
	
	public Producto(String nombre_producto, double precio_SinIva, double d) {
		
		id = contador;
		contador ++;
		
		this.nombre_producto = nombre_producto;
		this.precio_SinIva = precio_SinIva;
		this.precio_total = precio_total;
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_SinIva() {
		return precio_SinIva;
	}

	public void setPrecio_SinIva(double precio_SinIva) {
		this.precio_SinIva = precio_SinIva;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_total() {
		return (precio_SinIva * 1.21) * cantidad;
	}

	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getStaticId() {
		return staticId;
	}

	public static void setStaticId(int staticId) {
		Producto.staticId = staticId;
	}

	public double getIVA() {
		return 21;
	}

	@Override
	public String toString() {
		return getId() + "----------" + getNombre_producto() + "---------->" + getPrecio_SinIva() + "€ (+ " + getIVA()
				+ " % de IVA)\n";

	}}

	