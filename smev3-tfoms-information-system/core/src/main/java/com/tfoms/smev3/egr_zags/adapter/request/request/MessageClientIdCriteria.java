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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClientIdCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageClientIdCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}string-50"/>
 *         &lt;element name="clientIdCriteria" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}ClientIdCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageClientIdCriteria", propOrder = {
    "clientId",
    "clientIdCriteria"
})
public class MessageClientIdCriteria {

    @XmlElement(required = true)
    protected String clientId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClientIdCriteria clientIdCriteria;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientIdCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIdCriteria }
     *     
     */
    public ClientIdCriteria getClientIdCriteria() {
        return clientIdCriteria;
    }

    /**
     * Sets the value of the clientIdCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIdCriteria }
     *     
     */
    public void setClientIdCriteria(ClientIdCriteria value) {
        this.clientIdCriteria = value;
    }

}
