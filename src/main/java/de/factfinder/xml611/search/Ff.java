//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.25 um 02:19:25 PM CET 
//


package de.factfinder.xml611.search;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}searchStatus"/>
 *           &lt;element ref="{}articleNumberSearchStatus" minOccurs="0"/>
 *           &lt;element ref="{}searchTimedOut" minOccurs="0"/>
 *           &lt;element name="productsPerPageOptions">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="option" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{}searchParams"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="default" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="selected" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="searchControlParams">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="disableCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="generateAdvisorTree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="idsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="useAsn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="useCampaigns" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="useFoundWords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="useKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="searchParams">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{}searchPhrase" minOccurs="0"/>
 *                     &lt;element name="searchField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="sorts" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="sort" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="name">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="method" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="asc"/>
 *                                             &lt;enumeration value="desc"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{}filters" minOccurs="0"/>
 *                     &lt;element ref="{}channel"/>
 *                     &lt;element name="page" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                           &lt;minInclusive value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element ref="{}productsPerPage" minOccurs="0"/>
 *                     &lt;element ref="{}seoPath" minOccurs="0"/>
 *                     &lt;element name="customParameters" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="customParameter" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="values" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{}breadCrumbTrail" minOccurs="0"/>
 *           &lt;element ref="{}singleWordSearch" minOccurs="0"/>
 *           &lt;element ref="{}campaigns" minOccurs="0"/>
 *           &lt;element ref="{}asn" minOccurs="0"/>
 *           &lt;element ref="{}paging" minOccurs="0"/>
 *           &lt;element ref="{}sorting" minOccurs="0"/>
 *           &lt;element ref="{}results" minOccurs="0"/>
 *           &lt;element name="refKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;element name="productCampaigns">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}campaigns" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element ref="{}error"/>
 *           &lt;element ref="{}stacktrace" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchStatus",
    "articleNumberSearchStatus",
    "searchTimedOut",
    "productsPerPageOptions",
    "searchControlParams",
    "searchParams",
    "breadCrumbTrail",
    "singleWordSearch",
    "campaigns",
    "asn",
    "paging",
    "sorting",
    "results",
    "refKey",
    "productCampaigns",
    "error",
    "stacktrace"
})
@XmlRootElement(name = "ff")
public class Ff {

    protected String searchStatus;
    protected String articleNumberSearchStatus;
    protected Boolean searchTimedOut;
    protected Ff.ProductsPerPageOptions productsPerPageOptions;
    protected Ff.SearchControlParams searchControlParams;
    protected Ff.SearchParams searchParams;
    protected BreadCrumbTrail breadCrumbTrail;
    protected SingleWordSearch singleWordSearch;
    protected Campaigns campaigns;
    protected Asn asn;
    protected Paging paging;
    protected Sorting sorting;
    protected Results results;
    protected String refKey;
    protected Ff.ProductCampaigns productCampaigns;
    protected String error;
    protected String stacktrace;

    /**
     * Ruft den Wert der searchStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchStatus() {
        return searchStatus;
    }

    /**
     * Legt den Wert der searchStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchStatus(String value) {
        this.searchStatus = value;
    }

    /**
     * Ruft den Wert der articleNumberSearchStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumberSearchStatus() {
        return articleNumberSearchStatus;
    }

    /**
     * Legt den Wert der articleNumberSearchStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumberSearchStatus(String value) {
        this.articleNumberSearchStatus = value;
    }

    /**
     * Ruft den Wert der searchTimedOut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchTimedOut() {
        return searchTimedOut;
    }

    /**
     * Legt den Wert der searchTimedOut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchTimedOut(Boolean value) {
        this.searchTimedOut = value;
    }

    /**
     * Ruft den Wert der productsPerPageOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ff.ProductsPerPageOptions }
     *     
     */
    public Ff.ProductsPerPageOptions getProductsPerPageOptions() {
        return productsPerPageOptions;
    }

    /**
     * Legt den Wert der productsPerPageOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ff.ProductsPerPageOptions }
     *     
     */
    public void setProductsPerPageOptions(Ff.ProductsPerPageOptions value) {
        this.productsPerPageOptions = value;
    }

    /**
     * Ruft den Wert der searchControlParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ff.SearchControlParams }
     *     
     */
    public Ff.SearchControlParams getSearchControlParams() {
        return searchControlParams;
    }

    /**
     * Legt den Wert der searchControlParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ff.SearchControlParams }
     *     
     */
    public void setSearchControlParams(Ff.SearchControlParams value) {
        this.searchControlParams = value;
    }

