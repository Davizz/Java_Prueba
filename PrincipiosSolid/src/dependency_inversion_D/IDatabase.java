package dependency_inversion_D;

import org.w3c.dom.Document;

/**
 * ETAPA __004
 * Si aplicamos el principio de inversión de dependencias, deberíamos sustituir
 * en nuestra clase ProcessDocument las dependencias a implementaciones
 * concretas por abstracciones. 
 *
 */
public interface IDatabase {
	Document getDocument(int id);
}
