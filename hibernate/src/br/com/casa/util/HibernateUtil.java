package br.com.casa.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.com.casa.model.Produto;

public class HibernateUtil {

	private static SessionFactory factory;
	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		factory = cfg.buildSessionFactory();

	}

	public Session getSession() {
		return factory.openSession();
	}
}
