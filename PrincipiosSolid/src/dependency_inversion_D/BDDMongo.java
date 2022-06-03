package dependency_inversion_D;

import org.w3c.dom.Document;

/**
 * ETAPA __005
 * Para ello crearemos dos interfaces que definen
 * los comportamiento que debe tener una clase para acceder a la base de datos o
 * para realizar una firma. 
 *
 */
public class BDDMongo implements IDatabase{

	@Override
	public Document getDocument(int id) {
		// Get document from mongo DB
		return null;
	}

}
