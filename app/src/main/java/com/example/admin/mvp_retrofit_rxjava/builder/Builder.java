package com.example.admin.mvp_retrofit_rxjava.builder;

import com.example.admin.mvp_retrofit_rxjava.bean.NewsBean;
import com.example.admin.mvp_retrofit_rxjava.bean.Sheng;

import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by admin on 2016/4/28.
 */
public interface Builder {
    //http://ip.taobao.com/service/getIpInfo.php?ip=21.22.11.33
    //"http://c.m.163.com/"
    /**
     * 获取数据
     * @param
     * @return
     */
    @GET("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    public rx.Observable<NewsBean>getRequest();
    @GET("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    public rx.Observable<Sheng>getRequest1();
    @GET("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    public rx.Observable<NewsBean>getRequest2();
    @GET("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    public rx.Observable<Sheng>getRequest3();



    @POST("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    public rx.Observable<NewsBean>getRequest3(@Field("secret") String secret,
                                              @Field("short_name") String shortName,
                                              @Field("author_email") String authorEmail,
                                              @Field("author_name") String authorName,
                                              @Field("thread_key") String threadKey,
                                              @Field("author_url") String author_url,
                                              @Field("message") String message);
}
