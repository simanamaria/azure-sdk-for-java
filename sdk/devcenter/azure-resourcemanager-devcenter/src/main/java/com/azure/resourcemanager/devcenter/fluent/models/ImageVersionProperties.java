// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of an image version. */
@Immutable
public final class ImageVersionProperties {
    /*
     * The semantic version string.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The datetime that the backing image version was published.
     */
    @JsonProperty(value = "publishedDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime publishedDate;

    /*
     * If the version should be excluded from being treated as the latest version.
     */
    @JsonProperty(value = "excludeFromLatest", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean excludeFromLatest;

    /*
     * The size of the OS disk image, in GB.
     */
    @JsonProperty(value = "osDiskImageSizeInGb", access = JsonProperty.Access.WRITE_ONLY)
    private Integer osDiskImageSizeInGb;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The semantic version string.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the publishedDate property: The datetime that the backing image version was published.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Get the excludeFromLatest property: If the version should be excluded from being treated as the latest version.
     *
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Get the osDiskImageSizeInGb property: The size of the OS disk image, in GB.
     *
     * @return the osDiskImageSizeInGb value.
     */
    public Integer osDiskImageSizeInGb() {
        return this.osDiskImageSizeInGb;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
