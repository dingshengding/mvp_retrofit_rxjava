package view;

import com.example.admin.mvp_retrofit_rxjava.bean.NewsBean;

import java.util.List;

/**
 * Created by admin on 2016/4/27.
 */
public interface NewsView {
    void showProgress();

    void addNews(List<NewsBean.T1348647909107Bean> newsList);

    void hideProgress();

    void showLoadFailMsg();











}
