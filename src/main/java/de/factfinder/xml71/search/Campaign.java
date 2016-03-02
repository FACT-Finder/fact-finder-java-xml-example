//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.02 um 10:12:35 AM CET 
//


package de.factfinder.xml71.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}target" minOccurs="0"/>
 *         &lt;element ref="{}feedback" minOccurs="0"/>
 *         &lt;element ref="{}pushedProducts" minOccurs="0"/>
 *         &lt;element ref="{}advisor" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nr" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="flavour" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ADVISOR"/>
 *             &lt;enumeration value="REDIRECT"/>
 *             &lt;enumeration value="FEEDBACK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "target",
    "feedback",
    "pushedProducts",
    "advisor"
})
@XmlRootElement(name = "campaign")
public class Campaign {

    protected Target target;
    protected Feedback feedback;
    protected PushedProducts pushedProducts;
    protected Advisor advisor;
    @XmlAttribute(name = "nr", required = true)
    protected int nr;
    @XmlAttribute(name = "category", required = true)
    protected String category;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "flavour", required = true)
    protected String flavour;

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Ruft den Wert der feedback-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Feedback }
     *     
     */
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * Legt den Wert der feedback-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Feedback }
     *     
     */
    public void setFeedback(Feedback value) {
        this.feedback = value;
    }

    /**
     * Ruft den Wert der pushedProducts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushedProducts }
     *     
     */
    public PushedProducts getPushedProducts() {
        return pushedProducts;
    }

    /**
     * Legt den Wert der pushedProducts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushedProducts }
     *     
     */
    public void setPushedProducts(PushedProducts value) {
        this.pushedProducts = value;
    }

    /**
     * Ruft den Wert der advisor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Advisor }
     *     
     */
    public Advisor getAdvisor() {
        return advisor;
    }

    /**
     * Legt den Wert der advisor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Advisor }
     *     
     */
    public void setAdvisor(Advisor value) {
        this.advisor = value;
    }

    /**
     * Ruft den Wert der nr-Eigenschaft ab.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Legt den Wert der nr-Eigenschaft fest.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der flavour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * Legt den Wert der flavour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavour(String value) {
        this.flavour = value;
    }

}
