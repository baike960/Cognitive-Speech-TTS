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
import io.swagger.client.model.UploadFileDefinitionV3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * UploadTaskFilesDefinitionV3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class UploadTaskFilesDefinitionV3 {
  @SerializedName("isSSML")
  private Boolean isSSML = null;

  @SerializedName("voiceId")
  private UUID voiceId = null;

  @SerializedName("parentFolderId")
  private UUID parentFolderId = null;

  @SerializedName("files")
  private List<UploadFileDefinitionV3> files = new ArrayList<UploadFileDefinitionV3>();

  public UploadTaskFilesDefinitionV3 isSSML(Boolean isSSML) {
    this.isSSML = isSSML;
    return this;
  }

   /**
   * A value indicating whether files are ssml-formatted. True means ssml, false means plain text
   * @return isSSML
  **/
  @ApiModelProperty(required = true, value = "A value indicating whether files are ssml-formatted. True means ssml, false means plain text")
  public Boolean isIsSSML() {
    return isSSML;
  }

  public void setIsSSML(Boolean isSSML) {
    this.isSSML = isSSML;
  }

  public UploadTaskFilesDefinitionV3 voiceId(UUID voiceId) {
    this.voiceId = voiceId;
    return this;
  }

   /**
   * Get voiceId
   * @return voiceId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getVoiceId() {
    return voiceId;
  }

  public void setVoiceId(UUID voiceId) {
    this.voiceId = voiceId;
  }

  public UploadTaskFilesDefinitionV3 parentFolderId(UUID parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * Get parentFolderId
   * @return parentFolderId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(UUID parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public UploadTaskFilesDefinitionV3 files(List<UploadFileDefinitionV3> files) {
    this.files = files;
    return this;
  }

  public UploadTaskFilesDefinitionV3 addFilesItem(UploadFileDefinitionV3 filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(required = true, value = "")
  public List<UploadFileDefinitionV3> getFiles() {
    return files;
  }

  public void setFiles(List<UploadFileDefinitionV3> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadTaskFilesDefinitionV3 uploadTaskFilesDefinitionV3 = (UploadTaskFilesDefinitionV3) o;
    return Objects.equals(this.isSSML, uploadTaskFilesDefinitionV3.isSSML) &&
        Objects.equals(this.voiceId, uploadTaskFilesDefinitionV3.voiceId) &&
        Objects.equals(this.parentFolderId, uploadTaskFilesDefinitionV3.parentFolderId) &&
        Objects.equals(this.files, uploadTaskFilesDefinitionV3.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSSML, voiceId, parentFolderId, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadTaskFilesDefinitionV3 {\n");
    
    sb.append("    isSSML: ").append(toIndentedString(isSSML)).append("\n");
    sb.append("    voiceId: ").append(toIndentedString(voiceId)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

