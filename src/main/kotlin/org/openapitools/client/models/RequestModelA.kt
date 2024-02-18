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
 * @param scope 
 * @param name 
 * @param description 
 */


data class RequestModelA (

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: RequestModelA.Type,

    @field:JsonProperty("scope")
    val scope: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String

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
