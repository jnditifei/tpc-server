package com.tpc.server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class mt4accounts {

    @Id
    private int id;
    @Column(unique = true)
    private String account;
    private String acctype;
    private String balance;
    private String currency;
    private String days;
    private String drawdown;
    private String equity;
    private String equitymax;
    private String equitymin;
    private String floatingpl;
    private String freemargin;
    private String gain;
    private String margin;
    private String marginlevel;
    private String maxdailyloss;
    private String maxdailylossallowed;
    private String maxlossalowed;
    private String mintradedays;
    private String profit;
    private String profittarget;
    private String startbalance;
    private String startdate;
    private String trades;

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getAcctype() {
        return acctype;
    }

    public String getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDays() {
        return days;
    }

    public String getDrawdown() {
        return drawdown;
    }

    public String getEquity() {
        return equity;
    }

    public String getEquitymax() {
        return equitymax;
    }

    public String getEquitymin() {
        return equitymin;
    }

    public String getFloatingpl() {
        return floatingpl;
    }

    public String getFreemargin() {
        return freemargin;
    }

    public String getGain() {
        return gain;
    }

    public String getMargin() {
        return margin;
    }

    public String getMarginlevel() {
        return marginlevel;
    }

    public String getMaxdailyloss() {
        return maxdailyloss;
    }

    public String getMaxdailylossallowed() {
        return maxdailylossallowed;
    }

    public String getMaxlossalowed() {
        return maxlossalowed;
    }

    public String getMintradedays() {
        return mintradedays;
    }

    public String getProfit() {
        return profit;
    }

    public String getProfittarget() {
        return profittarget;
    }

    public String getStartbalance() {
        return startbalance;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getTrades() {
        return trades;
    }
}