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
import java.util.List;
import org.apache.fineract.client.models.LoanProductData;
import org.apache.fineract.client.models.SavingsProductData;

/**
 * GetEntityDatatableChecksTemplateResponse
 */
@ApiModel(description = "GetEntityDatatableChecksTemplateResponse")

public class GetEntityDatatableChecksTemplateResponse {
  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<String> entities = null;

  public static final String SERIALIZED_NAME_STATUS_CLIENT = "statusClient";
  @SerializedName(SERIALIZED_NAME_STATUS_CLIENT)
  private List<Object> statusClient = null;

  public static final String SERIALIZED_NAME_STATUS_GROUP = "statusGroup";
  @SerializedName(SERIALIZED_NAME_STATUS_GROUP)
  private List<Object> statusGroup = null;

  public static final String SERIALIZED_NAME_STATUS_SAVINGS = "statusSavings";
  @SerializedName(SERIALIZED_NAME_STATUS_SAVINGS)
  private List<Object> statusSavings = null;

  public static final String SERIALIZED_NAME_STATUS_LOANS = "statusLoans";
  @SerializedName(SERIALIZED_NAME_STATUS_LOANS)
  private List<Object> statusLoans = null;

  public static final String SERIALIZED_NAME_DATATABLES = "datatables";
  @SerializedName(SERIALIZED_NAME_DATATABLES)
  private List<Object> datatables = null;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT_DATAS = "loanProductDatas";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT_DATAS)
  private List<LoanProductData> loanProductDatas = null;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_DATAS = "savingsProductDatas";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_DATAS)
  private List<SavingsProductData> savingsProductDatas = null;


  public GetEntityDatatableChecksTemplateResponse entities(List<String> entities) {
    
    this.entities = entities;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addEntitiesItem(String entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEntities() {
    return entities;
  }


  public void setEntities(List<String> entities) {
    this.entities = entities;
  }


  public GetEntityDatatableChecksTemplateResponse statusClient(List<Object> statusClient) {
    
    this.statusClient = statusClient;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addStatusClientItem(Object statusClientItem) {
    if (this.statusClient == null) {
      this.statusClient = new ArrayList<>();
    }
    this.statusClient.add(statusClientItem);
    return this;
  }

   /**
   * Get statusClient
   * @return statusClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getStatusClient() {
    return statusClient;
  }


  public void setStatusClient(List<Object> statusClient) {
    this.statusClient = statusClient;
  }


  public GetEntityDatatableChecksTemplateResponse statusGroup(List<Object> statusGroup) {
    
    this.statusGroup = statusGroup;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addStatusGroupItem(Object statusGroupItem) {
    if (this.statusGroup == null) {
      this.statusGroup = new ArrayList<>();
    }
    this.statusGroup.add(statusGroupItem);
    return this;
  }

   /**
   * Get statusGroup
   * @return statusGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getStatusGroup() {
    return statusGroup;
  }


  public void setStatusGroup(List<Object> statusGroup) {
    this.statusGroup = statusGroup;
  }


  public GetEntityDatatableChecksTemplateResponse statusSavings(List<Object> statusSavings) {
    
    this.statusSavings = statusSavings;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addStatusSavingsItem(Object statusSavingsItem) {
    if (this.statusSavings == null) {
      this.statusSavings = new ArrayList<>();
    }
    this.statusSavings.add(statusSavingsItem);
    return this;
  }

   /**
   * Get statusSavings
   * @return statusSavings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getStatusSavings() {
    return statusSavings;
  }


  public void setStatusSavings(List<Object> statusSavings) {
    this.statusSavings = statusSavings;
  }


  public GetEntityDatatableChecksTemplateResponse statusLoans(List<Object> statusLoans) {
    
    this.statusLoans = statusLoans;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addStatusLoansItem(Object statusLoansItem) {
    if (this.statusLoans == null) {
      this.statusLoans = new ArrayList<>();
    }
    this.statusLoans.add(statusLoansItem);
    return this;
  }

   /**
   * Get statusLoans
   * @return statusLoans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getStatusLoans() {
    return statusLoans;
  }


  public void setStatusLoans(List<Object> statusLoans) {
    this.statusLoans = statusLoans;
  }


  public GetEntityDatatableChecksTemplateResponse datatables(List<Object> datatables) {
    
    this.datatables = datatables;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addDatatablesItem(Object datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new ArrayList<>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

   /**
   * Get datatables
   * @return datatables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getDatatables() {
    return datatables;
  }


  public void setDatatables(List<Object> datatables) {
    this.datatables = datatables;
  }


  public GetEntityDatatableChecksTemplateResponse loanProductDatas(List<LoanProductData> loanProductDatas) {
    
    this.loanProductDatas = loanProductDatas;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addLoanProductDatasItem(LoanProductData loanProductDatasItem) {
    if (this.loanProductDatas == null) {
      this.loanProductDatas = new ArrayList<>();
    }
    this.loanProductDatas.add(loanProductDatasItem);
    return this;
  }

   /**
   * Get loanProductDatas
   * @return loanProductDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LoanProductData> getLoanProductDatas() {
    return loanProductDatas;
  }


  public void setLoanProductDatas(List<LoanProductData> loanProductDatas) {
    this.loanProductDatas = loanProductDatas;
  }


  public GetEntityDatatableChecksTemplateResponse savingsProductDatas(List<SavingsProductData> savingsProductDatas) {
    
    this.savingsProductDatas = savingsProductDatas;
    return this;
  }

  public GetEntityDatatableChecksTemplateResponse addSavingsProductDatasItem(SavingsProductData savingsProductDatasItem) {
    if (this.savingsProductDatas == null) {
      this.savingsProductDatas = new ArrayList<>();
    }
    this.savingsProductDatas.add(savingsProductDatasItem);
    return this;
  }

   /**
   * Get savingsProductDatas
   * @return savingsProductDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SavingsProductData> getSavingsProductDatas() {
    return savingsProductDatas;
  }


  public void setSavingsProductDatas(List<SavingsProductData> savingsProductDatas) {
    this.savingsProductDatas = savingsProductDatas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEntityDatatableChecksTemplateResponse getEntityDatatableChecksTemplateResponse = (GetEntityDatatableChecksTemplateResponse) o;
    return Objects.equals(this.entities, getEntityDatatableChecksTemplateResponse.entities) &&
        Objects.equals(this.statusClient, getEntityDatatableChecksTemplateResponse.statusClient) &&
        Objects.equals(this.statusGroup, getEntityDatatableChecksTemplateResponse.statusGroup) &&
        Objects.equals(this.statusSavings, getEntityDatatableChecksTemplateResponse.statusSavings) &&
        Objects.equals(this.statusLoans, getEntityDatatableChecksTemplateResponse.statusLoans) &&
        Objects.equals(this.datatables, getEntityDatatableChecksTemplateResponse.datatables) &&
        Objects.equals(this.loanProductDatas, getEntityDatatableChecksTemplateResponse.loanProductDatas) &&
        Objects.equals(this.savingsProductDatas, getEntityDatatableChecksTemplateResponse.savingsProductDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, statusClient, statusGroup, statusSavings, statusLoans, datatables, loanProductDatas, savingsProductDatas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEntityDatatableChecksTemplateResponse {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    statusClient: ").append(toIndentedString(statusClient)).append("\n");
    sb.append("    statusGroup: ").append(toIndentedString(statusGroup)).append("\n");
    sb.append("    statusSavings: ").append(toIndentedString(statusSavings)).append("\n");
    sb.append("    statusLoans: ").append(toIndentedString(statusLoans)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
    sb.append("    loanProductDatas: ").append(toIndentedString(loanProductDatas)).append("\n");
    sb.append("    savingsProductDatas: ").append(toIndentedString(savingsProductDatas)).append("\n");
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

