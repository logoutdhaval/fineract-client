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
 * PostGroupsGroupIdCommandUnassignStaffResponse
 */
@ApiModel(description = "PostGroupsGroupIdCommandUnassignStaffResponse")

public class PostGroupsGroupIdCommandUnassignStaffResponse {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Integer resourceId;

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Object changes;


  public PostGroupsGroupIdCommandUnassignStaffResponse officeId(Integer officeId) {
    
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


  public PostGroupsGroupIdCommandUnassignStaffResponse groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getGroupId() {
    return groupId;
  }


  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public PostGroupsGroupIdCommandUnassignStaffResponse resourceId(Integer resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getResourceId() {
    return resourceId;
  }


  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }


  public PostGroupsGroupIdCommandUnassignStaffResponse changes(Object changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getChanges() {
    return changes;
  }


  public void setChanges(Object changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGroupsGroupIdCommandUnassignStaffResponse postGroupsGroupIdCommandUnassignStaffResponse = (PostGroupsGroupIdCommandUnassignStaffResponse) o;
    return Objects.equals(this.officeId, postGroupsGroupIdCommandUnassignStaffResponse.officeId) &&
        Objects.equals(this.groupId, postGroupsGroupIdCommandUnassignStaffResponse.groupId) &&
        Objects.equals(this.resourceId, postGroupsGroupIdCommandUnassignStaffResponse.resourceId) &&
        Objects.equals(this.changes, postGroupsGroupIdCommandUnassignStaffResponse.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, groupId, resourceId, changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupsGroupIdCommandUnassignStaffResponse {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

