//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 01:34:08 PM KRAT 
//


package com.tfoms.smev3.health.worth.query.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredRenderingList" type="{http://ffoms.ru/GetInsuredRenderedMedicalServices/1.0.0}InsuredRenderingListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDataType", namespace = "http://ffoms.ru/GetInsuredRenderedMedicalServices/1.0.0", propOrder = {
    "insuredRenderingList"
})
public class OutputDataType {

    @XmlElement(name = "InsuredRenderingList", required = true)
    protected InsuredRenderingListType insuredRenderingList;

    /**
     * Gets the value of the insuredRenderingList property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredRenderingListType }
     *     
     */
    public InsuredRenderingListType getInsuredRenderingList() {
        return insuredRenderingList;
    }

    /**
     * Sets the value of the insuredRenderingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredRenderingListType }
     *     
     */
    public void setInsuredRenderingList(InsuredRenderingListType value) {
        this.insuredRenderingList = value;
    }

}