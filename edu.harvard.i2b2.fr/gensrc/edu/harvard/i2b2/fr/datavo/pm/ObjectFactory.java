//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.05.29 at 01:45:52 PM EDT 
//


package edu.harvard.i2b2.fr.datavo.pm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.i2b2.fr.datavo.pm package. 
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

    private final static QName _Configure_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "configure");
    private final static QName _GetUserConfiguration_QNAME = new QName("http://www.i2b2.org/xsd/cell/pm/1.1/", "get_user_configuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.i2b2.fr.datavo.pm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigureType }
     * 
     */
    public ConfigureType createConfigureType() {
        return new ConfigureType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link GlobalDataType }
     * 
     */
    public GlobalDataType createGlobalDataType() {
        return new GlobalDataType();
    }

    /**
     * Create an instance of {@link GetUserConfigurationType }
     * 
     */
    public GetUserConfigurationType createGetUserConfigurationType() {
        return new GetUserConfigurationType();
    }

    /**
     * Create an instance of {@link CellDatasType }
     * 
     */
    public CellDatasType createCellDatasType() {
        return new CellDatasType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link CellDataType }
     * 
     */
    public CellDataType createCellDataType() {
        return new CellDataType();
    }

    /**
     * Create an instance of {@link ProjectType }
     * 
     */
    public ProjectType createProjectType() {
        return new ProjectType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "configure")
    public JAXBElement<ConfigureType> createConfigure(ConfigureType value) {
        return new JAXBElement<ConfigureType>(_Configure_QNAME, ConfigureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/pm/1.1/", name = "get_user_configuration")
    public JAXBElement<GetUserConfigurationType> createGetUserConfiguration(GetUserConfigurationType value) {
        return new JAXBElement<GetUserConfigurationType>(_GetUserConfiguration_QNAME, GetUserConfigurationType.class, null, value);
    }

}
