// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TimezoneOptions. */
public final class TimezoneOptions extends ExpandableStringEnum<TimezoneOptions> {
    /** Static value none for TimezoneOptions. */
    public static final TimezoneOptions NONE = fromString("none");

    /** Static value zoneInfo for TimezoneOptions. */
    public static final TimezoneOptions ZONE_INFO = fromString("zoneInfo");

    /** Static value transitions for TimezoneOptions. */
    public static final TimezoneOptions TRANSITIONS = fromString("transitions");

    /** Static value all for TimezoneOptions. */
    public static final TimezoneOptions ALL = fromString("all");

    /**
     * Creates or finds a TimezoneOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimezoneOptions.
     */
    @JsonCreator
    public static TimezoneOptions fromString(String name) {
        return fromString(name, TimezoneOptions.class);
    }

    /**
     * Gets known TimezoneOptions values.
     *
     * @return known TimezoneOptions values.
     */
    public static Collection<TimezoneOptions> values() {
        return values(TimezoneOptions.class);
    }
}
