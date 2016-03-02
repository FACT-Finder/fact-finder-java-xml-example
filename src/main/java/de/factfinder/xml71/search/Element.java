//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.02 um 10:12:35 AM CET 
//


package de.factfinder.xml71.search;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}searchParams"/>
 *       &lt;/sequence>
 *       &lt;attribute name="field" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="count" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="clusterLevel" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="selected" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="previewImage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="selectedMin" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="selectedMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="absoluteMin" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="absoluteMax" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchParams"
})
@XmlRootElement(name = "element")
public class Element {

    @XmlElement(required = true)
    protected String searchParams;
    @XmlAttribute(name = "field")
    protected String field;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "count", required = true)
    protected int count;
    @XmlAttribute(name = "clusterLevel", required = true)
    protected int clusterLevel;
    @XmlAttribute(name = "selected", required = true)
    protected boolean selected;
    @XmlAttribute(name = "previewImage")
    protected String previewImage;
    @XmlAttribute(name = "selectedMin")
    protected BigInteger selectedMin;
    @XmlAttribute(name = "selectedMax")
    protected BigInteger selectedMax;
    @XmlAttribute(name = "absoluteMin")
    protected BigInteger absoluteMin;
    @XmlAttribute(name = "absoluteMax")
    protected BigInteger absoluteMax;

    /**
     * Ruft den Wert der searchParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchParams() {
        return searchParams;
    }

    /**
     * Legt den Wert der searchParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchParams(String value) {
        this.searchParams = value;
    }

    /**
     * Ruft den Wert der field-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Legt den Wert der field-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
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
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der clusterLevel-Eigenschaft ab.
     * 
     */
    public int getClusterLevel() {
        return clusterLevel;
    }

    /**
     * Legt den Wert der clusterLevel-Eigenschaft fest.
     * 
     */
    public void setClusterLevel(int value) {
        this.clusterLevel = value;
    }

    /**
     * Ruft den Wert der selected-Eigenschaft ab.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Legt den Wert der selected-Eigenschaft fest.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Ruft den Wert der previewImage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewImage() {
        return previewImage;
    }

    /**
     * Legt den Wert der previewImage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewImage(String value) {
        this.previewImage = value;
    }

    /**
     * Ruft den Wert der selectedMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSelectedMin() {
        return selectedMin;
    }

    /**
     * Legt den Wert der selectedMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSelectedMin(BigInteger value) {
        this.selectedMin = value;
    }

    /**
     * Ruft den Wert der selectedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSelectedMax() {
        return selectedMax;
    }

    /**
     * Legt den Wert der selectedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSelectedMax(BigInteger value) {
        this.selectedMax = value;
    }

    /**
     * Ruft den Wert der absoluteMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbsoluteMin() {
        return absoluteMin;
    }

    /**
     * Legt den Wert der absoluteMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbsoluteMin(BigInteger value) {
        this.absoluteMin = value;
    }

    /**
     * Ruft den Wert der absoluteMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbsoluteMax() {
        return absoluteMax;
    }

    /**
     * Legt den Wert der absoluteMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbsoluteMax(BigInteger value) {
        this.absoluteMax = value;
    }

}
