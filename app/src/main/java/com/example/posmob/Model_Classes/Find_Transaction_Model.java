package com.example.posmob.Model_Classes;

public class Find_Transaction_Model {
    private String serialNumber ;
    private String model;
    private String partNumber;
    private String deviceOwner ;

    public Find_Transaction_Model(String serialNumber, String model, String partNumber, String deviceOwner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.partNumber = partNumber;
        this.deviceOwner = deviceOwner;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }
}
