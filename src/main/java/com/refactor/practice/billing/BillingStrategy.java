package com.refactor.practice.billing;

import com.refactor.practice.Movie;


import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 */
public class BillingStrategy {

    public static Map<Integer, BillingMethod> methodMap = new HashMap<>();

    public static BillingMethod getBillingMethod(int priceCode) {
        return methodMap.get(priceCode);
    }

    static {
        methodMap.put(Movie.REGULAR, new RegularMovieMethod());
        methodMap.put(Movie.CHILDRENS, new ChildrenMovieMethod());
        methodMap.put(Movie.NEW_RELEASE, new NewReleaseMovieMethod());
        // 新类型在此添加
    }
}
