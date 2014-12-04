package de.factfinder.xml610.handler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.factfinder.xml610.similarrecords.Ff;
import de.factfinder.xml610.similarrecords.ObjectFactory;

public final class SimilarRecordsHandler {
	private JAXBContext	context	= null;

	private SimilarRecordsHandler() {
		try {
			this.context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (final JAXBException e) {
			System.out.println("Could not initialize JAXB context");
		}
	}

	public Ff getSimilarRecords(final InputStream inputStream) {
		Ff similarRecords = null;
		if (context != null && inputStream != null) {
			Unmarshaller unmarshaller = null;
			try {
				unmarshaller = context.createUnmarshaller();
				similarRecords = (Ff) unmarshaller.unmarshal(inputStream);
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
		return similarRecords;
	}

	public static SimilarRecordsHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final SimilarRecordsHandler	INSTANCE	= new SimilarRecordsHandler();
	}

}
