package de.factfinder.xml611.handler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.factfinder.xml611.search.Ff;
import de.factfinder.xml611.search.ObjectFactory;

public final class SearchHandler {
	private JAXBContext	context	= null;

	private SearchHandler() {
		try {
			this.context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (final JAXBException e) {
			System.out.println("Could not initialize JAXB context");
		}
	}

	public Ff getResult(final InputStream inputStream) {
		Ff result = null;
		if (context != null && inputStream != null) {
			Unmarshaller unmarshaller = null;
			try {
				unmarshaller = context.createUnmarshaller();
				result = (Ff) unmarshaller.unmarshal(inputStream);
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
		return result;
	}

	public static SearchHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final SearchHandler	INSTANCE	= new SearchHandler();
	}

}
