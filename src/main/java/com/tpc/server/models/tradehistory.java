package com.tpc.server.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tradehistory {

    @Id
    private String orderticket;
    private String account;
    private String ordercloseprice;
    private String orderclosetime;
    private String ordercomission;
    private String ordercomment;
    private String orderlots;
    private String orderopenprice;
    private String orderopentime;
    private String orderprofit;
    private String orderstoploss;
    private String orderswap;
    private String ordersymbol;
    private String ordertakeprofit;
    private String ordertype;

    public String getOrderticket() {
        return orderticket;
    }

    public String getAccount() {
        return account;
    }

    public String getOrdercloseprice() {
        return ordercloseprice;
    }

    public String getOrderclosetime() {
        return orderclosetime;
    }

    public String getOrdercomission() {
        return ordercomission;
    }

    public String getOrdercomment() {
        return ordercomment;
    }

    public String getOrderlots() {
        return orderlots;
    }

    public String getOrderopenprice() {
        return orderopenprice;
    }

    public String getOrderopentime() {
        return orderopentime;
    }

    public String getOrderprofit() {
        return orderprofit;
    }

    public String getOrderstoploss() {
        return orderstoploss;
    }

    public String getOrderswap() {
        return orderswap;
    }

    public String getOrdersymbol() {
        return ordersymbol;
    }

    public String getOrdertakeprofit() {
        return ordertakeprofit;
    }

    public String getOrdertype() {
        return ordertype;
    }
}