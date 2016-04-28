package com.example.admin.mvp_retrofit_rxjava.model;

import android.util.Log;

import com.example.admin.mvp_retrofit_rxjava.bean.NewsBean;
import com.example.admin.mvp_retrofit_rxjava.builder.Builder;
import com.example.admin.mvp_retrofit_rxjava.common.Urls;
import com.example.admin.mvp_retrofit_rxjava.main.MainActivity;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2016/4/27.
 */
public class NewsModelImpl implements NewsModel {
  /*  @Override
    public void loadNews(String url, final int type, final OnLoadNewsListListener listener) {
        OkHttpUtils.ResultCallback<String> loadNewsCallback = new OkHttpUtils.ResultCallback<String>() {
            @Override
            public void onSuccess(String response) {
                List<NewsBean> newsBeanList = NewsJsonUtils.readJsonNewsBeans(response, getID(type));
                listener.onSuccess(newsBeanList);
            }
            @Override
            public void onFailure(Exception e) {
                listener.onFailure("load news list failure.", e);
            }
        };
        OkHttpUtils.get(url, loadNewsCallback);
    }*/

    /**
     * 获取ID
     * @param type
     * @return
     */
    private String getID(int type) {
        String id;
        switch (type) {
            case MainActivity.NEWS_TYPE_TOP:
                id = Urls.TOP_ID;
                break;
            case MainActivity.NEWS_TYPE_NBA:
                id = Urls.NBA_ID;
                break;
            case MainActivity.NEWS_TYPE_CARS:
                id = Urls.CAR_ID;
                break;
            case MainActivity.NEWS_TYPE_JOKES:
                id = Urls.JOKE_ID;
                break;
            default:
                id = Urls.TOP_ID;
                break;
        }
        return id;
    }

    @Override
    public void loadNews(String url, int type, OnLoadNewsListListener listener) {





    }

    @Override
    public void loadNews1(int type,Builder builder,final OnLoadNewsListListener listener) {
           Observable<NewsBean> observable= builder.getRequest();

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<NewsBean>() {
                    @Override
         public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {
                      //  listener.onFailure("load news list failure.", e);
                    }

                    @Override
                    public void onNext(NewsBean newsBean) {
                        Log.i("sheng",newsBean.getT1348647909107().get(0).getTitle()+"");
                        listener.onSuccess(newsBean.getT1348647909107());
                    }
                });
    }

    public interface OnLoadNewsListListener {
        void onSuccess(List<NewsBean.T1348647909107Bean> list);
        void onFailure(String msg, Exception e);
    }

   /* public interface OnLoadNewsDetailListener {
        void onSuccess(NewsDetailBean newsDetailBean);
        void onFailure(String msg, Exception e);
    }
*/
}
