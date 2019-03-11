/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.5.1
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FuturesPriceTrigger
 */

public class FuturesPriceTrigger {
  /**
   * How the order will be triggered   - &#x60;0&#x60;: by price, which means order will be triggered on price condition satisfied  - &#x60;1&#x60;: by price gap, which means order will be triggered on gap of recent two prices of specified &#x60;price_type&#x60; satisfied.  Only &#x60;0&#x60; is supported currently
   */
  @JsonAdapter(StrategyTypeEnum.Adapter.class)
  public enum StrategyTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    StrategyTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrategyTypeEnum fromValue(String text) {
      for (StrategyTypeEnum b : StrategyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StrategyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrategyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrategyTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return StrategyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STRATEGY_TYPE = "strategy_type";
  @SerializedName(SERIALIZED_NAME_STRATEGY_TYPE)
  private StrategyTypeEnum strategyType;

  /**
   * Price type. 0 - latest deal price, 1 - mark price, 2 - index price
   */
  @JsonAdapter(PriceTypeEnum.Adapter.class)
  public enum PriceTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    PriceTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriceTypeEnum fromValue(String text) {
      for (PriceTypeEnum b : PriceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PriceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return PriceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PRICE_TYPE = "price_type";
  @SerializedName(SERIALIZED_NAME_PRICE_TYPE)
  private PriceTypeEnum priceType;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  /**
   * Trigger condition type  - &#x60;1&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &gt;&#x3D; &#x60;price&#x60; - &#x60;2&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &lt;&#x3D; &#x60;price&#x60;
   */
  @JsonAdapter(RuleEnum.Adapter.class)
  public enum RuleEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    RuleEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuleEnum fromValue(String text) {
      for (RuleEnum b : RuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<RuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuleEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return RuleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private RuleEnum rule;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Integer expiration;

  public FuturesPriceTrigger strategyType(StrategyTypeEnum strategyType) {
    this.strategyType = strategyType;
    return this;
  }

   /**
   * How the order will be triggered   - &#x60;0&#x60;: by price, which means order will be triggered on price condition satisfied  - &#x60;1&#x60;: by price gap, which means order will be triggered on gap of recent two prices of specified &#x60;price_type&#x60; satisfied.  Only &#x60;0&#x60; is supported currently
   * @return strategyType
  **/
  @ApiModelProperty(value = "How the order will be triggered   - `0`: by price, which means order will be triggered on price condition satisfied  - `1`: by price gap, which means order will be triggered on gap of recent two prices of specified `price_type` satisfied.  Only `0` is supported currently")
  public StrategyTypeEnum getStrategyType() {
    return strategyType;
  }

  public void setStrategyType(StrategyTypeEnum strategyType) {
    this.strategyType = strategyType;
  }

  public FuturesPriceTrigger priceType(PriceTypeEnum priceType) {
    this.priceType = priceType;
    return this;
  }

   /**
   * Price type. 0 - latest deal price, 1 - mark price, 2 - index price
   * @return priceType
  **/
  @ApiModelProperty(value = "Price type. 0 - latest deal price, 1 - mark price, 2 - index price")
  public PriceTypeEnum getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceTypeEnum priceType) {
    this.priceType = priceType;
  }

  public FuturesPriceTrigger price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Value of price on price triggered, or price gap on price gap triggered
   * @return price
  **/
  @ApiModelProperty(value = "Value of price on price triggered, or price gap on price gap triggered")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public FuturesPriceTrigger rule(RuleEnum rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Trigger condition type  - &#x60;1&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &gt;&#x3D; &#x60;price&#x60; - &#x60;2&#x60;: calculated price based on &#x60;strategy_type&#x60; and &#x60;price_type&#x60; &lt;&#x3D; &#x60;price&#x60;
   * @return rule
  **/
  @ApiModelProperty(value = "Trigger condition type  - `1`: calculated price based on `strategy_type` and `price_type` >= `price` - `2`: calculated price based on `strategy_type` and `price_type` <= `price`")
  public RuleEnum getRule() {
    return rule;
  }

  public void setRule(RuleEnum rule) {
    this.rule = rule;
  }

  public FuturesPriceTrigger expiration(Integer expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * How many seconds will the order wait for the condition being triggered. Order will be cancelled on timed out
   * @return expiration
  **/
  @ApiModelProperty(value = "How many seconds will the order wait for the condition being triggered. Order will be cancelled on timed out")
  public Integer getExpiration() {
    return expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuturesPriceTrigger futuresPriceTrigger = (FuturesPriceTrigger) o;
    return Objects.equals(this.strategyType, futuresPriceTrigger.strategyType) &&
        Objects.equals(this.priceType, futuresPriceTrigger.priceType) &&
        Objects.equals(this.price, futuresPriceTrigger.price) &&
        Objects.equals(this.rule, futuresPriceTrigger.rule) &&
        Objects.equals(this.expiration, futuresPriceTrigger.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategyType, priceType, price, rule, expiration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuturesPriceTrigger {\n");
    
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

