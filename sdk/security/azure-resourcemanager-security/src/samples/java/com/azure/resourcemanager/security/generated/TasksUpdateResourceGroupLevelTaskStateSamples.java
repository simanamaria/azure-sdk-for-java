// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.models.TaskUpdateActionType;

/** Samples for Tasks UpdateResourceGroupLevelTaskState. */
public final class TasksUpdateResourceGroupLevelTaskStateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2015-06-01-preview/examples/Tasks/UpdateTaskResourceGroupLocation_example.json
     */
    /**
     * Sample code: Change security recommendation task state.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void changeSecurityRecommendationTaskState(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .tasks()
            .updateResourceGroupLevelTaskStateWithResponse(
                "myRg",
                "westeurope",
                "d55b4dc0-779c-c66c-33e5-d7bce24c4222",
                TaskUpdateActionType.DISMISS,
                Context.NONE);
    }
}