    /**
     * Ruft den Wert der searchParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ff.SearchParams }
     *     
     */
    public Ff.SearchParams getSearchParams() {
        return searchParams;
    }

    /**
     * Legt den Wert der searchParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ff.SearchParams }
     *     
     */
    public void setSearchParams(Ff.SearchParams value) {
        this.searchParams = value;
    }

    /**
     * Ruft den Wert der breadCrumbTrail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BreadCrumbTrail }
     *     
     */
    public BreadCrumbTrail getBreadCrumbTrail() {
        return breadCrumbTrail;
    }

    /**
     * Legt den Wert der breadCrumbTrail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BreadCrumbTrail }
     *     
     */
    public void setBreadCrumbTrail(BreadCrumbTrail value) {
        this.breadCrumbTrail = value;
    }

    /**
     * Ruft den Wert der singleWordSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleWordSearch }
     *     
     */
    public SingleWordSearch getSingleWordSearch() {
        return singleWordSearch;
    }

    /**
     * Legt den Wert der singleWordSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleWordSearch }
     *     
     */
    public void setSingleWordSearch(SingleWordSearch value) {
        this.singleWordSearch = value;
    }

    /**
     * Ruft den Wert der campaigns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Campaigns }
     *     
     */
    public Campaigns getCampaigns() {
        return campaigns;
    }

    /**
     * Legt den Wert der campaigns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Campaigns }
     *     
     */
    public void setCampaigns(Campaigns value) {
        this.campaigns = value;
    }

    /**
     * Ruft den Wert der asn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Asn }
     *     
     */
    public Asn getAsn() {
        return asn;
    }

    /**
     * Legt den Wert der asn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Asn }
     *     
     */
    public void setAsn(Asn value) {
        this.asn = value;
    }

