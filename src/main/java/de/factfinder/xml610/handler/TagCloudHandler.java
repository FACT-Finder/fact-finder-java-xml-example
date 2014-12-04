package de.factfinder.xml610.handler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.factfinder.xml610.tagcloud.ObjectFactory;
import de.factfinder.xml610.tagcloud.TagCloud;

public final class TagCloudHandler {
	private JAXBContext	context	= null;

	private TagCloudHandler() {
		try {
			this.context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (final JAXBException e) {
			System.out.println("Could not initialize JAXB context");
		}
	}

	public TagCloud getTagCloud(final InputStream inputStream) {
		TagCloud tagCloud = null;
		if (context != null && inputStream != null) {
			Unmarshaller unmarshaller = null;
			try {
				unmarshaller = context.createUnmarshaller();
				tagCloud = (TagCloud) unmarshaller.unmarshal(inputStream);
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
		return tagCloud;
	}

	public static TagCloudHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final TagCloudHandler	INSTANCE	= new TagCloudHandler();
	}

}
