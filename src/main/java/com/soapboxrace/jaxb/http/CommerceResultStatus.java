
package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CommerceResultStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CommerceResultStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Fail_InvalidBasket"/>
 *     &lt;enumeration value="Fail_InsufficientFunds"/>
 *     &lt;enumeration value="Fail_InsufficientCarSlots"/>
 *     &lt;enumeration value="Fail_MaxStackOrRentalLimit"/>
 *     &lt;enumeration value="Fail_InvalidPerformanceUpgrade"/>
 *     &lt;enumeration value="Fail_ItemNotAvailableStandalone"/>
 *     &lt;enumeration value="Fail_PersonaNotRightLevel"/>
 *     &lt;enumeration value="Fail_LockedProductNotAccessibleToThisUser"/>
 *     &lt;enumeration value="Fail_BoostTransactionsAreDisabled"/>
 *     &lt;enumeration value="Fail_InsufficientPerformancePartInventory"/>
 *     &lt;enumeration value="Fail_MaxAllowedPurchasesForThisProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommerceResultStatus")
@XmlEnum
public enum CommerceResultStatus {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Fail_InvalidBasket")
    FAIL_INVALID_BASKET("Fail_InvalidBasket"),
    @XmlEnumValue("Fail_InsufficientFunds")
    FAIL_INSUFFICIENT_FUNDS("Fail_InsufficientFunds"),
    @XmlEnumValue("Fail_InsufficientCarSlots")
    FAIL_INSUFFICIENT_CAR_SLOTS("Fail_InsufficientCarSlots"),
    @XmlEnumValue("Fail_MaxStackOrRentalLimit")
    FAIL_MAX_STACK_OR_RENTAL_LIMIT("Fail_MaxStackOrRentalLimit"),
    @XmlEnumValue("Fail_InvalidPerformanceUpgrade")
    FAIL_INVALID_PERFORMANCE_UPGRADE("Fail_InvalidPerformanceUpgrade"),
    @XmlEnumValue("Fail_ItemNotAvailableStandalone")
    FAIL_ITEM_NOT_AVAILABLE_STANDALONE("Fail_ItemNotAvailableStandalone"),
    @XmlEnumValue("Fail_PersonaNotRightLevel")
    FAIL_PERSONA_NOT_RIGHT_LEVEL("Fail_PersonaNotRightLevel"),
    @XmlEnumValue("Fail_LockedProductNotAccessibleToThisUser")
    FAIL_LOCKED_PRODUCT_NOT_ACCESSIBLE_TO_THIS_USER("Fail_LockedProductNotAccessibleToThisUser"),
    @XmlEnumValue("Fail_BoostTransactionsAreDisabled")
    FAIL_BOOST_TRANSACTIONS_ARE_DISABLED("Fail_BoostTransactionsAreDisabled"),
    @XmlEnumValue("Fail_InsufficientPerformancePartInventory")
    FAIL_INSUFFICIENT_PERFORMANCE_PART_INVENTORY("Fail_InsufficientPerformancePartInventory"),
    @XmlEnumValue("Fail_MaxAllowedPurchasesForThisProduct")
    FAIL_MAX_ALLOWED_PURCHASES_FOR_THIS_PRODUCT("Fail_MaxAllowedPurchasesForThisProduct");
    private final String value;

    CommerceResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommerceResultStatus fromValue(String v) {
        for (CommerceResultStatus c: CommerceResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}