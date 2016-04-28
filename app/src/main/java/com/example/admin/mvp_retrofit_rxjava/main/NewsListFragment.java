package com.example.admin.mvp_retrofit_rxjava.main;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.admin.mvp_retrofit_rxjava.R;
import com.example.admin.mvp_retrofit_rxjava.bean.NewsBean;
import com.example.admin.mvp_retrofit_rxjava.common.Urls;
import com.example.admin.mvp_retrofit_rxjava.presenter.NewsPresenter;
import com.example.admin.mvp_retrofit_rxjava.presenter.NewsPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import view.NewsView;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsListFragment extends Fragment implements NewsView, SwipeRefreshLayout.OnRefreshListener {
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    int pageIndex = 0;
    NewsAdapter mAdapter;
    private List<NewsBean.T1348647909107Bean> mData;
    int mType = 0;
    private LinearLayoutManager mLayoutManager;
    NewsPresenter mNewsPresenter;

    public NewsListFragment() {

    }

    public static Fragment newInstance(int type) {
        Bundle args = new Bundle();
        NewsListFragment fragment = new NewsListFragment();
        args.putInt("type", type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNewsPresenter = new NewsPresenterImpl(this);
        mType = getArguments().getInt("type");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_list, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_widget);
        swipeRefreshLayout.setColorSchemeColors(R.color.primary,
                R.color.primary_dark, R.color.primary_light,
                R.color.accent);
        swipeRefreshLayout.setOnRefreshListener(this);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new NewsAdapter(getActivity());
        mAdapter.setOnItemClickListener(mOnItemClickListener);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnScrollListener(mOnScrollListener);
        onRefresh();
        return view;
    }

    private NewsAdapter.OnItemClickListener mOnItemClickListener = new NewsAdapter.OnItemClickListener() {
        @Override
        public void OnItemClick(View view, int position) {
            Intent intent = new Intent(getActivity(), Main2Activity.class);
         /*   View transitionView = view.findViewById(R.id.ivNews);
            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
                            transitionView, getString(R.string.transition_news_img));
            ActivityCompat.startActivity(getActivity(), intent, options.toBundle());*/
            startActivity(intent);
        }
    };
    public RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        private int lastVisibleItem;

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastVisibleItem = mLayoutManager.findLastVisibleItemPosition();
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == RecyclerView.SCROLL_STATE_IDLE
                    && lastVisibleItem + 1 == mAdapter.getItemCount()
                    && mAdapter.isShowFooter()) {
                //加载更多
                LogUtils.d("TAG", "loading more data");
                mNewsPresenter.loadList(mType, pageIndex + Urls.PAZE_SIZE);
            }
        }
    };

    @Override
    public void showProgress() {
        swipeRefreshLayout.setRefreshing(true);

    }

    @Override
    public void addNews(List<NewsBean.T1348647909107Bean> newsList) {
        mAdapter.isShowFooter(true);
        if (mData == null) {
            mData = new ArrayList<NewsBean.T1348647909107Bean>();
        }
        mData.addAll(newsList);
        if (pageIndex == 0) {
            mAdapter.setmDate(mData);
        } else {
            //如果没有更多数据了,则隐藏footer布局
            if (newsList == null || newsList.size() == 0) {
                mAdapter.isShowFooter(false);
            }
            mAdapter.notifyDataSetChanged();
        }
        pageIndex += Urls.PAZE_SIZE;
    }


    @Override
    public void hideProgress() {
        swipeRefreshLayout.setRefreshing(false);

    }
    @Override
    public void showLoadFailMsg() {
        Toast.makeText(getContext(), "shibai", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRefresh() {
        pageIndex = 0;
        if (mData != null) {
            mData.clear();
        }
        Log.i("type", "" + mType);
        mNewsPresenter.loadList(mType, pageIndex);
    }
}
