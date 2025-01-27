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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DownloadTasksDefinitionV3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class DownloadTasksDefinitionV3 {
  @SerializedName("taskIdList")
  private List<UUID> taskIdList = new ArrayList<UUID>();

  /**
   * The donwload type, use OR logic to choose multiple types. For example (PlainText | SSML | Audio) &#x3D; 7
   */
  @JsonAdapter(DownloadTypeEnum.Adapter.class)
  public enum DownloadTypeEnum {
    NONE("None"),
    
    PLAINTEXT("PlainText"),
    
    SSML("SSML"),
    
    AUDIO("Audio");

    private String value;

    DownloadTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DownloadTypeEnum fromValue(String text) {
      for (DownloadTypeEnum b : DownloadTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DownloadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DownloadTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DownloadTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DownloadTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("downloadType")
  private DownloadTypeEnum downloadType = null;

  /**
   * The audio format type, only used when DownloadType contains Audio
   */
  @JsonAdapter(AudioFormatEnum.Adapter.class)
  public enum AudioFormatEnum {
    NONE("None"),
    
    WAVWITH16K("WavWith16K"),
    
    WAVWITH24K("WavWith24K"),
    
    MP3WITH16K("MP3With16K"),
    
    MP3WITH24K("MP3With24K");

    private String value;

    AudioFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudioFormatEnum fromValue(String text) {
      for (AudioFormatEnum b : AudioFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AudioFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudioFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudioFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AudioFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("audioFormat")
  private AudioFormatEnum audioFormat = null;

  public DownloadTasksDefinitionV3 taskIdList(List<UUID> taskIdList) {
    this.taskIdList = taskIdList;
    return this;
  }

  public DownloadTasksDefinitionV3 addTaskIdListItem(UUID taskIdListItem) {
    this.taskIdList.add(taskIdListItem);
    return this;
  }

   /**
   * The task id list that you want to download
   * @return taskIdList
  **/
  @ApiModelProperty(required = true, value = "The task id list that you want to download")
  public List<UUID> getTaskIdList() {
    return taskIdList;
  }

  public void setTaskIdList(List<UUID> taskIdList) {
    this.taskIdList = taskIdList;
  }

  public DownloadTasksDefinitionV3 downloadType(DownloadTypeEnum downloadType) {
    this.downloadType = downloadType;
    return this;
  }

   /**
   * The donwload type, use OR logic to choose multiple types. For example (PlainText | SSML | Audio) &#x3D; 7
   * @return downloadType
  **/
  @ApiModelProperty(required = true, value = "The donwload type, use OR logic to choose multiple types. For example (PlainText | SSML | Audio) = 7")
  public DownloadTypeEnum getDownloadType() {
    return downloadType;
  }

  public void setDownloadType(DownloadTypeEnum downloadType) {
    this.downloadType = downloadType;
  }

  public DownloadTasksDefinitionV3 audioFormat(AudioFormatEnum audioFormat) {
    this.audioFormat = audioFormat;
    return this;
  }

   /**
   * The audio format type, only used when DownloadType contains Audio
   * @return audioFormat
  **/
  @ApiModelProperty(value = "The audio format type, only used when DownloadType contains Audio")
  public AudioFormatEnum getAudioFormat() {
    return audioFormat;
  }

  public void setAudioFormat(AudioFormatEnum audioFormat) {
    this.audioFormat = audioFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadTasksDefinitionV3 downloadTasksDefinitionV3 = (DownloadTasksDefinitionV3) o;
    return Objects.equals(this.taskIdList, downloadTasksDefinitionV3.taskIdList) &&
        Objects.equals(this.downloadType, downloadTasksDefinitionV3.downloadType) &&
        Objects.equals(this.audioFormat, downloadTasksDefinitionV3.audioFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIdList, downloadType, audioFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadTasksDefinitionV3 {\n");
    
    sb.append("    taskIdList: ").append(toIndentedString(taskIdList)).append("\n");
    sb.append("    downloadType: ").append(toIndentedString(downloadType)).append("\n");
    sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
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

