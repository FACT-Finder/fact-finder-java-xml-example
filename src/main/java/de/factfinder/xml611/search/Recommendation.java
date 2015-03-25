//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.25 um 02:19:25 PM CET 
//


package de.factfinder.xml611.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}similarWords"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "similarWords"
})
@XmlRootElement(name = "recommendation")
public class Recommendation {

    @XmlElement(required = true)
    protected SimilarWords similarWords;

    /**
     * Ruft den Wert der similarWords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimilarWords }
     *     
     */
    public SimilarWords getSimilarWords() {
        return similarWords;
    }

    /**
     * Legt den Wert der similarWords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarWords }
     *     
     */
    public void setSimilarWords(SimilarWords value) {
        this.similarWords = value;
    }

}
