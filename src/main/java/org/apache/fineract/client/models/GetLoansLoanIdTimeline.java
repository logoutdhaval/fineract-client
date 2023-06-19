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
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
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
import java.util.Date;

/**
 * GetLoansLoanIdTimeline
 */

public class GetLoansLoanIdTimeline {
  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private Date submittedOnDate;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_USERNAME = "submittedByUsername";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_USERNAME)
  private String submittedByUsername;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_FIRSTNAME = "submittedByFirstname";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_FIRSTNAME)
  private String submittedByFirstname;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_LASTNAME = "submittedByLastname";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_LASTNAME)
  private String submittedByLastname;

  public static final String SERIALIZED_NAME_APPROVED_ON_DATE = "approvedOnDate";
  @SerializedName(SERIALIZED_NAME_APPROVED_ON_DATE)
  private Date approvedOnDate;

  public static final String SERIALIZED_NAME_APPROVED_BY_USERNAME = "approvedByUsername";
  @SerializedName(SERIALIZED_NAME_APPROVED_BY_USERNAME)
  private String approvedByUsername;

  public static final String SERIALIZED_NAME_APPROVED_BY_FIRSTNAME = "approvedByFirstname";
  @SerializedName(SERIALIZED_NAME_APPROVED_BY_FIRSTNAME)
  private String approvedByFirstname;

  public static final String SERIALIZED_NAME_APPROVED_BY_LASTNAME = "approvedByLastname";
  @SerializedName(SERIALIZED_NAME_APPROVED_BY_LASTNAME)
  private String approvedByLastname;

  public static final String SERIALIZED_NAME_EXPECTED_DISBURSEMENT_DATE = "expectedDisbursementDate";
  @SerializedName(SERIALIZED_NAME_EXPECTED_DISBURSEMENT_DATE)
  private Date expectedDisbursementDate;

  public static final String SERIALIZED_NAME_ACTUAL_DISBURSEMENT_DATE = "actualDisbursementDate";
  @SerializedName(SERIALIZED_NAME_ACTUAL_DISBURSEMENT_DATE)
  private Date actualDisbursementDate;

  public static final String SERIALIZED_NAME_DISBURSED_BY_USERNAME = "disbursedByUsername";
  @SerializedName(SERIALIZED_NAME_DISBURSED_BY_USERNAME)
  private String disbursedByUsername;

  public static final String SERIALIZED_NAME_DISBURSED_BY_FIRSTNAME = "disbursedByFirstname";
  @SerializedName(SERIALIZED_NAME_DISBURSED_BY_FIRSTNAME)
  private String disbursedByFirstname;

  public static final String SERIALIZED_NAME_DISBURSED_BY_LASTNAME = "disbursedByLastname";
  @SerializedName(SERIALIZED_NAME_DISBURSED_BY_LASTNAME)
  private String disbursedByLastname;

  public static final String SERIALIZED_NAME_EXPECTED_MATURITY_DATE = "expectedMaturityDate";
  @SerializedName(SERIALIZED_NAME_EXPECTED_MATURITY_DATE)
  private Date expectedMaturityDate;


  public GetLoansLoanIdTimeline submittedOnDate(Date submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(Date submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public GetLoansLoanIdTimeline submittedByUsername(String submittedByUsername) {
    
    this.submittedByUsername = submittedByUsername;
    return this;
  }

   /**
   * Get submittedByUsername
   * @return submittedByUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin", value = "")

  public String getSubmittedByUsername() {
    return submittedByUsername;
  }


  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }


  public GetLoansLoanIdTimeline submittedByFirstname(String submittedByFirstname) {
    
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

   /**
   * Get submittedByFirstname
   * @return submittedByFirstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }


  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }


  public GetLoansLoanIdTimeline submittedByLastname(String submittedByLastname) {
    
    this.submittedByLastname = submittedByLastname;
    return this;
  }

   /**
   * Get submittedByLastname
   * @return submittedByLastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getSubmittedByLastname() {
    return submittedByLastname;
  }


  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }


  public GetLoansLoanIdTimeline approvedOnDate(Date approvedOnDate) {
    
    this.approvedOnDate = approvedOnDate;
    return this;
  }

   /**
   * Get approvedOnDate
   * @return approvedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getApprovedOnDate() {
    return approvedOnDate;
  }


  public void setApprovedOnDate(Date approvedOnDate) {
    this.approvedOnDate = approvedOnDate;
  }


  public GetLoansLoanIdTimeline approvedByUsername(String approvedByUsername) {
    
    this.approvedByUsername = approvedByUsername;
    return this;
  }

   /**
   * Get approvedByUsername
   * @return approvedByUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin", value = "")

  public String getApprovedByUsername() {
    return approvedByUsername;
  }


  public void setApprovedByUsername(String approvedByUsername) {
    this.approvedByUsername = approvedByUsername;
  }


  public GetLoansLoanIdTimeline approvedByFirstname(String approvedByFirstname) {
    
    this.approvedByFirstname = approvedByFirstname;
    return this;
  }

   /**
   * Get approvedByFirstname
   * @return approvedByFirstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getApprovedByFirstname() {
    return approvedByFirstname;
  }


  public void setApprovedByFirstname(String approvedByFirstname) {
    this.approvedByFirstname = approvedByFirstname;
  }


  public GetLoansLoanIdTimeline approvedByLastname(String approvedByLastname) {
    
    this.approvedByLastname = approvedByLastname;
    return this;
  }

   /**
   * Get approvedByLastname
   * @return approvedByLastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getApprovedByLastname() {
    return approvedByLastname;
  }


  public void setApprovedByLastname(String approvedByLastname) {
    this.approvedByLastname = approvedByLastname;
  }


  public GetLoansLoanIdTimeline expectedDisbursementDate(Date expectedDisbursementDate) {
    
    this.expectedDisbursementDate = expectedDisbursementDate;
    return this;
  }

   /**
   * Get expectedDisbursementDate
   * @return expectedDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getExpectedDisbursementDate() {
    return expectedDisbursementDate;
  }


  public void setExpectedDisbursementDate(Date expectedDisbursementDate) {
    this.expectedDisbursementDate = expectedDisbursementDate;
  }


  public GetLoansLoanIdTimeline actualDisbursementDate(Date actualDisbursementDate) {
    
    this.actualDisbursementDate = actualDisbursementDate;
    return this;
  }

   /**
   * Get actualDisbursementDate
   * @return actualDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getActualDisbursementDate() {
    return actualDisbursementDate;
  }


  public void setActualDisbursementDate(Date actualDisbursementDate) {
    this.actualDisbursementDate = actualDisbursementDate;
  }


  public GetLoansLoanIdTimeline disbursedByUsername(String disbursedByUsername) {
    
    this.disbursedByUsername = disbursedByUsername;
    return this;
  }

   /**
   * Get disbursedByUsername
   * @return disbursedByUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin", value = "")

  public String getDisbursedByUsername() {
    return disbursedByUsername;
  }


  public void setDisbursedByUsername(String disbursedByUsername) {
    this.disbursedByUsername = disbursedByUsername;
  }


  public GetLoansLoanIdTimeline disbursedByFirstname(String disbursedByFirstname) {
    
    this.disbursedByFirstname = disbursedByFirstname;
    return this;
  }

   /**
   * Get disbursedByFirstname
   * @return disbursedByFirstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getDisbursedByFirstname() {
    return disbursedByFirstname;
  }


  public void setDisbursedByFirstname(String disbursedByFirstname) {
    this.disbursedByFirstname = disbursedByFirstname;
  }


  public GetLoansLoanIdTimeline disbursedByLastname(String disbursedByLastname) {
    
    this.disbursedByLastname = disbursedByLastname;
    return this;
  }

   /**
   * Get disbursedByLastname
   * @return disbursedByLastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getDisbursedByLastname() {
    return disbursedByLastname;
  }


  public void setDisbursedByLastname(String disbursedByLastname) {
    this.disbursedByLastname = disbursedByLastname;
  }


  public GetLoansLoanIdTimeline expectedMaturityDate(Date expectedMaturityDate) {
    
    this.expectedMaturityDate = expectedMaturityDate;
    return this;
  }

   /**
   * Get expectedMaturityDate
   * @return expectedMaturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getExpectedMaturityDate() {
    return expectedMaturityDate;
  }


  public void setExpectedMaturityDate(Date expectedMaturityDate) {
    this.expectedMaturityDate = expectedMaturityDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdTimeline getLoansLoanIdTimeline = (GetLoansLoanIdTimeline) o;
    return Objects.equals(this.submittedOnDate, getLoansLoanIdTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getLoansLoanIdTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getLoansLoanIdTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getLoansLoanIdTimeline.submittedByLastname) &&
        Objects.equals(this.approvedOnDate, getLoansLoanIdTimeline.approvedOnDate) &&
        Objects.equals(this.approvedByUsername, getLoansLoanIdTimeline.approvedByUsername) &&
        Objects.equals(this.approvedByFirstname, getLoansLoanIdTimeline.approvedByFirstname) &&
        Objects.equals(this.approvedByLastname, getLoansLoanIdTimeline.approvedByLastname) &&
        Objects.equals(this.expectedDisbursementDate, getLoansLoanIdTimeline.expectedDisbursementDate) &&
        Objects.equals(this.actualDisbursementDate, getLoansLoanIdTimeline.actualDisbursementDate) &&
        Objects.equals(this.disbursedByUsername, getLoansLoanIdTimeline.disbursedByUsername) &&
        Objects.equals(this.disbursedByFirstname, getLoansLoanIdTimeline.disbursedByFirstname) &&
        Objects.equals(this.disbursedByLastname, getLoansLoanIdTimeline.disbursedByLastname) &&
        Objects.equals(this.expectedMaturityDate, getLoansLoanIdTimeline.expectedMaturityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, approvedOnDate, approvedByUsername, approvedByFirstname, approvedByLastname, expectedDisbursementDate, actualDisbursementDate, disbursedByUsername, disbursedByFirstname, disbursedByLastname, expectedMaturityDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdTimeline {\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    approvedOnDate: ").append(toIndentedString(approvedOnDate)).append("\n");
    sb.append("    approvedByUsername: ").append(toIndentedString(approvedByUsername)).append("\n");
    sb.append("    approvedByFirstname: ").append(toIndentedString(approvedByFirstname)).append("\n");
    sb.append("    approvedByLastname: ").append(toIndentedString(approvedByLastname)).append("\n");
    sb.append("    expectedDisbursementDate: ").append(toIndentedString(expectedDisbursementDate)).append("\n");
    sb.append("    actualDisbursementDate: ").append(toIndentedString(actualDisbursementDate)).append("\n");
    sb.append("    disbursedByUsername: ").append(toIndentedString(disbursedByUsername)).append("\n");
    sb.append("    disbursedByFirstname: ").append(toIndentedString(disbursedByFirstname)).append("\n");
    sb.append("    disbursedByLastname: ").append(toIndentedString(disbursedByLastname)).append("\n");
    sb.append("    expectedMaturityDate: ").append(toIndentedString(expectedMaturityDate)).append("\n");
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
