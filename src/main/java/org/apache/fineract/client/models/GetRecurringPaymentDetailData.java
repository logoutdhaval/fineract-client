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
import org.apache.fineract.client.models.GetRecurringPaymentType;

/**
 * GetRecurringPaymentDetailData
 */

public class GetRecurringPaymentDetailData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private GetRecurringPaymentType paymentType;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private Integer accountNumber;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private Integer checkNumber;

  public static final String SERIALIZED_NAME_ROUTING_CODE = "routingCode";
  @SerializedName(SERIALIZED_NAME_ROUTING_CODE)
  private Integer routingCode;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private Integer receiptNumber;

  public static final String SERIALIZED_NAME_BANK_NUMBER = "bankNumber";
  @SerializedName(SERIALIZED_NAME_BANK_NUMBER)
  private Integer bankNumber;


  public GetRecurringPaymentDetailData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "62", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringPaymentDetailData paymentType(GetRecurringPaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringPaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(GetRecurringPaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public GetRecurringPaymentDetailData accountNumber(Integer accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(Integer accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetRecurringPaymentDetailData checkNumber(Integer checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }


  public GetRecurringPaymentDetailData routingCode(Integer routingCode) {
    
    this.routingCode = routingCode;
    return this;
  }

   /**
   * Get routingCode
   * @return routingCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRoutingCode() {
    return routingCode;
  }


  public void setRoutingCode(Integer routingCode) {
    this.routingCode = routingCode;
  }


  public GetRecurringPaymentDetailData receiptNumber(Integer receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(Integer receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public GetRecurringPaymentDetailData bankNumber(Integer bankNumber) {
    
    this.bankNumber = bankNumber;
    return this;
  }

   /**
   * Get bankNumber
   * @return bankNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBankNumber() {
    return bankNumber;
  }


  public void setBankNumber(Integer bankNumber) {
    this.bankNumber = bankNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringPaymentDetailData getRecurringPaymentDetailData = (GetRecurringPaymentDetailData) o;
    return Objects.equals(this.id, getRecurringPaymentDetailData.id) &&
        Objects.equals(this.paymentType, getRecurringPaymentDetailData.paymentType) &&
        Objects.equals(this.accountNumber, getRecurringPaymentDetailData.accountNumber) &&
        Objects.equals(this.checkNumber, getRecurringPaymentDetailData.checkNumber) &&
        Objects.equals(this.routingCode, getRecurringPaymentDetailData.routingCode) &&
        Objects.equals(this.receiptNumber, getRecurringPaymentDetailData.receiptNumber) &&
        Objects.equals(this.bankNumber, getRecurringPaymentDetailData.bankNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentType, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringPaymentDetailData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    routingCode: ").append(toIndentedString(routingCode)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    bankNumber: ").append(toIndentedString(bankNumber)).append("\n");
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

