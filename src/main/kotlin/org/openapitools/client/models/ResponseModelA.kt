/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param expires 
 * @param value1 
 * @param value2 
 * @param valueType 
 */


data class ResponseModelA (

    @field:JsonProperty("expires")
    val expires: kotlin.Int,

    @field:JsonProperty("value_1")
    val value1: kotlin.String,

    @field:JsonProperty("value_2")
    val value2: kotlin.String,

    @field:JsonProperty("value_type")
    val valueType: kotlin.String? = null

) : V1EndpointPost200Response

