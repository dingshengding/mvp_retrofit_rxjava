package com.example.admin.mvp_retrofit_rxjava.model;

import com.example.admin.mvp_retrofit_rxjava.builder.Builder;

/**
 * Created by admin on 2016/4/27.
 */
public interface NewsModel {
    public void loadNews(String url, int type, final NewsModelImpl.OnLoadNewsListListener listener);
    public void loadNews1(int type,Builder builder, final NewsModelImpl.OnLoadNewsListListener listener);
}
