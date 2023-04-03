package com.jetbrains.mavendemo.test;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;

/**
 * @author ximu
 * @date 2023/4/2
 * @Descripiton
 */
public class T {
    public static void main(String[] args) throws Exception {
        Long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        String secret = "SECe81cc8d7c8eba86a8bd32ce08b8f5bc6a5ff268818f0eca309725489ae17ebdc";

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
        System.out.println(sign);
    }
}
