package com.example.admin.mvp_retrofit_rxjava.main;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.admin.mvp_retrofit_rxjava.R;

/**
 * Description : 图片加载工具类
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/21
 */
public class ImageLoaderUtils {

    public static void display(Context context, ImageView imageView, String url, int placeholder, int error) {
        if(imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(context).load(url).placeholder(placeholder)
                .error(error).crossFade().into(imageView);
    }

    public static void display(Context context, ImageView imageView, String url) {
        if(imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
       /* Glide.with(context).load(url).placeholder(R.drawable)
                .error(R.drawable.ic_image_loadfail).crossFade().into(imageView);*/
        Glide.with(context).load(url).placeholder(R.mipmap.ic_image_loading).error(R.mipmap.ic_image_loadfail)
                .crossFade().into(imageView);
    }


}