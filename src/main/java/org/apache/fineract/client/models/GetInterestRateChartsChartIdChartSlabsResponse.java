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
import org.apache.fineract.client.models.GetInterestRateChartsChartIdChartSlabsIncentives;
import org.apache.fineract.client.models.GetInterestRateChartsCurrency;
import org.apache.fineract.client.models.GetInterestRateChartsTemplatePeriodTypes;

/**
 * GetInterestRateChartsChartIdChartSlabsResponse
 */
@ApiModel(description = "GetInterestRateChartsChartIdChartSlabsResponse")

public class GetInterestRateChartsChartIdChartSlabsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PERIOD_TYPES = "periodTypes";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPES)
  private GetInterestRateChartsTemplatePeriodTypes periodTypes;

  public static final String SERIALIZED_NAME_FROM_PERIOD = "fromPeriod";
  @SerializedName(SERIALIZED_NAME_FROM_PERIOD)
  private Integer fromPeriod;

  public static final String SERIALIZED_NAME_TO_PERIOD = "toPeriod";
  @SerializedName(SERIALIZED_NAME_TO_PERIOD)
  private Integer toPeriod;

  public static final String SERIALIZED_NAME_ANNUAL_INTEREST_RATE = "annualInterestRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INTEREST_RATE)
  private Double annualInterestRate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetInterestRateChartsCurrency currency;

  public static final String SERIALIZED_NAME_INCENTIVES = "incentives";
  @SerializedName(SERIALIZED_NAME_INCENTIVES)
  private List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives = null;


  public GetInterestRateChartsChartIdChartSlabsResponse id(Integer id) {
    
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


  public GetInterestRateChartsChartIdChartSlabsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5% interest from 1 day till 180 days of deposit", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse periodTypes(GetInterestRateChartsTemplatePeriodTypes periodTypes) {
    
    this.periodTypes = periodTypes;
    return this;
  }

   /**
   * Get periodTypes
   * @return periodTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetInterestRateChartsTemplatePeriodTypes getPeriodTypes() {
    return periodTypes;
  }


  public void setPeriodTypes(GetInterestRateChartsTemplatePeriodTypes periodTypes) {
    this.periodTypes = periodTypes;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse fromPeriod(Integer fromPeriod) {
    
    this.fromPeriod = fromPeriod;
    return this;
  }

   /**
   * Get fromPeriod
   * @return fromPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFromPeriod() {
    return fromPeriod;
  }


  public void setFromPeriod(Integer fromPeriod) {
    this.fromPeriod = fromPeriod;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse toPeriod(Integer toPeriod) {
    
    this.toPeriod = toPeriod;
    return this;
  }

   /**
   * Get toPeriod
   * @return toPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "180", value = "")

  public Integer getToPeriod() {
    return toPeriod;
  }


  public void setToPeriod(Integer toPeriod) {
    this.toPeriod = toPeriod;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse annualInterestRate(Double annualInterestRate) {
    
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getAnnualInterestRate() {
    return annualInterestRate;
  }


  public void setAnnualInterestRate(Double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse currency(GetInterestRateChartsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetInterestRateChartsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetInterestRateChartsCurrency currency) {
    this.currency = currency;
  }


  public GetInterestRateChartsChartIdChartSlabsResponse incentives(List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    
    this.incentives = incentives;
    return this;
  }

  public GetInterestRateChartsChartIdChartSlabsResponse addIncentivesItem(GetInterestRateChartsChartIdChartSlabsIncentives incentivesItem) {
    if (this.incentives == null) {
      this.incentives = new ArrayList<>();
    }
    this.incentives.add(incentivesItem);
    return this;
  }

   /**
   * Get incentives
   * @return incentives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetInterestRateChartsChartIdChartSlabsIncentives> getIncentives() {
    return incentives;
  }


  public void setIncentives(List<GetInterestRateChartsChartIdChartSlabsIncentives> incentives) {
    this.incentives = incentives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInterestRateChartsChartIdChartSlabsResponse getInterestRateChartsChartIdChartSlabsResponse = (GetInterestRateChartsChartIdChartSlabsResponse) o;
    return Objects.equals(this.id, getInterestRateChartsChartIdChartSlabsResponse.id) &&
        Objects.equals(this.description, getInterestRateChartsChartIdChartSlabsResponse.description) &&
        Objects.equals(this.periodTypes, getInterestRateChartsChartIdChartSlabsResponse.periodTypes) &&
        Objects.equals(this.fromPeriod, getInterestRateChartsChartIdChartSlabsResponse.fromPeriod) &&
        Objects.equals(this.toPeriod, getInterestRateChartsChartIdChartSlabsResponse.toPeriod) &&
        Objects.equals(this.annualInterestRate, getInterestRateChartsChartIdChartSlabsResponse.annualInterestRate) &&
        Objects.equals(this.currency, getInterestRateChartsChartIdChartSlabsResponse.currency) &&
        Objects.equals(this.incentives, getInterestRateChartsChartIdChartSlabsResponse.incentives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, periodTypes, fromPeriod, toPeriod, annualInterestRate, currency, incentives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInterestRateChartsChartIdChartSlabsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    periodTypes: ").append(toIndentedString(periodTypes)).append("\n");
    sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
    sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    incentives: ").append(toIndentedString(incentives)).append("\n");
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

