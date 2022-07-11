import java.util.Collections;
import javax.persistence.EntityManagerFactory;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.hibernate.MappingException;
import org.hibernate.QueryException;
import org.hibernate.engine.jdbc.internal.FormatStyle;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory;
import org.hibernate.hql.spi.QueryTranslator;
import org.hibernate.hql.spi.QueryTranslatorFactory;

public class Translator {

    private final SessionFactoryImplementor sessionFactoryImplementor;
    private final QueryTranslatorFactory translatorFactory;

    public Translator(EntityManagerFactory entityManagerFactory) {
        sessionFactoryImplementor = entityManagerFactory.unwrap(SessionFactoryImplementor.class);
        translatorFactory = new ASTQueryTranslatorFactory();
    }

    public String translate(String hql, boolean format) {
        if (hql == null || hql.trim().length() == 0) {
            return "";
        }
        try {
            final QueryTranslator translator
                    = translatorFactory.createQueryTranslator(
                            hql, hql, Collections.EMPTY_MAP,
                            sessionFactoryImplementor, null);
            translator.compile(Collections.EMPTY_MAP, false);
            final String sqlString = translator.getSQLString();
            return format
                    ? FormatStyle.BASIC.getFormatter().format(sqlString)
                    : sqlString;
        } catch (QueryException | MappingException t) {
            return ExceptionUtils.getStackTrace(t);
        }
    }
}

