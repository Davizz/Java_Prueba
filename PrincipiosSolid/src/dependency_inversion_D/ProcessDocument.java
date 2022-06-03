package dependency_inversion_D;

import org.w3c.dom.Document;


/**
 * ETAPA __003
 * @author Usuario
 *
 */
@Deprecated
public class ProcessDocument {

	public void signDocument(int id) {

		MongoDatabase mongoDatabase = new MongoDatabase();
		Document doc = mongoDatabase.getDocument(id);

		MySignature signature = new MySignature();
		signature.signMD5withRSA(doc);

		/*
		 * En este caso la clase de más alto nivel, que procesa los documentos, está
		 * dependiendo de módulos de bajo nivel, como son el acceso a base de datos y el
		 * proceso de firma de documentos. Si en un futuro nuestro requerimientos del
		 * software cambian y nos vemos obligados a modificar el algoritmo de firma o
		 * utilizar otro cliente de base de datos, es muy probable que las
		 * modificaciones afecten a la clase ProcessDocument.
		 */
	}

}
