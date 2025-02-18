// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details of the HTTP request. */
@Fluent
public final class ResourceHttpRequest {
    /*
     * The client request ID.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * The client IP address.
     */
    @JsonProperty(value = "clientIpAddress")
    private String clientIpAddress;

    /*
     * The request method.
     */
    @JsonProperty(value = "method")
    private String method;

    /*
     * The url used in the request.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the clientRequestId property: The client request ID.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: The client request ID.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the ResourceHttpRequest object itself.
     */
    public ResourceHttpRequest setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the clientIpAddress property: The client IP address.
     *
     * @return the clientIpAddress value.
     */
    public String getClientIpAddress() {
        return this.clientIpAddress;
    }

    /**
     * Set the clientIpAddress property: The client IP address.
     *
     * @param clientIpAddress the clientIpAddress value to set.
     * @return the ResourceHttpRequest object itself.
     */
    public ResourceHttpRequest setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
        return this;
    }

    /**
     * Get the method property: The request method.
     *
     * @return the method value.
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * Set the method property: The request method.
     *
     * @param method the method value to set.
     * @return the ResourceHttpRequest object itself.
     */
    public ResourceHttpRequest setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: The url used in the request.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The url used in the request.
     *
     * @param url the url value to set.
     * @return the ResourceHttpRequest object itself.
     */
    public ResourceHttpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
}
