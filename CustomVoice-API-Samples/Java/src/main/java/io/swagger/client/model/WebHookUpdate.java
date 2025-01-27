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
import io.swagger.client.model.WebHookConfigurationSecret;
import java.io.IOException;

/**
 * WebHookUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class WebHookUpdate {
  @SerializedName("configuration")
  private WebHookConfigurationSecret _configuration = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public WebHookUpdate _configuration(WebHookConfigurationSecret _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * The configuration of the web hook registration.                If the property secret is omitted or contains an empty string in a POST or PATCH request,  no signature hash will be calculated.                When retrieving web hook registration information from the service, the secret is always omitted
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "The configuration of the web hook registration.                If the property secret is omitted or contains an empty string in a POST or PATCH request,  no signature hash will be calculated.                When retrieving web hook registration information from the service, the secret is always omitted")
  public WebHookConfigurationSecret getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(WebHookConfigurationSecret _configuration) {
    this._configuration = _configuration;
  }

  public WebHookUpdate active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * A value indicating whether callbacks to the registered URL are made or not
   * @return active
  **/
  @ApiModelProperty(required = true, value = "A value indicating whether callbacks to the registered URL are made or not")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public WebHookUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebHookUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookUpdate webHookUpdate = (WebHookUpdate) o;
    return Objects.equals(this._configuration, webHookUpdate._configuration) &&
        Objects.equals(this.active, webHookUpdate.active) &&
        Objects.equals(this.name, webHookUpdate.name) &&
        Objects.equals(this.description, webHookUpdate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, active, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookUpdate {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

