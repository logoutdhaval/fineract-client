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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.client.models.IdDocument;
import org.apache.fineract.client.models.PostalAddress;
import org.apache.fineract.client.models.SubjectName;

/**
 * InteropKycResponseData
 */

public class InteropKycResponseData {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Long clientId;

  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Long loanId;

  public static final String SERIALIZED_NAME_SAVINGS_ID = "savingsId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ID)
  private Long savingsId;

  public static final String SERIALIZED_NAME_SUB_RESOURCE_ID = "subResourceId";
  @SerializedName(SERIALIZED_NAME_SUB_RESOURCE_ID)
  private Long subResourceId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Map<String, Object> changes = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId;

  public static final String SERIALIZED_NAME_GSIM_ID = "gsimId";
  @SerializedName(SERIALIZED_NAME_GSIM_ID)
  private Long gsimId;

  public static final String SERIALIZED_NAME_GLIM_ID = "glimId";
  @SerializedName(SERIALIZED_NAME_GLIM_ID)
  private Long glimId;

  public static final String SERIALIZED_NAME_ROLLBACK_TRANSACTION = "rollbackTransaction";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TRANSACTION)
  private Boolean rollbackTransaction;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contactPhone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_ID_DOCUMENT = "idDocument";
  @SerializedName(SERIALIZED_NAME_ID_DOCUMENT)
  private List<IdDocument> idDocument = null;

  public static final String SERIALIZED_NAME_POSTAL_ADDRESS = "postalAddress";
  @SerializedName(SERIALIZED_NAME_POSTAL_ADDRESS)
  private PostalAddress postalAddress;

  public static final String SERIALIZED_NAME_SUBJECT_NAME = "subjectName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_NAME)
  private SubjectName subjectName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_BIRTH_COUNTRY = "birthCountry";
  @SerializedName(SERIALIZED_NAME_BIRTH_COUNTRY)
  private String birthCountry;

  public static final String SERIALIZED_NAME_CREDIT_REPORT = "creditReport";
  @SerializedName(SERIALIZED_NAME_CREDIT_REPORT)
  private Object creditReport;


  public InteropKycResponseData officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public InteropKycResponseData groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public InteropKycResponseData clientId(Long clientId) {
    
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


  public InteropKycResponseData loanId(Long loanId) {
    
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


  public InteropKycResponseData savingsId(Long savingsId) {
    
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSavingsId() {
    return savingsId;
  }


  public void setSavingsId(Long savingsId) {
    this.savingsId = savingsId;
  }


  public InteropKycResponseData subResourceId(Long subResourceId) {
    
    this.subResourceId = subResourceId;
    return this;
  }

   /**
   * Get subResourceId
   * @return subResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubResourceId() {
    return subResourceId;
  }


  public void setSubResourceId(Long subResourceId) {
    this.subResourceId = subResourceId;
  }


  public InteropKycResponseData transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public InteropKycResponseData changes(Map<String, Object> changes) {
    
    this.changes = changes;
    return this;
  }

  public InteropKycResponseData putChangesItem(String key, Object changesItem) {
    if (this.changes == null) {
      this.changes = new HashMap<>();
    }
    this.changes.put(key, changesItem);
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getChanges() {
    return changes;
  }


  public void setChanges(Map<String, Object> changes) {
    this.changes = changes;
  }


  public InteropKycResponseData productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public InteropKycResponseData gsimId(Long gsimId) {
    
    this.gsimId = gsimId;
    return this;
  }

   /**
   * Get gsimId
   * @return gsimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGsimId() {
    return gsimId;
  }


  public void setGsimId(Long gsimId) {
    this.gsimId = gsimId;
  }


  public InteropKycResponseData glimId(Long glimId) {
    
    this.glimId = glimId;
    return this;
  }

   /**
   * Get glimId
   * @return glimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlimId() {
    return glimId;
  }


  public void setGlimId(Long glimId) {
    this.glimId = glimId;
  }


  public InteropKycResponseData rollbackTransaction(Boolean rollbackTransaction) {
    
    this.rollbackTransaction = rollbackTransaction;
    return this;
  }

   /**
   * Get rollbackTransaction
   * @return rollbackTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRollbackTransaction() {
    return rollbackTransaction;
  }


  public void setRollbackTransaction(Boolean rollbackTransaction) {
    this.rollbackTransaction = rollbackTransaction;
  }


  public InteropKycResponseData nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public InteropKycResponseData dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public InteropKycResponseData contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * Get contactPhone
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public InteropKycResponseData gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public InteropKycResponseData idDocument(List<IdDocument> idDocument) {
    
    this.idDocument = idDocument;
    return this;
  }

  public InteropKycResponseData addIdDocumentItem(IdDocument idDocumentItem) {
    if (this.idDocument == null) {
      this.idDocument = new ArrayList<>();
    }
    this.idDocument.add(idDocumentItem);
    return this;
  }

   /**
   * Get idDocument
   * @return idDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IdDocument> getIdDocument() {
    return idDocument;
  }


  public void setIdDocument(List<IdDocument> idDocument) {
    this.idDocument = idDocument;
  }


  public InteropKycResponseData postalAddress(PostalAddress postalAddress) {
    
    this.postalAddress = postalAddress;
    return this;
  }

   /**
   * Get postalAddress
   * @return postalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostalAddress getPostalAddress() {
    return postalAddress;
  }


  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }


  public InteropKycResponseData subjectName(SubjectName subjectName) {
    
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubjectName getSubjectName() {
    return subjectName;
  }


  public void setSubjectName(SubjectName subjectName) {
    this.subjectName = subjectName;
  }


  public InteropKycResponseData emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public InteropKycResponseData birthCountry(String birthCountry) {
    
    this.birthCountry = birthCountry;
    return this;
  }

   /**
   * Get birthCountry
   * @return birthCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBirthCountry() {
    return birthCountry;
  }


  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }


  public InteropKycResponseData creditReport(Object creditReport) {
    
    this.creditReport = creditReport;
    return this;
  }

   /**
   * Get creditReport
   * @return creditReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCreditReport() {
    return creditReport;
  }


  public void setCreditReport(Object creditReport) {
    this.creditReport = creditReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropKycResponseData interopKycResponseData = (InteropKycResponseData) o;
    return Objects.equals(this.officeId, interopKycResponseData.officeId) &&
        Objects.equals(this.groupId, interopKycResponseData.groupId) &&
        Objects.equals(this.clientId, interopKycResponseData.clientId) &&
        Objects.equals(this.loanId, interopKycResponseData.loanId) &&
        Objects.equals(this.savingsId, interopKycResponseData.savingsId) &&
        Objects.equals(this.subResourceId, interopKycResponseData.subResourceId) &&
        Objects.equals(this.transactionId, interopKycResponseData.transactionId) &&
        Objects.equals(this.changes, interopKycResponseData.changes) &&
        Objects.equals(this.productId, interopKycResponseData.productId) &&
        Objects.equals(this.gsimId, interopKycResponseData.gsimId) &&
        Objects.equals(this.glimId, interopKycResponseData.glimId) &&
        Objects.equals(this.rollbackTransaction, interopKycResponseData.rollbackTransaction) &&
        Objects.equals(this.nationality, interopKycResponseData.nationality) &&
        Objects.equals(this.dateOfBirth, interopKycResponseData.dateOfBirth) &&
        Objects.equals(this.contactPhone, interopKycResponseData.contactPhone) &&
        Objects.equals(this.gender, interopKycResponseData.gender) &&
        Objects.equals(this.idDocument, interopKycResponseData.idDocument) &&
        Objects.equals(this.postalAddress, interopKycResponseData.postalAddress) &&
        Objects.equals(this.subjectName, interopKycResponseData.subjectName) &&
        Objects.equals(this.emailAddress, interopKycResponseData.emailAddress) &&
        Objects.equals(this.birthCountry, interopKycResponseData.birthCountry) &&
        Objects.equals(this.creditReport, interopKycResponseData.creditReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, gsimId, glimId, rollbackTransaction, nationality, dateOfBirth, contactPhone, gender, idDocument, postalAddress, subjectName, emailAddress, birthCountry, creditReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropKycResponseData {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    gsimId: ").append(toIndentedString(gsimId)).append("\n");
    sb.append("    glimId: ").append(toIndentedString(glimId)).append("\n");
    sb.append("    rollbackTransaction: ").append(toIndentedString(rollbackTransaction)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    idDocument: ").append(toIndentedString(idDocument)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    creditReport: ").append(toIndentedString(creditReport)).append("\n");
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

