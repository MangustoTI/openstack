//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Definition"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Long_Id"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Path"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Is_Offline"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_No_Logging"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Local_Extent_Management_Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Extent_Size"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Extent_Management_Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Segment_Management_Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Dependent_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Do_Not_Generate"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Tablespace_Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Physical_Name"/>
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
    "definition",
    "name",
    "longId",
    "ownerPath",
    "oracleIsOffline",
    "oracleNoLogging",
    "localExtentManagementType",
    "extentSize",
    "extentManagementType",
    "segmentManagementType",
    "dependentObjectsRefArray",
    "doNotGenerate",
    "tablespaceType",
    "userFormattedName",
    "userFormattedPhysicalName"
})
@XmlRootElement(name = "Oracle_TablespaceProps")
public class OracleTablespaceProps {

    @XmlElement(name = "Definition", required = true)
    protected Definition definition;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Owner_Path", required = true)
    protected OwnerPath ownerPath;
    @XmlElement(name = "Oracle_Is_Offline")
    protected boolean oracleIsOffline;
    @XmlElement(name = "Oracle_No_Logging")
    protected boolean oracleNoLogging;
    @XmlElement(name = "Local_Extent_Management_Type", required = true)
    protected BigInteger localExtentManagementType;
    @XmlElement(name = "Extent_Size", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String extentSize;
    @XmlElement(name = "Extent_Management_Type", required = true)
    protected BigInteger extentManagementType;
    @XmlElement(name = "Segment_Management_Type", required = true)
    protected BigInteger segmentManagementType;
    @XmlElement(name = "Dependent_Objects_Ref_Array", required = true)
    protected DependentObjectsRefArray dependentObjectsRefArray;
    @XmlElement(name = "Do_Not_Generate", required = true)
    protected DoNotGenerate doNotGenerate;
    @XmlElement(name = "Tablespace_Type", required = true)
    protected BigInteger tablespaceType;
    @XmlElement(name = "User_Formatted_Name", required = true)
    protected UserFormattedName userFormattedName;
    @XmlElement(name = "User_Formatted_Physical_Name", required = true)
    protected UserFormattedPhysicalName userFormattedPhysicalName;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setDefinition(Definition value) {
        this.definition = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the longId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongId() {
        return longId;
    }

    /**
     * Sets the value of the longId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongId(String value) {
        this.longId = value;
    }

    /**
     * Gets the value of the ownerPath property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerPath }
     *     
     */
    public OwnerPath getOwnerPath() {
        return ownerPath;
    }

    /**
     * Sets the value of the ownerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerPath }
     *     
     */
    public void setOwnerPath(OwnerPath value) {
        this.ownerPath = value;
    }

    /**
     * Gets the value of the oracleIsOffline property.
     * 
     */
    public boolean isOracleIsOffline() {
        return oracleIsOffline;
    }

    /**
     * Sets the value of the oracleIsOffline property.
     * 
     */
    public void setOracleIsOffline(boolean value) {
        this.oracleIsOffline = value;
    }

    /**
     * Gets the value of the oracleNoLogging property.
     * 
     */
    public boolean isOracleNoLogging() {
        return oracleNoLogging;
    }

    /**
     * Sets the value of the oracleNoLogging property.
     * 
     */
    public void setOracleNoLogging(boolean value) {
        this.oracleNoLogging = value;
    }

    /**
     * Gets the value of the localExtentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalExtentManagementType() {
        return localExtentManagementType;
    }

    /**
     * Sets the value of the localExtentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalExtentManagementType(BigInteger value) {
        this.localExtentManagementType = value;
    }

    /**
     * Gets the value of the extentSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtentSize() {
        return extentSize;
    }

    /**
     * Sets the value of the extentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtentSize(String value) {
        this.extentSize = value;
    }

    /**
     * Gets the value of the extentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtentManagementType() {
        return extentManagementType;
    }

    /**
     * Sets the value of the extentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtentManagementType(BigInteger value) {
        this.extentManagementType = value;
    }

    /**
     * Gets the value of the segmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegmentManagementType() {
        return segmentManagementType;
    }

    /**
     * Sets the value of the segmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegmentManagementType(BigInteger value) {
        this.segmentManagementType = value;
    }

    /**
     * Gets the value of the dependentObjectsRefArray property.
     * 
     * @return
     *     possible object is
     *     {@link DependentObjectsRefArray }
     *     
     */
    public DependentObjectsRefArray getDependentObjectsRefArray() {
        return dependentObjectsRefArray;
    }

    /**
     * Sets the value of the dependentObjectsRefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentObjectsRefArray }
     *     
     */
    public void setDependentObjectsRefArray(DependentObjectsRefArray value) {
        this.dependentObjectsRefArray = value;
    }

    /**
     * Gets the value of the doNotGenerate property.
     * 
     * @return
     *     possible object is
     *     {@link DoNotGenerate }
     *     
     */
    public DoNotGenerate getDoNotGenerate() {
        return doNotGenerate;
    }

    /**
     * Sets the value of the doNotGenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoNotGenerate }
     *     
     */
    public void setDoNotGenerate(DoNotGenerate value) {
        this.doNotGenerate = value;
    }

    /**
     * Gets the value of the tablespaceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTablespaceType() {
        return tablespaceType;
    }

    /**
     * Sets the value of the tablespaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTablespaceType(BigInteger value) {
        this.tablespaceType = value;
    }

    /**
     * Gets the value of the userFormattedName property.
     * 
     * @return
     *     possible object is
     *     {@link UserFormattedName }
     *     
     */
    public UserFormattedName getUserFormattedName() {
        return userFormattedName;
    }

    /**
     * Sets the value of the userFormattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFormattedName }
     *     
     */
    public void setUserFormattedName(UserFormattedName value) {
        this.userFormattedName = value;
    }

    /**
     * Gets the value of the userFormattedPhysicalName property.
     * 
     * @return
     *     possible object is
     *     {@link UserFormattedPhysicalName }
     *     
     */
    public UserFormattedPhysicalName getUserFormattedPhysicalName() {
        return userFormattedPhysicalName;
    }

    /**
     * Sets the value of the userFormattedPhysicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFormattedPhysicalName }
     *     
     */
    public void setUserFormattedPhysicalName(UserFormattedPhysicalName value) {
        this.userFormattedPhysicalName = value;
    }

}