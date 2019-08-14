package com.example.card.bean;

public class Card {
    private String cardId;
    private String name;
    private Float limit;
    private Float availableLimit;
    private Float newLimit;
    private Float maxLimit;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLimit() {
        return limit;
    }

    public void setLimit(Float limit) {
        this.limit = limit;
    }

    public Float getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Float availableLimit) {
        this.availableLimit = availableLimit;
    }

    public Float getNewLimit() {
        return newLimit;
    }

    public void setNewLimit(Float newLimit) {
        this.newLimit = newLimit;
    }

    public Float getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Float maxLimit) {
        this.maxLimit = maxLimit;
    }
}
