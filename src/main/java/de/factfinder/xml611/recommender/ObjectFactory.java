//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2015.03.25 um 02:20:11 PM CET
//

package de.factfinder.xml611.recommender;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the de.factfinder.xml611.recommender package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods
 * for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName	_RecommendationTimedOut_QNAME	= new QName("", "recommendationTimedOut");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.factfinder.xml611.recommender
	 *
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Ff }
	 *
	 */
	public Ff createFf() {
		return new Ff();
	}

	/**
	 * Create an instance of {@link Results }
	 *
	 */
	public Results createResults() {
		return new Results();
	}

	/**
	 * Create an instance of {@link Record }
	 *
	 */
	public Record createRecord() {
		return new Record();
	}

	/**
	 * Create an instance of {@link Field }
	 *
	 */
	public Field createField() {
		return new Field();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 *
	 */
	@XmlElementDecl(namespace = "", name = "recommendationTimedOut")
	public JAXBElement<Boolean> createRecommendationTimedOut(final Boolean value) {
		return new JAXBElement<Boolean>(_RecommendationTimedOut_QNAME, Boolean.class, null, value);
	}

}
