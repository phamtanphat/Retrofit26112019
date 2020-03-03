package com.example.retrofit26112019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Demo1 {
    @SerializedName("monhoc")
    @Expose
    private String monhoc;
    @SerializedName("noihoc")
    @Expose
    private String noihoc;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("fanpage")
    @Expose
    private String fanpage;
    @SerializedName("logo")
    @Expose
    private String logo;

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanpage() {
        return fanpage;
    }

    public void setFanpage(String fanpage) {
        this.fanpage = fanpage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}