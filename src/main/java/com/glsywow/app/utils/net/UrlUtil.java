package com.glsywow.app.utils.net;

import java.io.UnsupportedEncodingException;

/**
 * url转码、解码
 */
public class UrlUtil {
    private final static String ENCODE = "UTF-8";
    /**
     * URL 解码
     */
    public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLDecoder.decode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * URL 转码
     */
    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     */
    public static void main(String[] args) {
        String str = "%7b";
//        System.out.println(getURLEncoderString(getURLEncoderString(str)));
//        System.out.println(getURLDecoderString("%25B3%25C2%25B6%25A6"));
        System.out.println(getURLDecoderString(getURLDecoderString(str)));

    }

}