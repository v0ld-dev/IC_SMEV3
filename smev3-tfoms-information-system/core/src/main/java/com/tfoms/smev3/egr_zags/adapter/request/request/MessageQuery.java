//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 01:32:40 PM KRAT 
//


package com.tfoms.smev3.egr_zags.adapter.request.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}itSystem"/>
 *         &lt;element name="nodeId" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}string-50" minOccurs="0"/>
 *         &lt;element name="specificQuery" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}QueryTypeCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageQuery", propOrder = {
    "itSystem",
    "nodeId",
    "specificQuery"
})
public class MessageQuery {

    @XmlElement(required = true)
    protected String itSystem;
    protected String nodeId;
    protected QueryTypeCriteria specificQuery;

    /**
     * Gets the value of the itSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItSystem() {
        return itSystem;
    }

    /**
     * Sets the value of the itSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItSystem(String value) {
        this.itSystem = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the specificQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTypeCriteria }
     *     
     */
    public QueryTypeCriteria getSpecificQuery() {
        return specificQuery;
    }

    /**
     * Sets the value of the specificQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTypeCriteria }
     *     
     */
    public void setSpecificQuery(QueryTypeCriteria value) {
        this.specificQuery = value;
    }

}
