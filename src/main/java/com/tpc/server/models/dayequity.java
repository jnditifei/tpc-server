package com.tpc.server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dayequity {

    @Id
    private int id;
    private String account;
    private int time;
    private String equity;
    @Column(unique = true)
    private String uniquenr;

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public int getTime() {
        return time;
    }

    public String getEquity() {
        return equity;
    }

    public String getUniquenr() {
        return uniquenr;
    }
}