package com.n2cj.entity;

// Generated 2015-9-24 22:05:14 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * IndexEvent generated by hbm2java
 */
public class IndexEvent implements java.io.Serializable {

    private Integer indexId;
    private BasicIndex basicIndex;
    private String indexStatus;
    private String name;
    private String country;
    private String period;
    private String importance;
    private String lastValue;
    private String predictValue;
    private String value;
    private String unit;
    private Date publishTime;
    private Integer year;
    private String positiveItem;
    private String negativeItem;
    private Date addtime;
    private Date modifytime;
    private String keyword;
    private String reasonforlook;
    private String publishOrganization;
    private String publishFrequncy;
    private Date nextpublishTime;
    private String statisticMethod;
    private String influence;
    private String explanation;
    private Integer level;
    private Integer parentId;
    private String currency;
    private Short gold;
    private Short silver;
    private Short petro;
    private String editor;
    private String predictCurrency;
    private Long predictCurrencyRate;
    private Long predictGold;
    private Long predictPetro;
    private Long predictSilver;
    private Long predictStock;
    private Integer updated;
    private Integer currencyInfluence;
    private Integer goldInfluence;
    private Integer silverInfluence;
    private Integer petroInfluence;
    private Integer stockInfluence;
    private String content;

    public IndexEvent() {
    }

    public IndexEvent(BasicIndex basicIndex) {
        this.basicIndex = basicIndex;
    }

    public IndexEvent(BasicIndex basicIndex, String indexStatus, String name,
                      String country, String period, String importance, String lastValue,
                      String predictValue, String value, String unit, Date publishTime,
                      Integer year, String positiveItem, String negativeItem, Date addtime,
                      Date modifytime, String keyword, String reasonforlook,
                      String publishOrganization, String publishFrequncy, Date nextpublishTime,
                      String statisticMethod, String influence, String explanation, Integer level,
                      Integer parentId, String currency, Short gold, Short silver, Short petro,
                      String editor, String predictCurrency, Long predictCurrencyRate,
                      Long predictGold, Long predictPetro, Long predictSilver, Long predictStock,
                      Integer updated, Integer currencyInfluence, Integer goldInfluence,
                      Integer silverInfluence, Integer petroInfluence, Integer stockInfluence,
                      String content) {
        this.basicIndex = basicIndex;
        this.indexStatus = indexStatus;
        this.name = name;
        this.country = country;
        this.period = period;
        this.importance = importance;
        this.lastValue = lastValue;
        this.predictValue = predictValue;
        this.value = value;
        this.unit = unit;
        this.publishTime = publishTime;
        this.year = year;
        this.positiveItem = positiveItem;
        this.negativeItem = negativeItem;
        this.addtime = addtime;
        this.modifytime = modifytime;
        this.keyword = keyword;
        this.reasonforlook = reasonforlook;
        this.publishOrganization = publishOrganization;
        this.publishFrequncy = publishFrequncy;
        this.nextpublishTime = nextpublishTime;
        this.statisticMethod = statisticMethod;
        this.influence = influence;
        this.explanation = explanation;
        this.level = level;
        this.parentId = parentId;
        this.currency = currency;
        this.gold = gold;
        this.silver = silver;
        this.petro = petro;
        this.editor = editor;
        this.predictCurrency = predictCurrency;
        this.predictCurrencyRate = predictCurrencyRate;
        this.predictGold = predictGold;
        this.predictPetro = predictPetro;
        this.predictSilver = predictSilver;
        this.predictStock = predictStock;
        this.updated = updated;
        this.currencyInfluence = currencyInfluence;
        this.goldInfluence = goldInfluence;
        this.silverInfluence = silverInfluence;
        this.petroInfluence = petroInfluence;
        this.stockInfluence = stockInfluence;
        this.content = content;
    }

