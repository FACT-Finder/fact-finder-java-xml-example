package de.factfinder.xml611.handler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.factfinder.xml611.search.Campaigns;
import de.factfinder.xml611.search.Ff;
import de.factfinder.xml611.search.ObjectFactory;

public final class ProductCampaignsHandler {
	private JAXBContext	context	= null;

	private ProductCampaignsHandler() {
		try {
			this.context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (final JAXBException e) {
			System.out.println("Could not initialize JAXB context");
		}
	}

	public Campaigns getCampaigns(final InputStream inputStream) {
		Campaigns campaigns = null;
		if (context != null && inputStream != null) {
			Unmarshaller unmarshaller = null;
			try {
				unmarshaller = context.createUnmarshaller();
				Ff result = (Ff) unmarshaller.unmarshal(inputStream);
				if (result != null) {
					campaigns = result.getCampaigns();
				}
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
		return campaigns;
	}

	public static ProductCampaignsHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final ProductCampaignsHandler	INSTANCE	= new ProductCampaignsHandler();
	}

}
