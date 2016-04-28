//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.ca.com/erwin/data}ModelEnvProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}ModelProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Entity_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Domain_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Tablespace_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Bitmap_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Subject_Area_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Relationship_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Default_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Validation_Rule_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Trigger_Template_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Default_Trigger_Template_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name_Mapping_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Naming_Options_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}History_Information_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Sequence_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Font_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Default_Fonts_And_Colors_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Override_Groups"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelEnvProps",
    "modelProps",
    "entityGroups",
    "domainGroups",
    "oracleTablespaceGroups",
    "bitmapGroups",
    "subjectAreaGroups",
    "relationshipGroups",
    "defaultGroups",
    "validationRuleGroups",
    "triggerTemplateGroups",
    "defaultTriggerTemplateGroups",
    "nameMappingGroups",
    "namingOptionsGroups",
    "historyInformationGroups",
    "sequenceGroups",
    "fontGroups",
    "defaultFontsAndColorsGroups",
    "ownerOverrideGroups"
})
@XmlRootElement(name = "Model")
public class Model {

    @XmlElement(name = "ModelEnvProps", required = true)
    protected ModelEnvProps modelEnvProps;
    @XmlElement(name = "ModelProps", required = true)
    protected ModelProps modelProps;
    @XmlElement(name = "Entity_Groups", required = true)
    protected EntityGroups entityGroups;
    @XmlElement(name = "Domain_Groups", required = true)
    protected DomainGroups domainGroups;
    @XmlElement(name = "Oracle_Tablespace_Groups", required = true)
    protected OracleTablespaceGroups oracleTablespaceGroups;
    @XmlElement(name = "Bitmap_Groups", required = true)
    protected BitmapGroups bitmapGroups;
    @XmlElement(name = "Subject_Area_Groups", required = true)
    protected SubjectAreaGroups subjectAreaGroups;
    @XmlElement(name = "Relationship_Groups", required = true)
    protected RelationshipGroups relationshipGroups;
    @XmlElement(name = "Default_Groups", required = true)
    protected DefaultGroups defaultGroups;
    @XmlElement(name = "Validation_Rule_Groups", required = true)
    protected ValidationRuleGroups validationRuleGroups;
    @XmlElement(name = "Trigger_Template_Groups", required = true)
    protected TriggerTemplateGroups triggerTemplateGroups;
    @XmlElement(name = "Default_Trigger_Template_Groups", required = true)
    protected DefaultTriggerTemplateGroups defaultTriggerTemplateGroups;
    @XmlElement(name = "Name_Mapping_Groups", required = true)
    protected NameMappingGroups nameMappingGroups;
    @XmlElement(name = "Naming_Options_Groups", required = true)
    protected NamingOptionsGroups namingOptionsGroups;
    @XmlElement(name = "History_Information_Groups", required = true)
    protected HistoryInformationGroups historyInformationGroups;
    @XmlElement(name = "Sequence_Groups", required = true)
    protected SequenceGroups sequenceGroups;
    @XmlElement(name = "Font_Groups", required = true)
    protected FontGroups fontGroups;
    @XmlElement(name = "Default_Fonts_And_Colors_Groups", required = true)
    protected DefaultFontsAndColorsGroups defaultFontsAndColorsGroups;
    @XmlElement(name = "Owner_Override_Groups", required = true)
    protected OwnerOverrideGroups ownerOverrideGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the modelEnvProps property.
     * 
     * @return
     *     possible object is
     *     {@link ModelEnvProps }
     *     
     */
    public ModelEnvProps getModelEnvProps() {
        return modelEnvProps;
    }

    /**
     * Sets the value of the modelEnvProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelEnvProps }
     *     
     */
    public void setModelEnvProps(ModelEnvProps value) {
        this.modelEnvProps = value;
    }

    /**
     * Gets the value of the modelProps property.
     * 
     * @return
     *     possible object is
     *     {@link ModelProps }
     *     
     */
    public ModelProps getModelProps() {
        return modelProps;
    }

    /**
     * Sets the value of the modelProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelProps }
     *     
     */
    public void setModelProps(ModelProps value) {
        this.modelProps = value;
    }

    /**
     * Gets the value of the entityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link EntityGroups }
     *     
     */
    public EntityGroups getEntityGroups() {
        return entityGroups;
    }

    /**
     * Sets the value of the entityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroups }
     *     
     */
    public void setEntityGroups(EntityGroups value) {
        this.entityGroups = value;
    }

    /**
     * Gets the value of the domainGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DomainGroups }
     *     
     */
    public DomainGroups getDomainGroups() {
        return domainGroups;
    }

    /**
     * Sets the value of the domainGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainGroups }
     *     
     */
    public void setDomainGroups(DomainGroups value) {
        this.domainGroups = value;
    }

    /**
     * Gets the value of the oracleTablespaceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OracleTablespaceGroups }
     *     
     */
    public OracleTablespaceGroups getOracleTablespaceGroups() {
        return oracleTablespaceGroups;
    }

    /**
     * Sets the value of the oracleTablespaceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OracleTablespaceGroups }
     *     
     */
    public void setOracleTablespaceGroups(OracleTablespaceGroups value) {
        this.oracleTablespaceGroups = value;
    }

    /**
     * Gets the value of the bitmapGroups property.
     * 
     * @return
     *     possible object is
     *     {@link BitmapGroups }
     *     
     */
    public BitmapGroups getBitmapGroups() {
        return bitmapGroups;
    }

    /**
     * Sets the value of the bitmapGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link BitmapGroups }
     *     
     */
    public void setBitmapGroups(BitmapGroups value) {
        this.bitmapGroups = value;
    }

