package com.example.admin.mvp_retrofit_rxjava.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by admin on 2016/4/28.
 */
public class Sheng implements Serializable{
    private ArrayList<NewsBean>beans;

    public ArrayList<NewsBean> getBeans() {
        return beans;
    }

    public void setBeans(ArrayList<NewsBean> beans) {
        this.beans = beans;
    }
}
