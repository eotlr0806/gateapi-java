# gate-api

Gate API v4
- API version: 1.2.1

APIv4 futures provides all sorts of futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.

  For more information, please visit [https://gate.io/page/contacts](https://gate.io/page/contacts)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.gate</groupId>
  <artifactId>gate-api</artifactId>
  <version>1.2.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.gate:gate-api:1.2.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gate-api-1.2.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

public class FuturesApiExample {

    public static void main(String[] args) {
        ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
        // uncomment the next line if testing the API with other host
        // apiClient.setBasePath("https://some-other-host");
        FuturesApi apiInstance = new FuturesApi(client);
        String orderId = "12345"; // String | ID returned on order successfully being created
        try {
            FuturesOrder result = apiInstance.cancelOrder(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://fx-api.gateio.io/api/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FuturesApi* | [**cancelOrder**](docs/FuturesApi.md#cancelOrder) | **DELETE** /futures/orders/{order_id} | Cancel a single order
*FuturesApi* | [**cancelOrders**](docs/FuturesApi.md#cancelOrders) | **DELETE** /futures/orders | Cancel all &#x60;open&#x60; orders matched
*FuturesApi* | [**createOrder**](docs/FuturesApi.md#createOrder) | **POST** /futures/orders | Create a futures order
*FuturesApi* | [**getFuturesContract**](docs/FuturesApi.md#getFuturesContract) | **GET** /futures/contracts/{contract} | Get a single contract
*FuturesApi* | [**getMyTrades**](docs/FuturesApi.md#getMyTrades) | **GET** /futures/my_trades | List personal trading history
*FuturesApi* | [**getOrder**](docs/FuturesApi.md#getOrder) | **GET** /futures/orders/{order_id} | Get a single order
*FuturesApi* | [**getPosition**](docs/FuturesApi.md#getPosition) | **GET** /futures/positions/{contract} | Get single position
*FuturesApi* | [**listFuturesAccountBook**](docs/FuturesApi.md#listFuturesAccountBook) | **GET** /futures/account_book | Query account book
*FuturesApi* | [**listFuturesAccounts**](docs/FuturesApi.md#listFuturesAccounts) | **GET** /futures/accounts | Query futures account
*FuturesApi* | [**listFuturesCandlesticks**](docs/FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/candlesticks | Get futures candlesticks
*FuturesApi* | [**listFuturesContracts**](docs/FuturesApi.md#listFuturesContracts) | **GET** /futures/contracts | List all futures contracts
*FuturesApi* | [**listFuturesFundingRateHistory**](docs/FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/funding_rate | Funding rate history
*FuturesApi* | [**listFuturesInsuranceLedger**](docs/FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/insurance | Futures insurance balance history
*FuturesApi* | [**listFuturesOrderBook**](docs/FuturesApi.md#listFuturesOrderBook) | **GET** /futures/order_book | Futures order book
*FuturesApi* | [**listFuturesTickers**](docs/FuturesApi.md#listFuturesTickers) | **GET** /futures/tickers | List futures tickers
*FuturesApi* | [**listFuturesTrades**](docs/FuturesApi.md#listFuturesTrades) | **GET** /futures/trades | Futures trading history
*FuturesApi* | [**listOrders**](docs/FuturesApi.md#listOrders) | **GET** /futures/orders | List futures orders
*FuturesApi* | [**listPositionClose**](docs/FuturesApi.md#listPositionClose) | **GET** /futures/position_close | List position close history
*FuturesApi* | [**listPositions**](docs/FuturesApi.md#listPositions) | **GET** /futures/positions | List all positions of a user
*FuturesApi* | [**updatePositionLeverage**](docs/FuturesApi.md#updatePositionLeverage) | **POST** /futures/positions/{contract}/leverage | Update position leverage
*FuturesApi* | [**updatePositionMargin**](docs/FuturesApi.md#updatePositionMargin) | **POST** /futures/positions/{contract}/margin | Update position margin
*FuturesApi* | [**updatePositionRiskLimit**](docs/FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/positions/{contract}/risk_limit | Update position risk limit


## Documentation for Models

 - [Contract](docs/Contract.md)
 - [FundingRateRecord](docs/FundingRateRecord.md)
 - [FuturesAccount](docs/FuturesAccount.md)
 - [FuturesAccountBook](docs/FuturesAccountBook.md)
 - [FuturesCandlestick](docs/FuturesCandlestick.md)
 - [FuturesOrder](docs/FuturesOrder.md)
 - [FuturesOrderBook](docs/FuturesOrderBook.md)
 - [FuturesOrderBookItem](docs/FuturesOrderBookItem.md)
 - [FuturesTicker](docs/FuturesTicker.md)
 - [FuturesTrade](docs/FuturesTrade.md)
 - [InsuranceRecord](docs/InsuranceRecord.md)
 - [MyFuturesTrade](docs/MyFuturesTrade.md)
 - [Position](docs/Position.md)
 - [PositionClose](docs/PositionClose.md)
 - [PositionCloseOrder](docs/PositionCloseOrder.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mail.gate.io