    /**
     * Ruft den Wert der paging-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Legt den Wert der paging-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Ruft den Wert der sorting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sorting }
     *     
     */
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * Legt den Wert der sorting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sorting }
     *     
     */
    public void setSorting(Sorting value) {
        this.sorting = value;
    }

    /**
     * Ruft den Wert der results-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Results }
     *     
     */
    public Results getResults() {
        return results;
    }

    /**
     * Legt den Wert der results-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Results }
     *     
     */
    public void setResults(Results value) {
        this.results = value;
    }

    /**
     * Ruft den Wert der refKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefKey() {
        return refKey;
    }

    /**
     * Legt den Wert der refKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefKey(String value) {
        this.refKey = value;
    }

    /**
     * Ruft den Wert der productCampaigns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ff.ProductCampaigns }
     *     
     */
    public Ff.ProductCampaigns getProductCampaigns() {
        return productCampaigns;
    }

    /**
     * Legt den Wert der productCampaigns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ff.ProductCampaigns }
     *     
     */
    public void setProductCampaigns(Ff.ProductCampaigns value) {
        this.productCampaigns = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Ruft den Wert der stacktrace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStacktrace() {
        return stacktrace;
    }

    /**
     * Legt den Wert der stacktrace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStacktrace(String value) {
        this.stacktrace = value;
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
     *         &lt;element ref="{}campaigns" minOccurs="0"/>
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
        "campaigns"
    })
    public static class ProductCampaigns {

        protected Campaigns campaigns;

        /**
         * Ruft den Wert der campaigns-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Campaigns }
         *     
         */
        public Campaigns getCampaigns() {
            return campaigns;
        }

        /**
         * Legt den Wert der campaigns-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Campaigns }
         *     
         */
        public void setCampaigns(Campaigns value) {
            this.campaigns = value;
        }

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
     *         &lt;element name="option" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}searchParams"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="default" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="selected" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "option"
    })
    public static class ProductsPerPageOptions {

        protected List<Ff.ProductsPerPageOptions.Option> option;
        @XmlAttribute(name = "default", required = true)
        protected BigInteger _default;
        @XmlAttribute(name = "selected", required = true)
        protected BigInteger selected;

        /**
         * Gets the value of the option property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the option property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ff.ProductsPerPageOptions.Option }
         * 
         * 
         */
        public List<Ff.ProductsPerPageOptions.Option> getOption() {
            if (option == null) {
                option = new ArrayList<Ff.ProductsPerPageOptions.Option>();
            }
            return this.option;
        }

        /**
         * Ruft den Wert der default-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefault() {
            return _default;
        }

        /**
         * Legt den Wert der default-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefault(BigInteger value) {
            this._default = value;
        }

        /**
         * Ruft den Wert der selected-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSelected() {
            return selected;
        }

        /**
         * Legt den Wert der selected-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSelected(BigInteger value) {
            this.selected = value;
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
         *         &lt;element ref="{}searchParams"/>
         *       &lt;/sequence>
         *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        public static class Option {

            @XmlElement(required = true)
            protected String searchParams;
            @XmlAttribute(name = "value", required = true)
            protected BigInteger value;

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
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

        }

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
     *         &lt;element name="disableCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="generateAdvisorTree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="idsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="useAsn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="useCampaigns" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="useFoundWords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="useKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "disableCache",
        "generateAdvisorTree",
        "idsOnly",
        "useAsn",
        "useCampaigns",
        "useFoundWords",
        "useKeywords"
    })
    public static class SearchControlParams {

        protected boolean disableCache;
        protected boolean generateAdvisorTree;
        protected boolean idsOnly;
        protected boolean useAsn;
        protected boolean useCampaigns;
        protected boolean useFoundWords;
        protected boolean useKeywords;

        /**
         * Ruft den Wert der disableCache-Eigenschaft ab.
         * 
         */
        public boolean isDisableCache() {
            return disableCache;
        }

        /**
         * Legt den Wert der disableCache-Eigenschaft fest.
         * 
         */
        public void setDisableCache(boolean value) {
            this.disableCache = value;
        }

        /**
         * Ruft den Wert der generateAdvisorTree-Eigenschaft ab.
         * 
         */
        public boolean isGenerateAdvisorTree() {
            return generateAdvisorTree;
        }

        /**
         * Legt den Wert der generateAdvisorTree-Eigenschaft fest.
         * 
         */
        public void setGenerateAdvisorTree(boolean value) {
            this.generateAdvisorTree = value;
        }

        /**
         * Ruft den Wert der idsOnly-Eigenschaft ab.
         * 
         */
        public boolean isIdsOnly() {
            return idsOnly;
        }

        /**
         * Legt den Wert der idsOnly-Eigenschaft fest.
         * 
         */
        public void setIdsOnly(boolean value) {
            this.idsOnly = value;
        }

        /**
         * Ruft den Wert der useAsn-Eigenschaft ab.
         * 
         */
        public boolean isUseAsn() {
            return useAsn;
        }

        /**
         * Legt den Wert der useAsn-Eigenschaft fest.
         * 
         */
        public void setUseAsn(boolean value) {
            this.useAsn = value;
        }

        /**
         * Ruft den Wert der useCampaigns-Eigenschaft ab.
         * 
         */
        public boolean isUseCampaigns() {
            return useCampaigns;
        }

        /**
         * Legt den Wert der useCampaigns-Eigenschaft fest.
         * 
         */
        public void setUseCampaigns(boolean value) {
            this.useCampaigns = value;
        }

        /**
         * Ruft den Wert der useFoundWords-Eigenschaft ab.
         * 
         */
        public boolean isUseFoundWords() {
            return useFoundWords;
        }

        /**
         * Legt den Wert der useFoundWords-Eigenschaft fest.
         * 
         */
        public void setUseFoundWords(boolean value) {
            this.useFoundWords = value;
        }

        /**
         * Ruft den Wert der useKeywords-Eigenschaft ab.
         * 
         */
        public boolean isUseKeywords() {
            return useKeywords;
        }

        /**
         * Legt den Wert der useKeywords-Eigenschaft fest.
         * 
         */
        public void setUseKeywords(boolean value) {
            this.useKeywords = value;
        }

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
     *         &lt;element ref="{}searchPhrase" minOccurs="0"/>
     *         &lt;element name="searchField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sorts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sort" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="method" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="asc"/>
     *                                 &lt;enumeration value="desc"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{}filters" minOccurs="0"/>
     *         &lt;element ref="{}channel"/>
     *         &lt;element name="page" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{}productsPerPage" minOccurs="0"/>
     *         &lt;element ref="{}seoPath" minOccurs="0"/>
     *         &lt;element name="customParameters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customParameter" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="values" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "searchPhrase",
        "searchField",
        "sorts",
        "filters",
        "channel",
        "page",
        "productsPerPage",
        "seoPath",
        "customParameters"
    })
    public static class SearchParams {

        protected String searchPhrase;
        protected String searchField;
        protected Ff.SearchParams.Sorts sorts;
        protected Filters filters;
        @XmlElement(required = true)
        protected String channel;
        protected Integer page;
        protected Integer productsPerPage;
        protected String seoPath;
        protected Ff.SearchParams.CustomParameters customParameters;

        /**
         * Ruft den Wert der searchPhrase-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchPhrase() {
            return searchPhrase;
        }

        /**
         * Legt den Wert der searchPhrase-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchPhrase(String value) {
            this.searchPhrase = value;
        }

        /**
         * Ruft den Wert der searchField-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchField() {
            return searchField;
        }

        /**
         * Legt den Wert der searchField-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchField(String value) {
            this.searchField = value;
        }

        /**
         * Ruft den Wert der sorts-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Ff.SearchParams.Sorts }
         *     
         */
        public Ff.SearchParams.Sorts getSorts() {
            return sorts;
        }

        /**
         * Legt den Wert der sorts-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Ff.SearchParams.Sorts }
         *     
         */
        public void setSorts(Ff.SearchParams.Sorts value) {
            this.sorts = value;
        }

        /**
         * Ruft den Wert der filters-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Filters }
         *     
         */
        public Filters getFilters() {
            return filters;
        }

        /**
         * Legt den Wert der filters-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Filters }
         *     
         */
        public void setFilters(Filters value) {
            this.filters = value;
        }

        /**
         * Ruft den Wert der channel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Legt den Wert der channel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

        /**
         * Ruft den Wert der page-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Legt den Wert der page-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
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
         * Ruft den Wert der seoPath-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeoPath() {
            return seoPath;
        }

        /**
         * Legt den Wert der seoPath-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeoPath(String value) {
            this.seoPath = value;
        }

        /**
         * Ruft den Wert der customParameters-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Ff.SearchParams.CustomParameters }
         *     
         */
        public Ff.SearchParams.CustomParameters getCustomParameters() {
            return customParameters;
        }

        /**
         * Legt den Wert der customParameters-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Ff.SearchParams.CustomParameters }
         *     
         */
        public void setCustomParameters(Ff.SearchParams.CustomParameters value) {
            this.customParameters = value;
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
         *         &lt;element name="customParameter" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="values" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "customParameter"
        })
        public static class CustomParameters {

            @XmlElement(required = true)
            protected List<Ff.SearchParams.CustomParameters.CustomParameter> customParameter;

            /**
             * Gets the value of the customParameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customParameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ff.SearchParams.CustomParameters.CustomParameter }
             * 
             * 
             */
            public List<Ff.SearchParams.CustomParameters.CustomParameter> getCustomParameter() {
                if (customParameter == null) {
                    customParameter = new ArrayList<Ff.SearchParams.CustomParameters.CustomParameter>();
                }
                return this.customParameter;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="values" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "name",
                "values"
            })
            public static class CustomParameter {

                protected String name;
                protected Ff.SearchParams.CustomParameters.CustomParameter.Values values;

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
                 * Ruft den Wert der values-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Ff.SearchParams.CustomParameters.CustomParameter.Values }
                 *     
                 */
                public Ff.SearchParams.CustomParameters.CustomParameter.Values getValues() {
                    return values;
                }

                /**
                 * Legt den Wert der values-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Ff.SearchParams.CustomParameters.CustomParameter.Values }
                 *     
                 */
                public void setValues(Ff.SearchParams.CustomParameters.CustomParameter.Values value) {
                    this.values = value;
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
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value"
                })
                public static class Values {

                    protected List<String> value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the value property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getValue().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getValue() {
                        if (value == null) {
                            value = new ArrayList<String>();
                        }
                        return this.value;
                    }

                }

            }

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
         *         &lt;element name="sort" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="method" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="asc"/>
         *                       &lt;enumeration value="desc"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sort"
        })
        public static class Sorts {

            @XmlElement(required = true)
            protected List<Ff.SearchParams.Sorts.Sort> sort;

            /**
             * Gets the value of the sort property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sort property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSort().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ff.SearchParams.Sorts.Sort }
             * 
             * 
             */
            public List<Ff.SearchParams.Sorts.Sort> getSort() {
                if (sort == null) {
                    sort = new ArrayList<Ff.SearchParams.Sorts.Sort>();
                }
                return this.sort;
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
             *       &lt;attribute name="name">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="method" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="asc"/>
             *             &lt;enumeration value="desc"/>
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
            @XmlType(name = "")
            public static class Sort {

                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "method", required = true)
                protected String method;

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
                 * Ruft den Wert der method-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethod() {
                    return method;
                }

                /**
                 * Legt den Wert der method-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethod(String value) {
                    this.method = value;
                }

            }

        }

    }

}
