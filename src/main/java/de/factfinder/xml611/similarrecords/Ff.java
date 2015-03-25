//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.25 um 02:19:48 PM CET 
//


package de.factfinder.xml611.similarrecords;

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
 *         &lt;element ref="{}similarAttributes"/>
 *         &lt;element ref="{}similarRecords"/>
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
    "similarAttributes",
    "similarRecords"
})
@XmlRootElement(name = "ff")
public class Ff {

    @XmlElement(required = true)
    protected SimilarAttributes similarAttributes;
    @XmlElement(required = true)
    protected SimilarRecords similarRecords;

    /**
     * Ruft den Wert der similarAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimilarAttributes }
     *     
     */
    public SimilarAttributes getSimilarAttributes() {
        return similarAttributes;
    }

    /**
     * Legt den Wert der similarAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarAttributes }
     *     
     */
    public void setSimilarAttributes(SimilarAttributes value) {
        this.similarAttributes = value;
    }

    /**
     * Ruft den Wert der similarRecords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimilarRecords }
     *     
     */
    public SimilarRecords getSimilarRecords() {
        return similarRecords;
    }

    /**
     * Legt den Wert der similarRecords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarRecords }
     *     
     */
    public void setSimilarRecords(SimilarRecords value) {
        this.similarRecords = value;
    }

}
