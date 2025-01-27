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
import io.swagger.client.model.WebHookConfigurationWithoutSecret;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * WebHook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class WebHook {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("configuration")
  private WebHookConfigurationWithoutSecret _configuration = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    NONE("None"),
    
    DATAIMPORTCOMPLETION("DataImportCompletion"),
    
    MODELADAPTATIONCOMPLETION("ModelAdaptationCompletion"),
    
    ACCURACYTESTCOMPLETION("AccuracyTestCompletion"),
    
    TRANSCRIPTIONCOMPLETION("TranscriptionCompletion"),
    
    ENDPOINTDEPLOYMENTCOMPLETION("EndpointDeploymentCompletion"),
    
    ENDPOINTDATACOLLECTIONCOMPLETION("EndpointDataCollectionCompletion"),
    
    PING("Ping");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String text) {
      for (EventsEnum b : EventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("events")
  private List<EventsEnum> events = new ArrayList<EventsEnum>();

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("pingUrl")
  private String pingUrl = null;

  @SerializedName("testUrl")
  private String testUrl = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOTSTARTED("NotStarted"),
    
    RUNNING("Running"),
    
    SUCCEEDED("Succeeded"),
    
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public WebHook id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of this entity
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The identifier of this entity")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WebHook _configuration(WebHookConfigurationWithoutSecret _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * The configuration of the web hook registration.                If the property secret is omitted or contains an empty string in a POST or PATCH request,  no signature hash will be calculated.                When retrieving web hook registration information from the service, the secret is always omitted
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "The configuration of the web hook registration.                If the property secret is omitted or contains an empty string in a POST or PATCH request,  no signature hash will be calculated.                When retrieving web hook registration information from the service, the secret is always omitted")
  public WebHookConfigurationWithoutSecret getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(WebHookConfigurationWithoutSecret _configuration) {
    this._configuration = _configuration;
  }

  public WebHook active(Boolean active) {
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

  public WebHook name(String name) {
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

  public WebHook description(String description) {
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

  public WebHook events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public WebHook addEventsItem(EventsEnum eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * A collection of event types, the web hook is registered for.                Each web hook registration will support an additional even type named ping
   * @return events
  **/
  @ApiModelProperty(required = true, value = "A collection of event types, the web hook is registered for.                Each web hook registration will support an additional even type named ping")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public WebHook properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public WebHook putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity
   * @return properties
  **/
  @ApiModelProperty(value = "The custom properties of this entity")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public WebHook pingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
    return this;
  }

   /**
   * The URL that can be used to trigger the sending of a ping event to the registered URL of a web hook registration
   * @return pingUrl
  **/
  @ApiModelProperty(required = true, value = "The URL that can be used to trigger the sending of a ping event to the registered URL of a web hook registration")
  public String getPingUrl() {
    return pingUrl;
  }

  public void setPingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
  }

  public WebHook testUrl(String testUrl) {
    this.testUrl = testUrl;
    return this;
  }

   /**
   * The URL that can be used sending test events to the registered URL of a web hook registration
   * @return testUrl
  **/
  @ApiModelProperty(required = true, value = "The URL that can be used sending test events to the registered URL of a web hook registration")
  public String getTestUrl() {
    return testUrl;
  }

  public void setTestUrl(String testUrl) {
    this.testUrl = testUrl;
  }

  public WebHook apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The API version the web hook was created in. This defines the shape of the payload in the callbacks.  If the payload type is not supported anymore, because the shape changed and the API version using it is removed (after deprecation),  the web hook will be disabled
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "The API version the web hook was created in. This defines the shape of the payload in the callbacks.  If the payload type is not supported anymore, because the shape changed and the API version using it is removed (after deprecation),  the web hook will be disabled")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public WebHook statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * The failure reason, if the hook is in state \&quot;Failed\&quot;
   * @return statusMessage
  **/
  @ApiModelProperty(value = "The failure reason, if the hook is in state \"Failed\"")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public WebHook createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * The time-stamp when the object was created
   * @return createdDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the object was created")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public WebHook lastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
    return this;
  }

   /**
   * The time-stamp when the current status was entered
   * @return lastActionDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the current status was entered")
  public OffsetDateTime getLastActionDateTime() {
    return lastActionDateTime;
  }

  public void setLastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
  }

  public WebHook status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the object
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the object")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHook webHook = (WebHook) o;
    return Objects.equals(this.id, webHook.id) &&
        Objects.equals(this._configuration, webHook._configuration) &&
        Objects.equals(this.active, webHook.active) &&
        Objects.equals(this.name, webHook.name) &&
        Objects.equals(this.description, webHook.description) &&
        Objects.equals(this.events, webHook.events) &&
        Objects.equals(this.properties, webHook.properties) &&
        Objects.equals(this.pingUrl, webHook.pingUrl) &&
        Objects.equals(this.testUrl, webHook.testUrl) &&
        Objects.equals(this.apiVersion, webHook.apiVersion) &&
        Objects.equals(this.statusMessage, webHook.statusMessage) &&
        Objects.equals(this.createdDateTime, webHook.createdDateTime) &&
        Objects.equals(this.lastActionDateTime, webHook.lastActionDateTime) &&
        Objects.equals(this.status, webHook.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _configuration, active, name, description, events, properties, pingUrl, testUrl, apiVersion, statusMessage, createdDateTime, lastActionDateTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    testUrl: ").append(toIndentedString(testUrl)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

