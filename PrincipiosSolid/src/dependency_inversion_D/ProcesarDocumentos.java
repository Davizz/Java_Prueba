package dependency_inversion_D;


import org.w3c.dom.Document;

/**
 * ETAPA __008
 * Ahora la implementación concreta es recibida en el
 * constructor de ProcesarDocumentos. El código resultante sería el siguiente.
 *
 */
public class ProcesarDocumentos {

	private final IDatabase database;
	private final ISignature signature;

	public ProcesarDocumentos(IDatabase database, ISignature signature) {
		this.database = database;
		this.signature = signature;
	}

	public void signDocument(int id) {
		Document doc = this.database.getDocument(id);
		this.signature.sign(doc);
	}

}
