// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ListStorageAccountKeysResult model. */
@Immutable
public final class ListStorageAccountKeysResultInner {
    /*
     * The userStorageKey property.
     */
    @JsonProperty(value = "userStorageKey", access = JsonProperty.Access.WRITE_ONLY)
    private String userStorageKey;

    /**
     * Get the userStorageKey property: The userStorageKey property.
     *
     * @return the userStorageKey value.
     */
    public String userStorageKey() {
        return this.userStorageKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
