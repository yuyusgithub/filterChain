package com.yuyu.filterChain;

/**
 * Created by yuyu on 2017/7/5.
 */
public interface Filter {

    void doFilter(Request request,Response response,FilterChain chain);
}
