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
import java.time.LocalDate;
import org.apache.fineract.client.models.GetFromAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetStandingInstructionHistoryFromAccount;
import org.apache.fineract.client.models.GetStandingInstructionHistoryPageItemsFromClient;
import org.apache.fineract.client.models.GetStandingInstructionHistoryToAccount;
import org.apache.fineract.client.models.GetStandingInstructionHistoryToClient;
import org.apache.fineract.client.models.GetToAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToOfficeStandingInstructionSwagger;

/**
 * GetStandingInstructionHistoryPageItemsResponse
 */

public class GetStandingInstructionHistoryPageItemsResponse {
  public static final String SERIALIZED_NAME_STANDING_INSTRUCTION_ID = "standingInstructionId";
  @SerializedName(SERIALIZED_NAME_STANDING_INSTRUCTION_ID)
  private Long standingInstructionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FROM_OFFICE = "fromOffice";
  @SerializedName(SERIALIZED_NAME_FROM_OFFICE)
  private GetFromOfficeStandingInstructionSwagger fromOffice;

  public static final String SERIALIZED_NAME_FROM_CLIENT = "fromClient";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT)
  private GetStandingInstructionHistoryPageItemsFromClient fromClient;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT_TYPE = "fromAccountType";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_TYPE)
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "fromAccount";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private GetStandingInstructionHistoryFromAccount fromAccount;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_TYPE = "toAccountType";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_TYPE)
  private GetToAccountTypeStandingInstructionSwagger toAccountType;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "toAccount";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private GetStandingInstructionHistoryToAccount toAccount;

  public static final String SERIALIZED_NAME_TO_OFFICE = "toOffice";
  @SerializedName(SERIALIZED_NAME_TO_OFFICE)
  private GetToOfficeStandingInstructionSwagger toOffice;

  public static final String SERIALIZED_NAME_TO_CLIENT = "toClient";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT)
  private GetStandingInstructionHistoryToClient toClient;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EXECUTION_TIME = "executionTime";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TIME)
  private LocalDate executionTime;

  public static final String SERIALIZED_NAME_ERROR_LOG = "errorLog";
  @SerializedName(SERIALIZED_NAME_ERROR_LOG)
  private String errorLog;


  public GetStandingInstructionHistoryPageItemsResponse standingInstructionId(Long standingInstructionId) {
    
    this.standingInstructionId = standingInstructionId;
    return this;
  }

   /**
   * Get standingInstructionId
   * @return standingInstructionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getStandingInstructionId() {
    return standingInstructionId;
  }


  public void setStandingInstructionId(Long standingInstructionId) {
    this.standingInstructionId = standingInstructionId;
  }


  public GetStandingInstructionHistoryPageItemsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACC Transfer", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetStandingInstructionHistoryPageItemsResponse fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }


  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }


  public GetStandingInstructionHistoryPageItemsResponse fromClient(GetStandingInstructionHistoryPageItemsFromClient fromClient) {
    
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStandingInstructionHistoryPageItemsFromClient getFromClient() {
    return fromClient;
  }


  public void setFromClient(GetStandingInstructionHistoryPageItemsFromClient fromClient) {
    this.fromClient = fromClient;
  }


  public GetStandingInstructionHistoryPageItemsResponse fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }


  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public GetStandingInstructionHistoryPageItemsResponse fromAccount(GetStandingInstructionHistoryFromAccount fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStandingInstructionHistoryFromAccount getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(GetStandingInstructionHistoryFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetStandingInstructionHistoryPageItemsResponse toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }


  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }


  public GetStandingInstructionHistoryPageItemsResponse toAccount(GetStandingInstructionHistoryToAccount toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStandingInstructionHistoryToAccount getToAccount() {
    return toAccount;
  }


  public void setToAccount(GetStandingInstructionHistoryToAccount toAccount) {
    this.toAccount = toAccount;
  }


  public GetStandingInstructionHistoryPageItemsResponse toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }


  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }


  public GetStandingInstructionHistoryPageItemsResponse toClient(GetStandingInstructionHistoryToClient toClient) {
    
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStandingInstructionHistoryToClient getToClient() {
    return toClient;
  }


  public void setToClient(GetStandingInstructionHistoryToClient toClient) {
    this.toClient = toClient;
  }


  public GetStandingInstructionHistoryPageItemsResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetStandingInstructionHistoryPageItemsResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetStandingInstructionHistoryPageItemsResponse executionTime(LocalDate executionTime) {
    
    this.executionTime = executionTime;
    return this;
  }

   /**
   * Get executionTime
   * @return executionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getExecutionTime() {
    return executionTime;
  }


  public void setExecutionTime(LocalDate executionTime) {
    this.executionTime = executionTime;
  }


  public GetStandingInstructionHistoryPageItemsResponse errorLog(String errorLog) {
    
    this.errorLog = errorLog;
    return this;
  }

   /**
   * Get errorLog
   * @return errorLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorLog() {
    return errorLog;
  }


  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStandingInstructionHistoryPageItemsResponse getStandingInstructionHistoryPageItemsResponse = (GetStandingInstructionHistoryPageItemsResponse) o;
    return Objects.equals(this.standingInstructionId, getStandingInstructionHistoryPageItemsResponse.standingInstructionId) &&
        Objects.equals(this.name, getStandingInstructionHistoryPageItemsResponse.name) &&
        Objects.equals(this.fromOffice, getStandingInstructionHistoryPageItemsResponse.fromOffice) &&
        Objects.equals(this.fromClient, getStandingInstructionHistoryPageItemsResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getStandingInstructionHistoryPageItemsResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getStandingInstructionHistoryPageItemsResponse.fromAccount) &&
        Objects.equals(this.toAccountType, getStandingInstructionHistoryPageItemsResponse.toAccountType) &&
        Objects.equals(this.toAccount, getStandingInstructionHistoryPageItemsResponse.toAccount) &&
        Objects.equals(this.toOffice, getStandingInstructionHistoryPageItemsResponse.toOffice) &&
        Objects.equals(this.toClient, getStandingInstructionHistoryPageItemsResponse.toClient) &&
        Objects.equals(this.amount, getStandingInstructionHistoryPageItemsResponse.amount) &&
        Objects.equals(this.status, getStandingInstructionHistoryPageItemsResponse.status) &&
        Objects.equals(this.executionTime, getStandingInstructionHistoryPageItemsResponse.executionTime) &&
        Objects.equals(this.errorLog, getStandingInstructionHistoryPageItemsResponse.errorLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingInstructionId, name, fromOffice, fromClient, fromAccountType, fromAccount, toAccountType, toAccount, toOffice, toClient, amount, status, executionTime, errorLog);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStandingInstructionHistoryPageItemsResponse {\n");
    sb.append("    standingInstructionId: ").append(toIndentedString(standingInstructionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
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

