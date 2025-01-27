/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * ModelCopyDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class ModelCopyDefinition {
  @SerializedName("targetSubscriptionKey")
  private String targetSubscriptionKey = null;

  public ModelCopyDefinition targetSubscriptionKey(String targetSubscriptionKey) {
    this.targetSubscriptionKey = targetSubscriptionKey;
    return this;
  }

   /**
   * The subscription key of the subscription that is target of the copy operation
   * @return targetSubscriptionKey
  **/
  @ApiModelProperty(required = true, value = "The subscription key of the subscription that is target of the copy operation")
  public String getTargetSubscriptionKey() {
    return targetSubscriptionKey;
  }

  public void setTargetSubscriptionKey(String targetSubscriptionKey) {
    this.targetSubscriptionKey = targetSubscriptionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCopyDefinition modelCopyDefinition = (ModelCopyDefinition) o;
    return Objects.equals(this.targetSubscriptionKey, modelCopyDefinition.targetSubscriptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetSubscriptionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCopyDefinition {\n");
    
    sb.append("    targetSubscriptionKey: ").append(toIndentedString(targetSubscriptionKey)).append("\n");
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

