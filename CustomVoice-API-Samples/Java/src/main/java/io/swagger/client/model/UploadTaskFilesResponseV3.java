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
import java.util.UUID;

/**
 * UploadTaskFilesResponseV3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class UploadTaskFilesResponseV3 {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("isSuccessful")
  private Boolean isSuccessful = null;

  @SerializedName("fileId")
  private UUID fileId = null;

  @SerializedName("failedReason")
  private String failedReason = null;

  public UploadTaskFilesResponseV3 fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The failed files name
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "The failed files name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public UploadTaskFilesResponseV3 isSuccessful(Boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
    return this;
  }

   /**
   * A value indicating whether the file is uploaded successfully
   * @return isSuccessful
  **/
  @ApiModelProperty(required = true, value = "A value indicating whether the file is uploaded successfully")
  public Boolean isIsSuccessful() {
    return isSuccessful;
  }

  public void setIsSuccessful(Boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
  }

  public UploadTaskFilesResponseV3 fileId(UUID fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The successfully uploaded file id if IsSuccessful is true
   * @return fileId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The successfully uploaded file id if IsSuccessful is true")
  public UUID getFileId() {
    return fileId;
  }

  public void setFileId(UUID fileId) {
    this.fileId = fileId;
  }

  public UploadTaskFilesResponseV3 failedReason(String failedReason) {
    this.failedReason = failedReason;
    return this;
  }

   /**
   * The failed reason if IsSuccessful is false
   * @return failedReason
  **/
  @ApiModelProperty(value = "The failed reason if IsSuccessful is false")
  public String getFailedReason() {
    return failedReason;
  }

  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadTaskFilesResponseV3 uploadTaskFilesResponseV3 = (UploadTaskFilesResponseV3) o;
    return Objects.equals(this.fileName, uploadTaskFilesResponseV3.fileName) &&
        Objects.equals(this.isSuccessful, uploadTaskFilesResponseV3.isSuccessful) &&
        Objects.equals(this.fileId, uploadTaskFilesResponseV3.fileId) &&
        Objects.equals(this.failedReason, uploadTaskFilesResponseV3.failedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, isSuccessful, fileId, failedReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadTaskFilesResponseV3 {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    isSuccessful: ").append(toIndentedString(isSuccessful)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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

