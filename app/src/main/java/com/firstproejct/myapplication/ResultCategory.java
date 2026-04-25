
package com.firstproejct.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultCategory {

    @SerializedName("categorylist")
    @Expose
    private List<Categorylist> categorylist = null;

    public List<Categorylist> getCategorylist() {
        return categorylist;
    }

    public void setCategorylist(List<Categorylist> categorylist) {
        this.categorylist = categorylist;
    }

}