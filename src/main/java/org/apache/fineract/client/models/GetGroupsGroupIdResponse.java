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
import org.apache.fineract.client.models.GetGroupsGroupIdTimeline;

/**
 * GetGroupsGroupIdResponse
 */
@ApiModel(description = "GetGroupsGroupIdResponse")

public class GetGroupsGroupIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private String hierarchy;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetGroupsGroupIdTimeline timeline;


  public GetGroupsGroupIdResponse id(Integer id) {
    
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


  public GetGroupsGroupIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "First Group", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetGroupsGroupIdResponse externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000-1A", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public GetGroupsGroupIdResponse officeId(Integer officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  public GetGroupsGroupIdResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetGroupsGroupIdResponse hierarchy(String hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = ".1.", value = "")

  public String getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
  }


  public GetGroupsGroupIdResponse timeline(GetGroupsGroupIdTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetGroupsGroupIdTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetGroupsGroupIdTimeline timeline) {
    this.timeline = timeline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdResponse getGroupsGroupIdResponse = (GetGroupsGroupIdResponse) o;
    return Objects.equals(this.id, getGroupsGroupIdResponse.id) &&
        Objects.equals(this.name, getGroupsGroupIdResponse.name) &&
        Objects.equals(this.externalId, getGroupsGroupIdResponse.externalId) &&
        Objects.equals(this.officeId, getGroupsGroupIdResponse.officeId) &&
        Objects.equals(this.officeName, getGroupsGroupIdResponse.officeName) &&
        Objects.equals(this.hierarchy, getGroupsGroupIdResponse.hierarchy) &&
        Objects.equals(this.timeline, getGroupsGroupIdResponse.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, externalId, officeId, officeName, hierarchy, timeline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

