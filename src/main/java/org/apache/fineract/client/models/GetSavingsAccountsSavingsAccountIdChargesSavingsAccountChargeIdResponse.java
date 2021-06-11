/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.4.0-453-g1ac2469-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.apache.fineract.client.models.GetChargesChargeCalculationType;
import org.apache.fineract.client.models.GetChargesChargeTimeType;
import org.apache.fineract.client.models.GetChargesCurrencyResponse;

/**
 * GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
 */
@ApiModel(description = "GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse")

public class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CHARGE_ID = "chargeId";
  @SerializedName(SERIALIZED_NAME_CHARGE_ID)
  private Integer chargeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetChargesChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetChargesChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public static final String SERIALIZED_NAME_AMOUNT_PERCENTAGE_APPLIED_TO = "amountPercentageAppliedTo";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PERCENTAGE_APPLIED_TO)
  private Double amountPercentageAppliedTo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetChargesCurrencyResponse currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Float amountPaid;

  public static final String SERIALIZED_NAME_AMOUNT_WAIVED = "amountWaived";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WAIVED)
  private Float amountWaived;

  public static final String SERIALIZED_NAME_AMOUNT_WRITTEN_OFF = "amountWrittenOff";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WRITTEN_OFF)
  private Float amountWrittenOff;

  public static final String SERIALIZED_NAME_AMOUNT_OUTSTANDING = "amountOutstanding";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUTSTANDING)
  private Float amountOutstanding;

  public static final String SERIALIZED_NAME_AMOUNT_OR_PERCENTAGE = "amountOrPercentage";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OR_PERCENTAGE)
  private Float amountOrPercentage;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeId(Integer chargeId) {
    
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getChargeId() {
    return chargeId;
  }


  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Passbook fee", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeTimeType(GetChargesChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse percentage(Double percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
    return this;
  }

   /**
   * Get amountPercentageAppliedTo
   * @return amountPercentageAppliedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getAmountPercentageAppliedTo() {
    return amountPercentageAppliedTo;
  }


  public void setAmountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse currency(GetChargesCurrencyResponse currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetChargesCurrencyResponse getCurrency() {
    return currency;
  }


  public void setCurrency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountPaid(Float amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountWaived(Float amountWaived) {
    
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountWaived() {
    return amountWaived;
  }


  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountWrittenOff(Float amountWrittenOff) {
    
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }


  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountOutstanding(Float amountOutstanding) {
    
    this.amountOutstanding = amountOutstanding;
    return this;
  }

   /**
   * Get amountOutstanding
   * @return amountOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmountOutstanding() {
    return amountOutstanding;
  }


  public void setAmountOutstanding(Float amountOutstanding) {
    this.amountOutstanding = amountOutstanding;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountOrPercentage(Float amountOrPercentage) {
    
    this.amountOrPercentage = amountOrPercentage;
    return this;
  }

   /**
   * Get amountOrPercentage
   * @return amountOrPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmountOrPercentage() {
    return amountOrPercentage;
  }


  public void setAmountOrPercentage(Float amountOrPercentage) {
    this.amountOrPercentage = amountOrPercentage;
  }


  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPenalty() {
    return penalty;
  }


  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = (GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse) o;
    return Objects.equals(this.id, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.id) &&
        Objects.equals(this.chargeId, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeId) &&
        Objects.equals(this.name, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.name) &&
        Objects.equals(this.chargeTimeType, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeTimeType) &&
        Objects.equals(this.chargeCalculationType, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeCalculationType) &&
        Objects.equals(this.percentage, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.percentage) &&
        Objects.equals(this.amountPercentageAppliedTo, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountPercentageAppliedTo) &&
        Objects.equals(this.currency, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.currency) &&
        Objects.equals(this.amount, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amount) &&
        Objects.equals(this.amountPaid, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountPaid) &&
        Objects.equals(this.amountWaived, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountWrittenOff) &&
        Objects.equals(this.amountOutstanding, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountOutstanding) &&
        Objects.equals(this.amountOrPercentage, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountOrPercentage) &&
        Objects.equals(this.penalty, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, chargeId, name, chargeTimeType, chargeCalculationType, percentage, amountPercentageAppliedTo, currency, amount, amountPaid, amountWaived, amountWrittenOff, amountOutstanding, amountOrPercentage, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountPercentageAppliedTo: ").append(toIndentedString(amountPercentageAppliedTo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
    sb.append("    amountOrPercentage: ").append(toIndentedString(amountOrPercentage)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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

