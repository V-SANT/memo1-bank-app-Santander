package com.aninfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public abstract class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected Double amount;
    protected Long cbu;
    protected TransactionType type;

    public Long getCbu() {
        return cbu;
    }

    @JsonIgnore
    public Double getAmountAfterDeletion() {
        return 0.0;
    };

}
