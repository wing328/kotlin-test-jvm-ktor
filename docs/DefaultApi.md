# DefaultApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1EndpointPost**](DefaultApi.md#v1EndpointPost) | **POST** /v1/endpoint | 


<a id="v1EndpointPost"></a>
# **v1EndpointPost**
> V1EndpointPost200Response v1EndpointPost(stage, id, type, scope, name, description, summary, key)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stage : kotlin.String = stage_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val summary : kotlin.String = summary_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : V1EndpointPost200Response = apiInstance.v1EndpointPost(stage, id, type, scope, name, description, summary, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1EndpointPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1EndpointPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  | [enum: prod, int]
 **id** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional] [enum: value1, value2, value3]
 **scope** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **summary** | **kotlin.String**|  | [optional]
 **key** | **kotlin.String**|  | [optional]

### Return type

[**V1EndpointPost200Response**](V1EndpointPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded; charset=utf-8
 - **Accept**: application/json

