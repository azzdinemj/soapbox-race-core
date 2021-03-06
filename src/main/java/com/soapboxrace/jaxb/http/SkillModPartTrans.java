
package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkillModPartTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkillModPartTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SkillModPartAttribHash" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillModPartTrans", propOrder = {
    "isFixed",
    "skillModPartAttribHash"
})
public class SkillModPartTrans {

    @XmlElement(name = "IsFixed")
    protected boolean isFixed;
    @XmlElement(name = "SkillModPartAttribHash")
    protected int skillModPartAttribHash;

    /**
     * Gets the value of the isFixed property.
     * 
     */
    public boolean isIsFixed() {
        return isFixed;
    }

    /**
     * Sets the value of the isFixed property.
     * 
     */
    public void setIsFixed(boolean value) {
        this.isFixed = value;
    }

    /**
     * Gets the value of the skillModPartAttribHash property.
     * 
     */
    public int getSkillModPartAttribHash() {
        return skillModPartAttribHash;
    }

    /**
     * Sets the value of the skillModPartAttribHash property.
     * 
     */
    public void setSkillModPartAttribHash(int value) {
        this.skillModPartAttribHash = value;
    }

}
