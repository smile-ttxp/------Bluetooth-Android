package com.itraing.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LOST_BEAN.
 */
public class LostBean {

    private Long id;
    /** Not-null value. */
    private String UUIDString;
    /** Not-null value. */
    private String tagName;
    /** Not-null value. */
    private String imageName;
    /** Not-null value. */
    private java.util.Date lostTime;
    private int lostYear;
    private int lostMonth;
    private int lostDay;
    private double lostLot;
    private double lostLat;
    /** Not-null value. */
    private String lostAddress;

    public LostBean() {
    }

    public LostBean(Long id) {
        this.id = id;
    }

    public LostBean(Long id, String UUIDString, String tagName, String imageName, java.util.Date lostTime, int lostYear, int lostMonth, int lostDay, double lostLot, double lostLat, String lostAddress) {
        this.id = id;
        this.UUIDString = UUIDString;
        this.tagName = tagName;
        this.imageName = imageName;
        this.lostTime = lostTime;
        this.lostYear = lostYear;
        this.lostMonth = lostMonth;
        this.lostDay = lostDay;
        this.lostLot = lostLot;
        this.lostLat = lostLat;
        this.lostAddress = lostAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getUUIDString() {
        return UUIDString;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUUIDString(String UUIDString) {
        this.UUIDString = UUIDString;
    }

    /** Not-null value. */
    public String getTagName() {
        return tagName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /** Not-null value. */
    public String getImageName() {
        return imageName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /** Not-null value. */
    public java.util.Date getLostTime() {
        return lostTime;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLostTime(java.util.Date lostTime) {
        this.lostTime = lostTime;
    }

    public int getLostYear() {
        return lostYear;
    }

    public void setLostYear(int lostYear) {
        this.lostYear = lostYear;
    }

    public int getLostMonth() {
        return lostMonth;
    }

    public void setLostMonth(int lostMonth) {
        this.lostMonth = lostMonth;
    }

    public int getLostDay() {
        return lostDay;
    }

    public void setLostDay(int lostDay) {
        this.lostDay = lostDay;
    }

    public double getLostLot() {
        return lostLot;
    }

    public void setLostLot(double lostLot) {
        this.lostLot = lostLot;
    }

    public double getLostLat() {
        return lostLat;
    }

    public void setLostLat(double lostLat) {
        this.lostLat = lostLat;
    }

    /** Not-null value. */
    public String getLostAddress() {
        return lostAddress;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLostAddress(String lostAddress) {
        this.lostAddress = lostAddress;
    }

}
