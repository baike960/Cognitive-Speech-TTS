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
 * WebHookConfigurationWithoutSecret
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class WebHookConfigurationWithoutSecret {
  @SerializedName("url")
  private String url = null;

  public WebHookConfigurationWithoutSecret url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The registered URL that will be used to send the POST requests for the registered events to
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The registered URL that will be used to send the POST requests for the registered events to")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookConfigurationWithoutSecret webHookConfigurationWithoutSecret = (WebHookConfigurationWithoutSecret) o;
    return Objects.equals(this.url, webHookConfigurationWithoutSecret.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookConfigurationWithoutSecret {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

