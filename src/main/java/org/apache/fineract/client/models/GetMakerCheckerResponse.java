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
import java.time.OffsetDateTime;

/**
 * GetMakerCheckerResponse
 */
@ApiModel(description = "GetMakerCheckerResponse")

public class GetMakerCheckerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entityName";
  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId;

  public static final String SERIALIZED_NAME_SUBRESOURCE_ID = "subresourceId";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE_ID)
  private Long subresourceId;

  public static final String SERIALIZED_NAME_MAKER = "maker";
  @SerializedName(SERIALIZED_NAME_MAKER)
  private String maker;

  public static final String SERIALIZED_NAME_MADE_ON_DATE = "madeOnDate";
  @SerializedName(SERIALIZED_NAME_MADE_ON_DATE)
  private OffsetDateTime madeOnDate;

  public static final String SERIALIZED_NAME_CHECKER = "checker";
  @SerializedName(SERIALIZED_NAME_CHECKER)
  private String checker;

  public static final String SERIALIZED_NAME_CHECKED_ON_DATE = "checkedOnDate";
  @SerializedName(SERIALIZED_NAME_CHECKED_ON_DATE)
  private OffsetDateTime checkedOnDate;

  public static final String SERIALIZED_NAME_PROCESSING_RESULT = "processingResult";
  @SerializedName(SERIALIZED_NAME_PROCESSING_RESULT)
  private String processingResult;

  public static final String SERIALIZED_NAME_COMMAND_AS_JSON = "commandAsJson";
  @SerializedName(SERIALIZED_NAME_COMMAND_AS_JSON)
  private String commandAsJson;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_GROUP_LEVEL_NAME = "groupLevelName";
  @SerializedName(SERIALIZED_NAME_GROUP_LEVEL_NAME)
  private String groupLevelName;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_LOAN_ACCOUNT_NO = "loanAccountNo";
  @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNT_NO)
  private String loanAccountNo;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNT_NO = "savingsAccountNo";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNT_NO)
  private String savingsAccountNo;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Long clientId;

  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Long loanId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public GetMakerCheckerResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetMakerCheckerResponse actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public GetMakerCheckerResponse entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public GetMakerCheckerResponse resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public GetMakerCheckerResponse subresourceId(Long subresourceId) {
    
    this.subresourceId = subresourceId;
    return this;
  }

   /**
   * Get subresourceId
   * @return subresourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubresourceId() {
    return subresourceId;
  }


  public void setSubresourceId(Long subresourceId) {
    this.subresourceId = subresourceId;
  }


  public GetMakerCheckerResponse maker(String maker) {
    
    this.maker = maker;
    return this;
  }

   /**
   * Get maker
   * @return maker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaker() {
    return maker;
  }


  public void setMaker(String maker) {
    this.maker = maker;
  }


  public GetMakerCheckerResponse madeOnDate(OffsetDateTime madeOnDate) {
    
    this.madeOnDate = madeOnDate;
    return this;
  }

   /**
   * Get madeOnDate
   * @return madeOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMadeOnDate() {
    return madeOnDate;
  }


  public void setMadeOnDate(OffsetDateTime madeOnDate) {
    this.madeOnDate = madeOnDate;
  }


  public GetMakerCheckerResponse checker(String checker) {
    
    this.checker = checker;
    return this;
  }

   /**
   * Get checker
   * @return checker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChecker() {
    return checker;
  }


  public void setChecker(String checker) {
    this.checker = checker;
  }


  public GetMakerCheckerResponse checkedOnDate(OffsetDateTime checkedOnDate) {
    
    this.checkedOnDate = checkedOnDate;
    return this;
  }

   /**
   * Get checkedOnDate
   * @return checkedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCheckedOnDate() {
    return checkedOnDate;
  }


  public void setCheckedOnDate(OffsetDateTime checkedOnDate) {
    this.checkedOnDate = checkedOnDate;
  }


  public GetMakerCheckerResponse processingResult(String processingResult) {
    
    this.processingResult = processingResult;
    return this;
  }

   /**
   * Get processingResult
   * @return processingResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcessingResult() {
    return processingResult;
  }


  public void setProcessingResult(String processingResult) {
    this.processingResult = processingResult;
  }


  public GetMakerCheckerResponse commandAsJson(String commandAsJson) {
    
    this.commandAsJson = commandAsJson;
    return this;
  }

   /**
   * Get commandAsJson
   * @return commandAsJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommandAsJson() {
    return commandAsJson;
  }


  public void setCommandAsJson(String commandAsJson) {
    this.commandAsJson = commandAsJson;
  }


  public GetMakerCheckerResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetMakerCheckerResponse groupLevelName(String groupLevelName) {
    
    this.groupLevelName = groupLevelName;
    return this;
  }

   /**
   * Get groupLevelName
   * @return groupLevelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupLevelName() {
    return groupLevelName;
  }


  public void setGroupLevelName(String groupLevelName) {
    this.groupLevelName = groupLevelName;
  }


  public GetMakerCheckerResponse groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public GetMakerCheckerResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetMakerCheckerResponse loanAccountNo(String loanAccountNo) {
    
    this.loanAccountNo = loanAccountNo;
    return this;
  }

   /**
   * Get loanAccountNo
   * @return loanAccountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLoanAccountNo() {
    return loanAccountNo;
  }


  public void setLoanAccountNo(String loanAccountNo) {
    this.loanAccountNo = loanAccountNo;
  }


  public GetMakerCheckerResponse savingsAccountNo(String savingsAccountNo) {
    
    this.savingsAccountNo = savingsAccountNo;
    return this;
  }

   /**
   * Get savingsAccountNo
   * @return savingsAccountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSavingsAccountNo() {
    return savingsAccountNo;
  }


  public void setSavingsAccountNo(String savingsAccountNo) {
    this.savingsAccountNo = savingsAccountNo;
  }


  public GetMakerCheckerResponse clientId(Long clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getClientId() {
    return clientId;
  }


  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }


  public GetMakerCheckerResponse loanId(Long loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoanId() {
    return loanId;
  }


  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }


  public GetMakerCheckerResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMakerCheckerResponse getMakerCheckerResponse = (GetMakerCheckerResponse) o;
    return Objects.equals(this.id, getMakerCheckerResponse.id) &&
        Objects.equals(this.actionName, getMakerCheckerResponse.actionName) &&
        Objects.equals(this.entityName, getMakerCheckerResponse.entityName) &&
        Objects.equals(this.resourceId, getMakerCheckerResponse.resourceId) &&
        Objects.equals(this.subresourceId, getMakerCheckerResponse.subresourceId) &&
        Objects.equals(this.maker, getMakerCheckerResponse.maker) &&
        Objects.equals(this.madeOnDate, getMakerCheckerResponse.madeOnDate) &&
        Objects.equals(this.checker, getMakerCheckerResponse.checker) &&
        Objects.equals(this.checkedOnDate, getMakerCheckerResponse.checkedOnDate) &&
        Objects.equals(this.processingResult, getMakerCheckerResponse.processingResult) &&
        Objects.equals(this.commandAsJson, getMakerCheckerResponse.commandAsJson) &&
        Objects.equals(this.officeName, getMakerCheckerResponse.officeName) &&
        Objects.equals(this.groupLevelName, getMakerCheckerResponse.groupLevelName) &&
        Objects.equals(this.groupName, getMakerCheckerResponse.groupName) &&
        Objects.equals(this.clientName, getMakerCheckerResponse.clientName) &&
        Objects.equals(this.loanAccountNo, getMakerCheckerResponse.loanAccountNo) &&
        Objects.equals(this.savingsAccountNo, getMakerCheckerResponse.savingsAccountNo) &&
        Objects.equals(this.clientId, getMakerCheckerResponse.clientId) &&
        Objects.equals(this.loanId, getMakerCheckerResponse.loanId) &&
        Objects.equals(this.url, getMakerCheckerResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionName, entityName, resourceId, subresourceId, maker, madeOnDate, checker, checkedOnDate, processingResult, commandAsJson, officeName, groupLevelName, groupName, clientName, loanAccountNo, savingsAccountNo, clientId, loanId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMakerCheckerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    subresourceId: ").append(toIndentedString(subresourceId)).append("\n");
    sb.append("    maker: ").append(toIndentedString(maker)).append("\n");
    sb.append("    madeOnDate: ").append(toIndentedString(madeOnDate)).append("\n");
    sb.append("    checker: ").append(toIndentedString(checker)).append("\n");
    sb.append("    checkedOnDate: ").append(toIndentedString(checkedOnDate)).append("\n");
    sb.append("    processingResult: ").append(toIndentedString(processingResult)).append("\n");
    sb.append("    commandAsJson: ").append(toIndentedString(commandAsJson)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    groupLevelName: ").append(toIndentedString(groupLevelName)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    loanAccountNo: ").append(toIndentedString(loanAccountNo)).append("\n");
    sb.append("    savingsAccountNo: ").append(toIndentedString(savingsAccountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

