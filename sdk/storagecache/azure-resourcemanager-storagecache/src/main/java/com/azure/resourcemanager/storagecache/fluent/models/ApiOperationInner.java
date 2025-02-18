// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagecache.models.ApiOperationDisplay;
import com.azure.resourcemanager.storagecache.models.ApiOperationPropertiesServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST API operation description: see
 * https://github.com/Azure/azure-rest-api-specs/blob/master/documentation/openapi-authoring-automated-guidelines.md#r3023-operationsapiimplementation.
 */
@Fluent
public final class ApiOperationInner {
    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private ApiOperationDisplay display;

    /*
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * The flag that indicates whether the operation applies to data plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Additional details about an operation.
     */
    @JsonProperty(value = "properties")
    private ApiOperationProperties innerProperties;

    /**
     * Get the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    public ApiOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     *
     * @param display the display value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withDisplay(ApiOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the isDataAction property: The flag that indicates whether the operation applies to data plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: The flag that indicates whether the operation applies to data plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Additional details about an operation.
     *
     * @return the innerProperties value.
     */
    private ApiOperationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceSpecification property: Specification of the all the metrics provided for a resource type.
     *
     * @return the serviceSpecification value.
     */
    public ApiOperationPropertiesServiceSpecification serviceSpecification() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceSpecification();
    }

    /**
     * Set the serviceSpecification property: Specification of the all the metrics provided for a resource type.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withServiceSpecification(ApiOperationPropertiesServiceSpecification serviceSpecification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiOperationProperties();
        }
        this.innerProperties().withServiceSpecification(serviceSpecification);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
