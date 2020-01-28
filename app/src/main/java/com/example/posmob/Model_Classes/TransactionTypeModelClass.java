package com.example.posmob.Model_Classes;

public class TransactionTypeModelClass {

    String description;
    String transactiontype;
    String createddate;
    String code;


    public TransactionTypeModelClass(String description, String transactiontype, String createddate, String code) {
        this.description = description;
        this.transactiontype = transactiontype;
        this.createddate = createddate;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
