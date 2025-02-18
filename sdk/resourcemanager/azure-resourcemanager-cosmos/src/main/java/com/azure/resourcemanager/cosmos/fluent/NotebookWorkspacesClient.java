// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cosmos.fluent.models.NotebookWorkspaceConnectionInfoResultInner;
import com.azure.resourcemanager.cosmos.fluent.models.NotebookWorkspaceInner;
import com.azure.resourcemanager.cosmos.models.NotebookWorkspaceCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.NotebookWorkspaceName;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NotebookWorkspacesClient. */
public interface NotebookWorkspacesClient {
    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NotebookWorkspaceInner> listByDatabaseAccountAsync(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NotebookWorkspaceInner> listByDatabaseAccount(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NotebookWorkspaceInner> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NotebookWorkspaceInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NotebookWorkspaceInner> getAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookWorkspaceInner get(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NotebookWorkspaceInner> getWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notebook workspace resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a notebook workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<NotebookWorkspaceInner>, NotebookWorkspaceInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a notebook workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NotebookWorkspaceInner>, NotebookWorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a notebook workspace resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NotebookWorkspaceInner>, NotebookWorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters,
        Context context);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notebook workspace resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NotebookWorkspaceInner> createOrUpdateAsync(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notebook workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookWorkspaceInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters);

    /**
     * Creates the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param notebookCreateUpdateParameters The notebook workspace to create for the current database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notebook workspace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookWorkspaceInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        NotebookWorkspaceName notebookWorkspaceName,
        NotebookWorkspaceCreateUpdateParameters notebookCreateUpdateParameters,
        Context context);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NotebookWorkspaceConnectionInfoResultInner>> listConnectionInfoWithResponseAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NotebookWorkspaceConnectionInfoResultInner> listConnectionInfoAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookWorkspaceConnectionInfoResultInner listConnectionInfo(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NotebookWorkspaceConnectionInfoResultInner> listConnectionInfoWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> regenerateAuthTokenWithResponseAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginRegenerateAuthTokenAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRegenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRegenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> regenerateAuthTokenAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void regenerateAuthToken(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void regenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> startWithResponseAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginStartAsync(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> startAsync(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);
}
