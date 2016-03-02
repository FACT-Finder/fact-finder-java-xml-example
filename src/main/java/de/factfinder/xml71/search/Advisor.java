//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.02 um 10:12:35 AM CET 
//


package de.factfinder.xml71.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}activeQuestions" minOccurs="0"/>
 *         &lt;element ref="{}advisorTree" minOccurs="0"/>
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
    "activeQuestions",
    "advisorTree"
})
@XmlRootElement(name = "advisor")
public class Advisor {

    protected ActiveQuestions activeQuestions;
    protected AdvisorTree advisorTree;

    /**
     * Ruft den Wert der activeQuestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActiveQuestions }
     *     
     */
    public ActiveQuestions getActiveQuestions() {
        return activeQuestions;
    }

    /**
     * Legt den Wert der activeQuestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveQuestions }
     *     
     */
    public void setActiveQuestions(ActiveQuestions value) {
        this.activeQuestions = value;
    }

    /**
     * Ruft den Wert der advisorTree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdvisorTree }
     *     
     */
    public AdvisorTree getAdvisorTree() {
        return advisorTree;
    }

    /**
     * Legt den Wert der advisorTree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisorTree }
     *     
     */
    public void setAdvisorTree(AdvisorTree value) {
        this.advisorTree = value;
    }

}
