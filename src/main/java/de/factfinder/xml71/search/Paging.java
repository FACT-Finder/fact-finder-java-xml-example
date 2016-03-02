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
 *         &lt;element name="settings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="linkCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nextCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="previousCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="pageCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="currentPage" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="productsPerPage">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
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
    "searchParams",
    "settings"
})
@XmlRootElement(name = "paging")
public class Paging {

    @XmlElement(required = true)
    protected String searchParams;
    @XmlElement(required = true)
    protected Paging.Settings settings;
    @XmlAttribute(name = "pageCount", required = true)
    protected int pageCount;
    @XmlAttribute(name = "currentPage", required = true)
    protected int currentPage;
    @XmlAttribute(name = "productsPerPage")
    protected Integer productsPerPage;

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
     * Ruft den Wert der settings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Paging.Settings }
     *     
     */
    public Paging.Settings getSettings() {
        return settings;
    }

    /**
     * Legt den Wert der settings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging.Settings }
     *     
     */
    public void setSettings(Paging.Settings value) {
        this.settings = value;
    }

    /**
     * Ruft den Wert der pageCount-Eigenschaft ab.
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Legt den Wert der pageCount-Eigenschaft fest.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }

    /**
     * Ruft den Wert der currentPage-Eigenschaft ab.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Legt den Wert der currentPage-Eigenschaft fest.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Ruft den Wert der productsPerPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductsPerPage() {
        return productsPerPage;
    }

    /**
     * Legt den Wert der productsPerPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductsPerPage(Integer value) {
        this.productsPerPage = value;
    }


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
     *         &lt;element name="linkCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nextCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="previousCaption" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "linkCount",
        "nextCaption",
        "previousCaption"
    })
    public static class Settings {

        protected int linkCount;
        @XmlElement(required = true)
        protected String nextCaption;
        @XmlElement(required = true)
        protected String previousCaption;

        /**
         * Ruft den Wert der linkCount-Eigenschaft ab.
         * 
         */
        public int getLinkCount() {
            return linkCount;
        }

        /**
         * Legt den Wert der linkCount-Eigenschaft fest.
         * 
         */
        public void setLinkCount(int value) {
            this.linkCount = value;
        }

        /**
         * Ruft den Wert der nextCaption-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextCaption() {
            return nextCaption;
        }

        /**
         * Legt den Wert der nextCaption-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextCaption(String value) {
            this.nextCaption = value;
        }

        /**
         * Ruft den Wert der previousCaption-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousCaption() {
            return previousCaption;
        }

        /**
         * Legt den Wert der previousCaption-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousCaption(String value) {
            this.previousCaption = value;
        }

    }

}