    public Integer getIndexId() {
        return this.indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public BasicIndex getBasicIndex() {
        return this.basicIndex;
    }

    public void setBasicIndex(BasicIndex basicIndex) {
        this.basicIndex = basicIndex;
    }

    public String getIndexStatus() {
        return this.indexStatus;
    }

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPeriod() {
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getImportance() {
        return this.importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getLastValue() {
        return this.lastValue;
    }

    public void setLastValue(String lastValue) {
        this.lastValue = lastValue;
    }

    public String getPredictValue() {
        return this.predictValue;
    }

    public void setPredictValue(String predictValue) {
        this.predictValue = predictValue;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getPublishTime() {
        return this.publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPositiveItem() {
        return this.positiveItem;
    }

    public void setPositiveItem(String positiveItem) {
        this.positiveItem = positiveItem;
    }

    public String getNegativeItem() {
        return this.negativeItem;
    }

    public void setNegativeItem(String negativeItem) {
        this.negativeItem = negativeItem;
    }

    public Date getAddtime() {
        return this.addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getModifytime() {
        return this.modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getReasonforlook() {
        return this.reasonforlook;
    }

    public void setReasonforlook(String reasonforlook) {
        this.reasonforlook = reasonforlook;
    }

    public String getPublishOrganization() {
        return this.publishOrganization;
    }

    public void setPublishOrganization(String publishOrganization) {
        this.publishOrganization = publishOrganization;
    }

    public String getPublishFrequncy() {
        return this.publishFrequncy;
    }

    public void setPublishFrequncy(String publishFrequncy) {
        this.publishFrequncy = publishFrequncy;
    }

    public Date getNextpublishTime() {
        return this.nextpublishTime;
    }

    public void setNextpublishTime(Date nextpublishTime) {
        this.nextpublishTime = nextpublishTime;
    }

    public String getStatisticMethod() {
        return this.statisticMethod;
    }

    public void setStatisticMethod(String statisticMethod) {
        this.statisticMethod = statisticMethod;
    }

    public String getInfluence() {
        return this.influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Short getGold() {
        return this.gold;
    }

    public void setGold(Short gold) {
        this.gold = gold;
    }

    public Short getSilver() {
        return this.silver;
    }

    public void setSilver(Short silver) {
        this.silver = silver;
    }

    public Short getPetro() {
        return this.petro;
    }

    public void setPetro(Short petro) {
        this.petro = petro;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPredictCurrency() {
        return this.predictCurrency;
    }

    public void setPredictCurrency(String predictCurrency) {
        this.predictCurrency = predictCurrency;
    }

    public Long getPredictCurrencyRate() {
        return this.predictCurrencyRate;
    }

    public void setPredictCurrencyRate(Long predictCurrencyRate) {
        this.predictCurrencyRate = predictCurrencyRate;
    }

    public Long getPredictGold() {
        return this.predictGold;
    }

    public void setPredictGold(Long predictGold) {
        this.predictGold = predictGold;
    }

    public Long getPredictPetro() {
        return this.predictPetro;
    }

    public void setPredictPetro(Long predictPetro) {
        this.predictPetro = predictPetro;
    }

    public Long getPredictSilver() {
        return this.predictSilver;
    }

    public void setPredictSilver(Long predictSilver) {
        this.predictSilver = predictSilver;
    }

    public Long getPredictStock() {
        return this.predictStock;
    }

    public void setPredictStock(Long predictStock) {
        this.predictStock = predictStock;
    }

    public Integer getUpdated() {
        return this.updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getCurrencyInfluence() {
        return this.currencyInfluence;
    }

    public void setCurrencyInfluence(Integer currencyInfluence) {
        this.currencyInfluence = currencyInfluence;
    }

    public Integer getGoldInfluence() {
        return this.goldInfluence;
    }

    public void setGoldInfluence(Integer goldInfluence) {
        this.goldInfluence = goldInfluence;
    }

    public Integer getSilverInfluence() {
        return this.silverInfluence;
    }

    public void setSilverInfluence(Integer silverInfluence) {
        this.silverInfluence = silverInfluence;
    }

    public Integer getPetroInfluence() {
        return this.petroInfluence;
    }

    public void setPetroInfluence(Integer petroInfluence) {
        this.petroInfluence = petroInfluence;
    }

    public Integer getStockInfluence() {
        return this.stockInfluence;
    }

    public void setStockInfluence(Integer stockInfluence) {
        this.stockInfluence = stockInfluence;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}