package com.sy.gwb.net;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class RequestInterceptor implements Interceptor {

    private static final String VERSION = "V1.0";

    @Override
    public Response intercept(Chain chain) throws IOException {
        String[] sign = sign();
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();
//        builder.addHeader("version", VERSION);
//        builder.addHeader("randomNum", sign[0]);
//        builder.addHeader("sign", sign[1]);
        return chain.proceed(builder.build());
    }

    private static String[] sign() {
        String str1 = getRandomString(10);
        String str = VERSION + str1 + "zjqy20141229";
        return new String[]{str1, md5(str)};
    }

    private static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    private static String md5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {

            throw new RuntimeException("Huh, MD5 should be supported?", e);

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        }

        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10)
                hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }

}
