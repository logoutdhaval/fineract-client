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

/**
 * GetGroupsGroupIdAccountsMemberLoanStatus
 */

public class GetGroupsGroupIdAccountsMemberLoanStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PENDING_APPROVAL = "pendingApproval";
  @SerializedName(SERIALIZED_NAME_PENDING_APPROVAL)
  private Boolean pendingApproval;

  public static final String SERIALIZED_NAME_WAITING_FOR_DISBURSAL = "waitingForDisbursal";
  @SerializedName(SERIALIZED_NAME_WAITING_FOR_DISBURSAL)
  private Boolean waitingForDisbursal;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CLOSED_OBLIGATIONS_MET = "closedObligationsMet";
  @SerializedName(SERIALIZED_NAME_CLOSED_OBLIGATIONS_MET)
  private Boolean closedObligationsMet;

  public static final String SERIALIZED_NAME_CLOSED_WRITTEN_OFF = "closedWrittenOff";
  @SerializedName(SERIALIZED_NAME_CLOSED_WRITTEN_OFF)
  private Boolean closedWrittenOff;

  public static final String SERIALIZED_NAME_CLOSED_RESCHEDULED = "closedRescheduled";
  @SerializedName(SERIALIZED_NAME_CLOSED_RESCHEDULED)
  private Boolean closedRescheduled;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_OVERPAID = "overpaid";
  @SerializedName(SERIALIZED_NAME_OVERPAID)
  private Boolean overpaid;


  public GetGroupsGroupIdAccountsMemberLoanStatus id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loanStatusType.approved", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Approved", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus pendingApproval(Boolean pendingApproval) {
    
    this.pendingApproval = pendingApproval;
    return this;
  }

   /**
   * Get pendingApproval
   * @return pendingApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPendingApproval() {
    return pendingApproval;
  }


  public void setPendingApproval(Boolean pendingApproval) {
    this.pendingApproval = pendingApproval;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus waitingForDisbursal(Boolean waitingForDisbursal) {
    
    this.waitingForDisbursal = waitingForDisbursal;
    return this;
  }

   /**
   * Get waitingForDisbursal
   * @return waitingForDisbursal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getWaitingForDisbursal() {
    return waitingForDisbursal;
  }


  public void setWaitingForDisbursal(Boolean waitingForDisbursal) {
    this.waitingForDisbursal = waitingForDisbursal;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus closedObligationsMet(Boolean closedObligationsMet) {
    
    this.closedObligationsMet = closedObligationsMet;
    return this;
  }

   /**
   * Get closedObligationsMet
   * @return closedObligationsMet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosedObligationsMet() {
    return closedObligationsMet;
  }


  public void setClosedObligationsMet(Boolean closedObligationsMet) {
    this.closedObligationsMet = closedObligationsMet;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus closedWrittenOff(Boolean closedWrittenOff) {
    
    this.closedWrittenOff = closedWrittenOff;
    return this;
  }

   /**
   * Get closedWrittenOff
   * @return closedWrittenOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosedWrittenOff() {
    return closedWrittenOff;
  }


  public void setClosedWrittenOff(Boolean closedWrittenOff) {
    this.closedWrittenOff = closedWrittenOff;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus closedRescheduled(Boolean closedRescheduled) {
    
    this.closedRescheduled = closedRescheduled;
    return this;
  }

   /**
   * Get closedRescheduled
   * @return closedRescheduled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosedRescheduled() {
    return closedRescheduled;
  }


  public void setClosedRescheduled(Boolean closedRescheduled) {
    this.closedRescheduled = closedRescheduled;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public GetGroupsGroupIdAccountsMemberLoanStatus overpaid(Boolean overpaid) {
    
    this.overpaid = overpaid;
    return this;
  }

   /**
   * Get overpaid
   * @return overpaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getOverpaid() {
    return overpaid;
  }


  public void setOverpaid(Boolean overpaid) {
    this.overpaid = overpaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdAccountsMemberLoanStatus getGroupsGroupIdAccountsMemberLoanStatus = (GetGroupsGroupIdAccountsMemberLoanStatus) o;
    return Objects.equals(this.id, getGroupsGroupIdAccountsMemberLoanStatus.id) &&
        Objects.equals(this.code, getGroupsGroupIdAccountsMemberLoanStatus.code) &&
        Objects.equals(this.description, getGroupsGroupIdAccountsMemberLoanStatus.description) &&
        Objects.equals(this.pendingApproval, getGroupsGroupIdAccountsMemberLoanStatus.pendingApproval) &&
        Objects.equals(this.waitingForDisbursal, getGroupsGroupIdAccountsMemberLoanStatus.waitingForDisbursal) &&
        Objects.equals(this.active, getGroupsGroupIdAccountsMemberLoanStatus.active) &&
        Objects.equals(this.closedObligationsMet, getGroupsGroupIdAccountsMemberLoanStatus.closedObligationsMet) &&
        Objects.equals(this.closedWrittenOff, getGroupsGroupIdAccountsMemberLoanStatus.closedWrittenOff) &&
        Objects.equals(this.closedRescheduled, getGroupsGroupIdAccountsMemberLoanStatus.closedRescheduled) &&
        Objects.equals(this.closed, getGroupsGroupIdAccountsMemberLoanStatus.closed) &&
        Objects.equals(this.overpaid, getGroupsGroupIdAccountsMemberLoanStatus.overpaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, pendingApproval, waitingForDisbursal, active, closedObligationsMet, closedWrittenOff, closedRescheduled, closed, overpaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdAccountsMemberLoanStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pendingApproval: ").append(toIndentedString(pendingApproval)).append("\n");
    sb.append("    waitingForDisbursal: ").append(toIndentedString(waitingForDisbursal)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    closedObligationsMet: ").append(toIndentedString(closedObligationsMet)).append("\n");
    sb.append("    closedWrittenOff: ").append(toIndentedString(closedWrittenOff)).append("\n");
    sb.append("    closedRescheduled: ").append(toIndentedString(closedRescheduled)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    overpaid: ").append(toIndentedString(overpaid)).append("\n");
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

