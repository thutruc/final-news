package edu.news.hbndata;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
//	private static final ServiceRegistry SERVICE_REGISTRY;

	static {
		try {
			Configuration config = new Configuration()
					.configure("hibernate.cfg.xml");
//			SERVICE_REGISTRY = new ServiceRegistryBuilder().applySettings(
//					config.getProperties()).buildServiceRegistry();
//			SESSION_FACTORY = config.buildSessionFactory(SERVICE_REGISTRY);
			SESSION_FACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session openSession() {
		return SESSION_FACTORY.openSession();
	}
	
	 public static void shutdown() {
	        // Close caches and connection pools
	        // Giải phóng cache và Connection Pools.
	       SESSION_FACTORY.close();
	    }
	 public static void main(String[] args) {
		openSession();
		shutdown();
	}
}
