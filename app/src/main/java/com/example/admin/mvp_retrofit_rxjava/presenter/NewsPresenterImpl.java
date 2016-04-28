package com.example.admin.mvp_retrofit_rxjava.presenter;
import com.example.admin.mvp_retrofit_rxjava.bean.NewsBean;
import com.example.admin.mvp_retrofit_rxjava.builder.Builder;
import com.example.admin.mvp_retrofit_rxjava.builder.Service;
import com.example.admin.mvp_retrofit_rxjava.common.Urls;
import com.example.admin.mvp_retrofit_rxjava.main.LogUtils;
import com.example.admin.mvp_retrofit_rxjava.main.MainActivity;
import com.example.admin.mvp_retrofit_rxjava.model.NewsModel;
import com.example.admin.mvp_retrofit_rxjava.model.NewsModelImpl;
import java.util.List;

import view.NewsView;

/**
 * Created by admin on 2016/4/27.
 */
public class NewsPresenterImpl implements NewsPresenter,NewsModelImpl.OnLoadNewsListListener{
    private static final String TAG = "NewsPresenterImpl";

    private NewsView mNewsView;
    private NewsModel mNewsModel;
    private Builder builder;
    private Service service;

    public NewsPresenterImpl(NewsView newsView) {
        this.mNewsView = newsView;
        this.mNewsModel = new NewsModelImpl();
    }
    @Override
    public void loadList(int type, int pageIndex) {
        String url = getUrl(type, pageIndex);
        LogUtils.d(TAG, url);
        //只有第一页的或者刷新的时候才显示刷新进度条
        if(pageIndex == 0) {
            mNewsView.showProgress();
        }
        //mNewsModel.loadNews(url, type, this);
         builder=Service.getRequest(getUrl(type,pageIndex),Builder.class);
        mNewsModel.loadNews1(type,builder, this);
    }
    /**
     * 根据类别和页面索引创建url
     * @param type
     * @param pageIndex
     * @return
     */
    private String getUrl(int type, int pageIndex) {
        StringBuffer sb = new StringBuffer();
        switch (type) {
            case MainActivity.NEWS_TYPE_TOP:
                sb.append(Urls.TOP_URL);
               // .append(Urls.TOP_ID)
                break;
            case MainActivity.NEWS_TYPE_NBA:
                sb.append(Urls.COMMON_URL);
              //  .append(Urls.NBA_ID);
                break;
            case MainActivity.NEWS_TYPE_CARS:
                sb.append(Urls.COMMON_URL);
              //  .append(Urls.CAR_ID)
                break;
            case MainActivity.NEWS_TYPE_JOKES:
                sb.append(Urls.COMMON_URL);
               // .append(Urls.JOKE_ID)
                break;
            default:
                sb.append(Urls.TOP_URL);
               // .append(Urls.TOP_ID)
                break;
        }
     //   sb.append("/").append(pageIndex).append(Urls.END_URL);
        return sb.toString();
    }

    @Override
    public void onSuccess(List<NewsBean.T1348647909107Bean> list) {
        mNewsView.hideProgress();
        mNewsView.addNews(list);
    }
    @Override
    public void onFailure(String msg, Exception e) {
        mNewsView.hideProgress();
        mNewsView.showLoadFailMsg();
    }
}
