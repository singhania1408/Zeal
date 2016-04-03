package com.yalantis.guillotine.sample.Utils;

/**
 * Created by mrsinghania on 3/4/16.
 */
public class URL1 {
    static String basic_url="http://www.zealicon.in";
    public static String getRegisterURL()
    {
        return basic_url+"       ";
    }
    public static String getTokeURL()
    {
        return basic_url+"/csrf";
    }
}
