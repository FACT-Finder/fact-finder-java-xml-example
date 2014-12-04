package de.factfinder.xml610.handler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.factfinder.xml610.recommender.Ff;
import de.factfinder.xml610.recommender.ObjectFactory;

public final class RecommenderHandler {
	private JAXBContext	context	= null;

	private RecommenderHandler() {
		try {
			this.context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (final JAXBException e) {
			System.out.println("Could not initialize JAXB context");
		}
	}

	public Ff getRecommendations(final InputStream inputStream) {
		Ff recommendations = null;
		if (context != null && inputStream != null) {
			Unmarshaller unmarshaller = null;
			try {
				unmarshaller = context.createUnmarshaller();
				recommendations = (Ff) unmarshaller.unmarshal(inputStream);
			} catch (final JAXBException e) {
				e.printStackTrace();
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (final IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return recommendations;
	}

	public static RecommenderHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final RecommenderHandler	INSTANCE	= new RecommenderHandler();
	}

}
