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
 * @param id 
 * @param type 
 * @param key 
 */


data class RequestModelC (

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: RequestModelC.Type,

    @field:JsonProperty("key")
    val key: kotlin.String

) : V1EndpointPostRequest {

    /**
     * 
     *
     * Values: value1,value2,value3
     */
    enum class Type(val value: kotlin.String) {
        @JsonProperty(value = "value1") value1("value1"),
        @JsonProperty(value = "value2") value2("value2"),
        @JsonProperty(value = "value3") value3("value3");
    }
}

