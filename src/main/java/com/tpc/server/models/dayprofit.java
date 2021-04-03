package com.tpc.server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dayprofit {

    @Id
    private  int id;
    private String account;
    private String drawdown;
    private  String gain;
    private String profit;
    private String profitdaily;
    private int time;
    @Column(unique = true)
    private String uniquenr;

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getDrawdown() {
        return drawdown;
    }

    public String getGain() {
        return gain;
    }

    public String getProfit() {
        return profit;
    }

    public String getProfitdaily() {
        return profitdaily;
    }

    public int getTime() {
        return time;
    }

    public String getUniquenr() {
        return uniquenr;
    }
}