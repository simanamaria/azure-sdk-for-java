// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.AlertEntity;
import com.azure.resourcemanager.security.models.AlertPropertiesSupportingEvidence;
import com.azure.resourcemanager.security.models.AlertSeverity;
import com.azure.resourcemanager.security.models.AlertStatus;
import com.azure.resourcemanager.security.models.Intent;
import com.azure.resourcemanager.security.models.ResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** describes security alert properties. */
@Fluent
public final class AlertProperties {
    /*
     * Schema version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Unique identifier for the detection logic (all alert instances from the same detection logic will have the same
     * alertType).
     */
    @JsonProperty(value = "alertType", access = JsonProperty.Access.WRITE_ONLY)
    private String alertType;

    /*
     * Unique identifier for the alert.
     */
    @JsonProperty(value = "systemAlertId", access = JsonProperty.Access.WRITE_ONLY)
    private String systemAlertId;

    /*
     * The name of Azure Security Center pricing tier which powering this alert. Learn more:
     * https://docs.microsoft.com/en-us/azure/security-center/security-center-pricing
     */
    @JsonProperty(value = "productComponentName", access = JsonProperty.Access.WRITE_ONLY)
    private String productComponentName;

    /*
     * The display name of the alert.
     */
    @JsonProperty(value = "alertDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String alertDisplayName;

    /*
     * Description of the suspicious activity that was detected.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The risk level of the threat that was detected. Learn more:
     * https://docs.microsoft.com/en-us/azure/security-center/security-center-alerts-overview#how-are-alerts-classified.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private AlertSeverity severity;

    /*
     * The kill chain related intent behind the alert. For list of supported values, and explanations of Azure Security
     * Center's supported kill chain intents.
     */
    @JsonProperty(value = "intent", access = JsonProperty.Access.WRITE_ONLY)
    private Intent intent;

    /*
     * The UTC time of the first event or activity included in the alert in ISO8601 format.
     */
    @JsonProperty(value = "startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTimeUtc;

    /*
     * The UTC time of the last event or activity included in the alert in ISO8601 format.
     */
    @JsonProperty(value = "endTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTimeUtc;

    /*
     * The resource identifiers that can be used to direct the alert to the right product exposure group (tenant,
     * workspace, subscription etc.). There can be multiple identifiers of different type per alert.
     */
    @JsonProperty(value = "resourceIdentifiers", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceIdentifier> resourceIdentifiers;

    /*
     * Manual action items to take to remediate the alert.
     */
    @JsonProperty(value = "remediationSteps", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> remediationSteps;

    /*
     * The name of the vendor that raises the alert.
     */
    @JsonProperty(value = "vendorName", access = JsonProperty.Access.WRITE_ONLY)
    private String vendorName;

    /*
     * The life cycle status of the alert.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private AlertStatus status;

    /*
     * Links related to the alert
     */
    @JsonProperty(value = "extendedLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<Map<String, String>> extendedLinks;

    /*
     * A direct link to the alert page in Azure Portal.
     */
    @JsonProperty(value = "alertUri", access = JsonProperty.Access.WRITE_ONLY)
    private String alertUri;

    /*
     * The UTC time the alert was generated in ISO8601 format.
     */
    @JsonProperty(value = "timeGeneratedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeGeneratedUtc;

    /*
     * The name of the product which published this alert (Azure Security Center, Azure ATP, Microsoft Defender ATP,
     * O365 ATP, MCAS, and so on).
     */
    @JsonProperty(value = "productName", access = JsonProperty.Access.WRITE_ONLY)
    private String productName;

    /*
     * The UTC processing end time of the alert in ISO8601 format.
     */
    @JsonProperty(value = "processingEndTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime processingEndTimeUtc;

    /*
     * A list of entities related to the alert.
     */
    @JsonProperty(value = "entities", access = JsonProperty.Access.WRITE_ONLY)
    private List<AlertEntity> entities;

    /*
     * This field determines whether the alert is an incident (a compound grouping of several alerts) or a single
     * alert.
     */
    @JsonProperty(value = "isIncident", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isIncident;

    /*
     * Key for corelating related alerts. Alerts with the same correlation key considered to be related.
     */
    @JsonProperty(value = "correlationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationKey;

    /*
     * Custom properties for the alert.
     */
    @JsonProperty(value = "extendedProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> extendedProperties;

    /*
     * The display name of the resource most related to this alert.
     */
    @JsonProperty(value = "compromisedEntity", access = JsonProperty.Access.WRITE_ONLY)
    private String compromisedEntity;

    /*
     * kill chain related techniques behind the alert.
     */
    @JsonProperty(value = "techniques", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> techniques;

    /*
     * Kill chain related sub-techniques behind the alert.
     */
    @JsonProperty(value = "subTechniques", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> subTechniques;

    /*
     * Changing set of properties depending on the supportingEvidence type.
     */
    @JsonProperty(value = "supportingEvidence")
    private AlertPropertiesSupportingEvidence supportingEvidence;

    /**
     * Get the version property: Schema version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the alertType property: Unique identifier for the detection logic (all alert instances from the same
     * detection logic will have the same alertType).
     *
     * @return the alertType value.
     */
    public String alertType() {
        return this.alertType;
    }

    /**
     * Get the systemAlertId property: Unique identifier for the alert.
     *
     * @return the systemAlertId value.
     */
    public String systemAlertId() {
        return this.systemAlertId;
    }

    /**
     * Get the productComponentName property: The name of Azure Security Center pricing tier which powering this alert.
     * Learn more: https://docs.microsoft.com/en-us/azure/security-center/security-center-pricing.
     *
     * @return the productComponentName value.
     */
    public String productComponentName() {
        return this.productComponentName;
    }

    /**
     * Get the alertDisplayName property: The display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.alertDisplayName;
    }

    /**
     * Get the description property: Description of the suspicious activity that was detected.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the severity property: The risk level of the threat that was detected. Learn more:
     * https://docs.microsoft.com/en-us/azure/security-center/security-center-alerts-overview#how-are-alerts-classified.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Get the intent property: The kill chain related intent behind the alert. For list of supported values, and
     * explanations of Azure Security Center's supported kill chain intents.
     *
     * @return the intent value.
     */
    public Intent intent() {
        return this.intent;
    }

    /**
     * Get the startTimeUtc property: The UTC time of the first event or activity included in the alert in ISO8601
     * format.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the endTimeUtc property: The UTC time of the last event or activity included in the alert in ISO8601 format.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Get the resourceIdentifiers property: The resource identifiers that can be used to direct the alert to the right
     * product exposure group (tenant, workspace, subscription etc.). There can be multiple identifiers of different
     * type per alert.
     *
     * @return the resourceIdentifiers value.
     */
    public List<ResourceIdentifier> resourceIdentifiers() {
        return this.resourceIdentifiers;
    }

    /**
     * Get the remediationSteps property: Manual action items to take to remediate the alert.
     *
     * @return the remediationSteps value.
     */
    public List<String> remediationSteps() {
        return this.remediationSteps;
    }

    /**
     * Get the vendorName property: The name of the vendor that raises the alert.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Get the status property: The life cycle status of the alert.
     *
     * @return the status value.
     */
    public AlertStatus status() {
        return this.status;
    }

    /**
     * Get the extendedLinks property: Links related to the alert.
     *
     * @return the extendedLinks value.
     */
    public List<Map<String, String>> extendedLinks() {
        return this.extendedLinks;
    }

    /**
     * Get the alertUri property: A direct link to the alert page in Azure Portal.
     *
     * @return the alertUri value.
     */
    public String alertUri() {
        return this.alertUri;
    }

    /**
     * Get the timeGeneratedUtc property: The UTC time the alert was generated in ISO8601 format.
     *
     * @return the timeGeneratedUtc value.
     */
    public OffsetDateTime timeGeneratedUtc() {
        return this.timeGeneratedUtc;
    }

    /**
     * Get the productName property: The name of the product which published this alert (Azure Security Center, Azure
     * ATP, Microsoft Defender ATP, O365 ATP, MCAS, and so on).
     *
     * @return the productName value.
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Get the processingEndTimeUtc property: The UTC processing end time of the alert in ISO8601 format.
     *
     * @return the processingEndTimeUtc value.
     */
    public OffsetDateTime processingEndTimeUtc() {
        return this.processingEndTimeUtc;
    }

    /**
     * Get the entities property: A list of entities related to the alert.
     *
     * @return the entities value.
     */
    public List<AlertEntity> entities() {
        return this.entities;
    }

    /**
     * Get the isIncident property: This field determines whether the alert is an incident (a compound grouping of
     * several alerts) or a single alert.
     *
     * @return the isIncident value.
     */
    public Boolean isIncident() {
        return this.isIncident;
    }

    /**
     * Get the correlationKey property: Key for corelating related alerts. Alerts with the same correlation key
     * considered to be related.
     *
     * @return the correlationKey value.
     */
    public String correlationKey() {
        return this.correlationKey;
    }

    /**
     * Get the extendedProperties property: Custom properties for the alert.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: Custom properties for the alert.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the AlertProperties object itself.
     */
    public AlertProperties withExtendedProperties(Map<String, String> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the compromisedEntity property: The display name of the resource most related to this alert.
     *
     * @return the compromisedEntity value.
     */
    public String compromisedEntity() {
        return this.compromisedEntity;
    }

    /**
     * Get the techniques property: kill chain related techniques behind the alert.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Get the subTechniques property: Kill chain related sub-techniques behind the alert.
     *
     * @return the subTechniques value.
     */
    public List<String> subTechniques() {
        return this.subTechniques;
    }

    /**
     * Get the supportingEvidence property: Changing set of properties depending on the supportingEvidence type.
     *
     * @return the supportingEvidence value.
     */
    public AlertPropertiesSupportingEvidence supportingEvidence() {
        return this.supportingEvidence;
    }

    /**
     * Set the supportingEvidence property: Changing set of properties depending on the supportingEvidence type.
     *
     * @param supportingEvidence the supportingEvidence value to set.
     * @return the AlertProperties object itself.
     */
    public AlertProperties withSupportingEvidence(AlertPropertiesSupportingEvidence supportingEvidence) {
        this.supportingEvidence = supportingEvidence;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceIdentifiers() != null) {
            resourceIdentifiers().forEach(e -> e.validate());
        }
        if (entities() != null) {
            entities().forEach(e -> e.validate());
        }
        if (supportingEvidence() != null) {
            supportingEvidence().validate();
        }
    }
}
