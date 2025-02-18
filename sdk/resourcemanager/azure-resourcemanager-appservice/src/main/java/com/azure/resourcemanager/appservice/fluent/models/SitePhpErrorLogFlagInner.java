// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Used for getting PHP error logging flag. */
@Fluent
public final class SitePhpErrorLogFlagInner extends ProxyOnlyResource {
    /*
     * SitePhpErrorLogFlag resource specific properties
     */
    @JsonProperty(value = "properties")
    private SitePhpErrorLogFlagProperties innerProperties;

    /**
     * Get the innerProperties property: SitePhpErrorLogFlag resource specific properties.
     *
     * @return the innerProperties value.
     */
    private SitePhpErrorLogFlagProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SitePhpErrorLogFlagInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the localLogErrors property: Local log_errors setting.
     *
     * @return the localLogErrors value.
     */
    public String localLogErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().localLogErrors();
    }

    /**
     * Set the localLogErrors property: Local log_errors setting.
     *
     * @param localLogErrors the localLogErrors value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrors(String localLogErrors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withLocalLogErrors(localLogErrors);
        return this;
    }

    /**
     * Get the masterLogErrors property: Master log_errors setting.
     *
     * @return the masterLogErrors value.
     */
    public String masterLogErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().masterLogErrors();
    }

    /**
     * Set the masterLogErrors property: Master log_errors setting.
     *
     * @param masterLogErrors the masterLogErrors value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrors(String masterLogErrors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withMasterLogErrors(masterLogErrors);
        return this;
    }

    /**
     * Get the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     *
     * @return the localLogErrorsMaxLength value.
     */
    public String localLogErrorsMaxLength() {
        return this.innerProperties() == null ? null : this.innerProperties().localLogErrorsMaxLength();
    }

    /**
     * Set the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     *
     * @param localLogErrorsMaxLength the localLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrorsMaxLength(String localLogErrorsMaxLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withLocalLogErrorsMaxLength(localLogErrorsMaxLength);
        return this;
    }

    /**
     * Get the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     *
     * @return the masterLogErrorsMaxLength value.
     */
    public String masterLogErrorsMaxLength() {
        return this.innerProperties() == null ? null : this.innerProperties().masterLogErrorsMaxLength();
    }

    /**
     * Set the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     *
     * @param masterLogErrorsMaxLength the masterLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrorsMaxLength(String masterLogErrorsMaxLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SitePhpErrorLogFlagProperties();
        }
        this.innerProperties().withMasterLogErrorsMaxLength(masterLogErrorsMaxLength);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
