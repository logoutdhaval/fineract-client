/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * GetShareAccountsChargeOptions
 */

public class GetShareAccountsChargeOptions {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("active")
    private Boolean active = null;

    @SerializedName("penalty")
    private Boolean penalty = null;

    @SerializedName("currency")
    private GetShareAccountsCurrency currency = null;

    @SerializedName("amount")
    private Integer amount = null;

    @SerializedName("chargeTimeType")
    private GetShareAccountsChargeTimeType chargeTimeType = null;

    @SerializedName("chargeAppliesTo")
    private GetShareAccountsChargeAppliesTo chargeAppliesTo = null;

    @SerializedName("calculationType")
    private GetShareAccountsChargeCalculationType calculationType = null;

    @SerializedName("paymentMode")
    private GetShareAccountsChargePaymentMode paymentMode = null;

    public GetShareAccountsChargeOptions id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetShareAccountsChargeOptions name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Activation fee", value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetShareAccountsChargeOptions active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public GetShareAccountsChargeOptions penalty(Boolean penalty) {
        this.penalty = penalty;
        return this;
    }

    /**
     * Get penalty
     *
     * @return penalty
     **/
    @ApiModelProperty(example = "false", value = "")
    public Boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(Boolean penalty) {
        this.penalty = penalty;
    }

    public GetShareAccountsChargeOptions currency(GetShareAccountsCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetShareAccountsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetShareAccountsCurrency currency) {
        this.currency = currency;
    }

    public GetShareAccountsChargeOptions amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public GetShareAccountsChargeOptions chargeTimeType(GetShareAccountsChargeTimeType chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
        return this;
    }

    /**
     * Get chargeTimeType
     *
     * @return chargeTimeType
     **/
    @ApiModelProperty(value = "")
    public GetShareAccountsChargeTimeType getChargeTimeType() {
        return chargeTimeType;
    }

    public void setChargeTimeType(GetShareAccountsChargeTimeType chargeTimeType) {
        this.chargeTimeType = chargeTimeType;
    }

    public GetShareAccountsChargeOptions chargeAppliesTo(GetShareAccountsChargeAppliesTo chargeAppliesTo) {
        this.chargeAppliesTo = chargeAppliesTo;
        return this;
    }

    /**
     * Get chargeAppliesTo
     *
     * @return chargeAppliesTo
     **/
    @ApiModelProperty(value = "")
    public GetShareAccountsChargeAppliesTo getChargeAppliesTo() {
        return chargeAppliesTo;
    }

    public void setChargeAppliesTo(GetShareAccountsChargeAppliesTo chargeAppliesTo) {
        this.chargeAppliesTo = chargeAppliesTo;
    }

    public GetShareAccountsChargeOptions calculationType(GetShareAccountsChargeCalculationType calculationType) {
        this.calculationType = calculationType;
        return this;
    }

    /**
     * Get calculationType
     *
     * @return calculationType
     **/
    @ApiModelProperty(value = "")
    public GetShareAccountsChargeCalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(GetShareAccountsChargeCalculationType calculationType) {
        this.calculationType = calculationType;
    }

    public GetShareAccountsChargeOptions paymentMode(GetShareAccountsChargePaymentMode paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * Get paymentMode
     *
     * @return paymentMode
     **/
    @ApiModelProperty(value = "")
    public GetShareAccountsChargePaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(GetShareAccountsChargePaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetShareAccountsChargeOptions getShareAccountsChargeOptions = (GetShareAccountsChargeOptions) o;
        return Objects.equals(this.id, getShareAccountsChargeOptions.id) &&
                Objects.equals(this.name, getShareAccountsChargeOptions.name) &&
                Objects.equals(this.active, getShareAccountsChargeOptions.active) &&
                Objects.equals(this.penalty, getShareAccountsChargeOptions.penalty) &&
                Objects.equals(this.currency, getShareAccountsChargeOptions.currency) &&
                Objects.equals(this.amount, getShareAccountsChargeOptions.amount) &&
                Objects.equals(this.chargeTimeType, getShareAccountsChargeOptions.chargeTimeType) &&
                Objects.equals(this.chargeAppliesTo, getShareAccountsChargeOptions.chargeAppliesTo) &&
                Objects.equals(this.calculationType, getShareAccountsChargeOptions.calculationType) &&
                Objects.equals(this.paymentMode, getShareAccountsChargeOptions.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, penalty, currency, amount, chargeTimeType, chargeAppliesTo, calculationType, paymentMode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetShareAccountsChargeOptions {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
        sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
        sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
        sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
