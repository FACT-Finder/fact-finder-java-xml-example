//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.25 um 02:19:25 PM CET 
//


package de.factfinder.xml611.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.factfinder.xml611.search package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchTimedOut_QNAME = new QName("", "searchTimedOut");
    private final static QName _Stacktrace_QNAME = new QName("", "stacktrace");
    private final static QName _SearchPhrase_QNAME = new QName("", "searchPhrase");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Destination_QNAME = new QName("", "destination");
    private final static QName _Channel_QNAME = new QName("", "channel");
    private final static QName _ArticleNumberSearchStatus_QNAME = new QName("", "articleNumberSearchStatus");
    private final static QName _SeoPath_QNAME = new QName("", "seoPath");
    private final static QName _Error_QNAME = new QName("", "error");
    private final static QName _ProductsPerPage_QNAME = new QName("", "productsPerPage");
    private final static QName _SearchStatus_QNAME = new QName("", "searchStatus");
    private final static QName _SearchParams_QNAME = new QName("", "searchParams");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.factfinder.xml611.search
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
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link Ff.SearchParams }
     * 
     */
    public Ff.SearchParams createFfSearchParams() {
        return new Ff.SearchParams();
    }

    /**
     * Create an instance of {@link Ff.SearchParams.CustomParameters }
     * 
     */
    public Ff.SearchParams.CustomParameters createFfSearchParamsCustomParameters() {
        return new Ff.SearchParams.CustomParameters();
    }

    /**
     * Create an instance of {@link Ff.SearchParams.CustomParameters.CustomParameter }
     * 
     */
    public Ff.SearchParams.CustomParameters.CustomParameter createFfSearchParamsCustomParametersCustomParameter() {
        return new Ff.SearchParams.CustomParameters.CustomParameter();
    }

    /**
     * Create an instance of {@link Ff.SearchParams.Sorts }
     * 
     */
    public Ff.SearchParams.Sorts createFfSearchParamsSorts() {
        return new Ff.SearchParams.Sorts();
    }

    /**
     * Create an instance of {@link Ff.ProductsPerPageOptions }
     * 
     */
    public Ff.ProductsPerPageOptions createFfProductsPerPageOptions() {
        return new Ff.ProductsPerPageOptions();
    }

    /**
     * Create an instance of {@link Ff.SearchControlParams }
     * 
     */
    public Ff.SearchControlParams createFfSearchControlParams() {
        return new Ff.SearchControlParams();
    }

    /**
     * Create an instance of {@link BreadCrumbTrail }
     * 
     */
    public BreadCrumbTrail createBreadCrumbTrail() {
        return new BreadCrumbTrail();
    }

    /**
     * Create an instance of {@link BreadCrumbTrailItem }
     * 
     */
    public BreadCrumbTrailItem createBreadCrumbTrailItem() {
        return new BreadCrumbTrailItem();
    }

    /**
     * Create an instance of {@link SingleWordSearch }
     * 
     */
    public SingleWordSearch createSingleWordSearch() {
        return new SingleWordSearch();
    }

    /**
     * Create an instance of {@link SingleWordSearchItem }
     * 
     */
    public SingleWordSearchItem createSingleWordSearchItem() {
        return new SingleWordSearchItem();
    }

    /**
     * Create an instance of {@link Campaigns }
     * 
     */
    public Campaigns createCampaigns() {
        return new Campaigns();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link Feedback }
     * 
     */
    public Feedback createFeedback() {
        return new Feedback();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link PushedProducts }
     * 
     */
    public PushedProducts createPushedProducts() {
        return new PushedProducts();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Advisor }
     * 
     */
    public Advisor createAdvisor() {
        return new Advisor();
    }

    /**
     * Create an instance of {@link ActiveQuestions }
     * 
     */
    public ActiveQuestions createActiveQuestions() {
        return new ActiveQuestions();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link AdvisorTree }
     * 
     */
    public AdvisorTree createAdvisorTree() {
        return new AdvisorTree();
    }

    /**
     * Create an instance of {@link Asn }
     * 
     */
    public Asn createAsn() {
        return new Asn();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link Paging.Settings }
     * 
     */
    public Paging.Settings createPagingSettings() {
        return new Paging.Settings();
    }

    /**
     * Create an instance of {@link Sorting }
     * 
     */
    public Sorting createSorting() {
        return new Sorting();
    }

    /**
     * Create an instance of {@link de.factfinder.xml611.search.Sort }
     * 
     */
    public de.factfinder.xml611.search.Sort createSort() {
        return new de.factfinder.xml611.search.Sort();
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
     * Create an instance of {@link KeywordsType }
     * 
     */
    public KeywordsType createKeywordsType() {
        return new KeywordsType();
    }

    /**
     * Create an instance of {@link FoundWords }
     * 
     */
    public FoundWords createFoundWords() {
        return new FoundWords();
    }

    /**
     * Create an instance of {@link Ff.ProductCampaigns }
     * 
     */
    public Ff.ProductCampaigns createFfProductCampaigns() {
        return new Ff.ProductCampaigns();
    }

    /**
     * Create an instance of {@link Recommendation }
     * 
     */
    public Recommendation createRecommendation() {
        return new Recommendation();
    }

    /**
     * Create an instance of {@link SimilarWords }
     * 
     */
    public SimilarWords createSimilarWords() {
        return new SimilarWords();
    }

    /**
     * Create an instance of {@link SimilarWord }
     * 
     */
    public SimilarWord createSimilarWord() {
        return new SimilarWord();
    }

    /**
     * Create an instance of {@link Filters }
     * 
     */
    public Filters createFilters() {
        return new Filters();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Ff.SearchParams.CustomParameters.CustomParameter.Values }
     * 
     */
    public Ff.SearchParams.CustomParameters.CustomParameter.Values createFfSearchParamsCustomParametersCustomParameterValues() {
        return new Ff.SearchParams.CustomParameters.CustomParameter.Values();
    }

    /**
     * Create an instance of {@link Ff.SearchParams.Sorts.Sort }
     * 
     */
    public Ff.SearchParams.Sorts.Sort createFfSearchParamsSortsSort() {
        return new Ff.SearchParams.Sorts.Sort();
    }

    /**
     * Create an instance of {@link Ff.ProductsPerPageOptions.Option }
     * 
     */
    public Ff.ProductsPerPageOptions.Option createFfProductsPerPageOptionsOption() {
        return new Ff.ProductsPerPageOptions.Option();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchTimedOut")
    public JAXBElement<Boolean> createSearchTimedOut(Boolean value) {
        return new JAXBElement<Boolean>(_SearchTimedOut_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stacktrace")
    public JAXBElement<String> createStacktrace(String value) {
        return new JAXBElement<String>(_Stacktrace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchPhrase")
    public JAXBElement<String> createSearchPhrase(String value) {
        return new JAXBElement<String>(_SearchPhrase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "destination")
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "channel")
    public JAXBElement<String> createChannel(String value) {
        return new JAXBElement<String>(_Channel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "articleNumberSearchStatus")
    public JAXBElement<String> createArticleNumberSearchStatus(String value) {
        return new JAXBElement<String>(_ArticleNumberSearchStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "seoPath")
    public JAXBElement<String> createSeoPath(String value) {
        return new JAXBElement<String>(_SeoPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productsPerPage")
    public JAXBElement<Integer> createProductsPerPage(Integer value) {
        return new JAXBElement<Integer>(_ProductsPerPage_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchStatus")
    public JAXBElement<String> createSearchStatus(String value) {
        return new JAXBElement<String>(_SearchStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchParams")
    public JAXBElement<String> createSearchParams(String value) {
        return new JAXBElement<String>(_SearchParams_QNAME, String.class, null, value);
    }

}