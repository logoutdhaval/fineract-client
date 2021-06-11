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
import java.math.BigDecimal;
import org.apache.fineract.client.models.FloatingRate;
import org.apache.fineract.client.models.LoanProduct;

/**
 * LoanProductFloatingRates
 */

public class LoanProductFloatingRates {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT = "loanProduct";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT)
  private LoanProduct loanProduct;

  public static final String SERIALIZED_NAME_FLOATING_RATE = "floatingRate";
  @SerializedName(SERIALIZED_NAME_FLOATING_RATE)
  private FloatingRate floatingRate;

  public static final String SERIALIZED_NAME_INTEREST_RATE_DIFFERENTIAL = "interestRateDifferential";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_DIFFERENTIAL)
  private BigDecimal interestRateDifferential;

  public static final String SERIALIZED_NAME_MIN_DIFFERENTIAL_LENDING_RATE = "minDifferentialLendingRate";
  @SerializedName(SERIALIZED_NAME_MIN_DIFFERENTIAL_LENDING_RATE)
  private BigDecimal minDifferentialLendingRate;

  public static final String SERIALIZED_NAME_DEFAULT_DIFFERENTIAL_LENDING_RATE = "defaultDifferentialLendingRate";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DIFFERENTIAL_LENDING_RATE)
  private BigDecimal defaultDifferentialLendingRate;

  public static final String SERIALIZED_NAME_MAX_DIFFERENTIAL_LENDING_RATE = "maxDifferentialLendingRate";
  @SerializedName(SERIALIZED_NAME_MAX_DIFFERENTIAL_LENDING_RATE)
  private BigDecimal maxDifferentialLendingRate;

  public static final String SERIALIZED_NAME_FLOATING_INTEREST_RATE_CALCULATION_ALLOWED = "floatingInterestRateCalculationAllowed";
  @SerializedName(SERIALIZED_NAME_FLOATING_INTEREST_RATE_CALCULATION_ALLOWED)
  private Boolean floatingInterestRateCalculationAllowed;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public LoanProductFloatingRates id(Long id) {
    
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


  public LoanProductFloatingRates loanProduct(LoanProduct loanProduct) {
    
    this.loanProduct = loanProduct;
    return this;
  }

   /**
   * Get loanProduct
   * @return loanProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoanProduct getLoanProduct() {
    return loanProduct;
  }


  public void setLoanProduct(LoanProduct loanProduct) {
    this.loanProduct = loanProduct;
  }


  public LoanProductFloatingRates floatingRate(FloatingRate floatingRate) {
    
    this.floatingRate = floatingRate;
    return this;
  }

   /**
   * Get floatingRate
   * @return floatingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FloatingRate getFloatingRate() {
    return floatingRate;
  }


  public void setFloatingRate(FloatingRate floatingRate) {
    this.floatingRate = floatingRate;
  }


  public LoanProductFloatingRates interestRateDifferential(BigDecimal interestRateDifferential) {
    
    this.interestRateDifferential = interestRateDifferential;
    return this;
  }

   /**
   * Get interestRateDifferential
   * @return interestRateDifferential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getInterestRateDifferential() {
    return interestRateDifferential;
  }


  public void setInterestRateDifferential(BigDecimal interestRateDifferential) {
    this.interestRateDifferential = interestRateDifferential;
  }


  public LoanProductFloatingRates minDifferentialLendingRate(BigDecimal minDifferentialLendingRate) {
    
    this.minDifferentialLendingRate = minDifferentialLendingRate;
    return this;
  }

   /**
   * Get minDifferentialLendingRate
   * @return minDifferentialLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMinDifferentialLendingRate() {
    return minDifferentialLendingRate;
  }


  public void setMinDifferentialLendingRate(BigDecimal minDifferentialLendingRate) {
    this.minDifferentialLendingRate = minDifferentialLendingRate;
  }


  public LoanProductFloatingRates defaultDifferentialLendingRate(BigDecimal defaultDifferentialLendingRate) {
    
    this.defaultDifferentialLendingRate = defaultDifferentialLendingRate;
    return this;
  }

   /**
   * Get defaultDifferentialLendingRate
   * @return defaultDifferentialLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDefaultDifferentialLendingRate() {
    return defaultDifferentialLendingRate;
  }


  public void setDefaultDifferentialLendingRate(BigDecimal defaultDifferentialLendingRate) {
    this.defaultDifferentialLendingRate = defaultDifferentialLendingRate;
  }


  public LoanProductFloatingRates maxDifferentialLendingRate(BigDecimal maxDifferentialLendingRate) {
    
    this.maxDifferentialLendingRate = maxDifferentialLendingRate;
    return this;
  }

   /**
   * Get maxDifferentialLendingRate
   * @return maxDifferentialLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxDifferentialLendingRate() {
    return maxDifferentialLendingRate;
  }


  public void setMaxDifferentialLendingRate(BigDecimal maxDifferentialLendingRate) {
    this.maxDifferentialLendingRate = maxDifferentialLendingRate;
  }


  public LoanProductFloatingRates floatingInterestRateCalculationAllowed(Boolean floatingInterestRateCalculationAllowed) {
    
    this.floatingInterestRateCalculationAllowed = floatingInterestRateCalculationAllowed;
    return this;
  }

   /**
   * Get floatingInterestRateCalculationAllowed
   * @return floatingInterestRateCalculationAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFloatingInterestRateCalculationAllowed() {
    return floatingInterestRateCalculationAllowed;
  }


  public void setFloatingInterestRateCalculationAllowed(Boolean floatingInterestRateCalculationAllowed) {
    this.floatingInterestRateCalculationAllowed = floatingInterestRateCalculationAllowed;
  }


  public LoanProductFloatingRates _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductFloatingRates loanProductFloatingRates = (LoanProductFloatingRates) o;
    return Objects.equals(this.id, loanProductFloatingRates.id) &&
        Objects.equals(this.loanProduct, loanProductFloatingRates.loanProduct) &&
        Objects.equals(this.floatingRate, loanProductFloatingRates.floatingRate) &&
        Objects.equals(this.interestRateDifferential, loanProductFloatingRates.interestRateDifferential) &&
        Objects.equals(this.minDifferentialLendingRate, loanProductFloatingRates.minDifferentialLendingRate) &&
        Objects.equals(this.defaultDifferentialLendingRate, loanProductFloatingRates.defaultDifferentialLendingRate) &&
        Objects.equals(this.maxDifferentialLendingRate, loanProductFloatingRates.maxDifferentialLendingRate) &&
        Objects.equals(this.floatingInterestRateCalculationAllowed, loanProductFloatingRates.floatingInterestRateCalculationAllowed) &&
        Objects.equals(this._new, loanProductFloatingRates._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, loanProduct, floatingRate, interestRateDifferential, minDifferentialLendingRate, defaultDifferentialLendingRate, maxDifferentialLendingRate, floatingInterestRateCalculationAllowed, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductFloatingRates {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loanProduct: ").append(toIndentedString(loanProduct)).append("\n");
    sb.append("    floatingRate: ").append(toIndentedString(floatingRate)).append("\n");
    sb.append("    interestRateDifferential: ").append(toIndentedString(interestRateDifferential)).append("\n");
    sb.append("    minDifferentialLendingRate: ").append(toIndentedString(minDifferentialLendingRate)).append("\n");
    sb.append("    defaultDifferentialLendingRate: ").append(toIndentedString(defaultDifferentialLendingRate)).append("\n");
    sb.append("    maxDifferentialLendingRate: ").append(toIndentedString(maxDifferentialLendingRate)).append("\n");
    sb.append("    floatingInterestRateCalculationAllowed: ").append(toIndentedString(floatingInterestRateCalculationAllowed)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