    /**
     * Gets the value of the subjectAreaGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaGroups }
     *     
     */
    public SubjectAreaGroups getSubjectAreaGroups() {
        return subjectAreaGroups;
    }

    /**
     * Sets the value of the subjectAreaGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaGroups }
     *     
     */
    public void setSubjectAreaGroups(SubjectAreaGroups value) {
        this.subjectAreaGroups = value;
    }

    /**
     * Gets the value of the relationshipGroups property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipGroups }
     *     
     */
    public RelationshipGroups getRelationshipGroups() {
        return relationshipGroups;
    }

    /**
     * Sets the value of the relationshipGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipGroups }
     *     
     */
    public void setRelationshipGroups(RelationshipGroups value) {
        this.relationshipGroups = value;
    }

    /**
     * Gets the value of the defaultGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultGroups }
     *     
     */
    public DefaultGroups getDefaultGroups() {
        return defaultGroups;
    }

    /**
     * Sets the value of the defaultGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultGroups }
     *     
     */
    public void setDefaultGroups(DefaultGroups value) {
        this.defaultGroups = value;
    }

    /**
     * Gets the value of the validationRuleGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationRuleGroups }
     *     
     */
    public ValidationRuleGroups getValidationRuleGroups() {
        return validationRuleGroups;
    }

    /**
     * Sets the value of the validationRuleGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationRuleGroups }
     *     
     */
    public void setValidationRuleGroups(ValidationRuleGroups value) {
        this.validationRuleGroups = value;
    }

    /**
     * Gets the value of the triggerTemplateGroups property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTemplateGroups }
     *     
     */
    public TriggerTemplateGroups getTriggerTemplateGroups() {
        return triggerTemplateGroups;
    }

    /**
     * Sets the value of the triggerTemplateGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTemplateGroups }
     *     
     */
    public void setTriggerTemplateGroups(TriggerTemplateGroups value) {
        this.triggerTemplateGroups = value;
    }

    /**
     * Gets the value of the defaultTriggerTemplateGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTriggerTemplateGroups }
     *     
     */
    public DefaultTriggerTemplateGroups getDefaultTriggerTemplateGroups() {
        return defaultTriggerTemplateGroups;
    }

    /**
     * Sets the value of the defaultTriggerTemplateGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTriggerTemplateGroups }
     *     
     */
    public void setDefaultTriggerTemplateGroups(DefaultTriggerTemplateGroups value) {
        this.defaultTriggerTemplateGroups = value;
    }

    /**
     * Gets the value of the nameMappingGroups property.
     * 
     * @return
     *     possible object is
     *     {@link NameMappingGroups }
     *     
     */
    public NameMappingGroups getNameMappingGroups() {
        return nameMappingGroups;
    }

    /**
     * Sets the value of the nameMappingGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameMappingGroups }
     *     
     */
    public void setNameMappingGroups(NameMappingGroups value) {
        this.nameMappingGroups = value;
    }

    /**
     * Gets the value of the namingOptionsGroups property.
     * 
     * @return
     *     possible object is
     *     {@link NamingOptionsGroups }
     *     
     */
    public NamingOptionsGroups getNamingOptionsGroups() {
        return namingOptionsGroups;
    }

    /**
     * Sets the value of the namingOptionsGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingOptionsGroups }
     *     
     */
    public void setNamingOptionsGroups(NamingOptionsGroups value) {
        this.namingOptionsGroups = value;
    }

    /**
     * Gets the value of the historyInformationGroups property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryInformationGroups }
     *     
     */
    public HistoryInformationGroups getHistoryInformationGroups() {
        return historyInformationGroups;
    }

    /**
     * Sets the value of the historyInformationGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryInformationGroups }
     *     
     */
    public void setHistoryInformationGroups(HistoryInformationGroups value) {
        this.historyInformationGroups = value;
    }

    /**
     * Gets the value of the sequenceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceGroups }
     *     
     */
    public SequenceGroups getSequenceGroups() {
        return sequenceGroups;
    }

    /**
     * Sets the value of the sequenceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceGroups }
     *     
     */
    public void setSequenceGroups(SequenceGroups value) {
        this.sequenceGroups = value;
    }

    /**
     * Gets the value of the fontGroups property.
     * 
     * @return
     *     possible object is
     *     {@link FontGroups }
     *     
     */
    public FontGroups getFontGroups() {
        return fontGroups;
    }

    /**
     * Sets the value of the fontGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontGroups }
     *     
     */
    public void setFontGroups(FontGroups value) {
        this.fontGroups = value;
    }

    /**
     * Gets the value of the defaultFontsAndColorsGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultFontsAndColorsGroups }
     *     
     */
    public DefaultFontsAndColorsGroups getDefaultFontsAndColorsGroups() {
        return defaultFontsAndColorsGroups;
    }

    /**
     * Sets the value of the defaultFontsAndColorsGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultFontsAndColorsGroups }
     *     
     */
    public void setDefaultFontsAndColorsGroups(DefaultFontsAndColorsGroups value) {
        this.defaultFontsAndColorsGroups = value;
    }

    /**
     * Gets the value of the ownerOverrideGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerOverrideGroups }
     *     
     */
    public OwnerOverrideGroups getOwnerOverrideGroups() {
        return ownerOverrideGroups;
    }

    /**
     * Sets the value of the ownerOverrideGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerOverrideGroups }
     *     
     */
    public void setOwnerOverrideGroups(OwnerOverrideGroups value) {
        this.ownerOverrideGroups = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}