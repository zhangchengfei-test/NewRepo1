package com.secret.Utils;

import java.security.MessageDigest;

public class MD5Utils {
    public String MD5(String sourceStr) {
        // md5
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] byteArray = sourceStr.getBytes("UTF-8");
            byte[] MD5Bytes = md5.digest(byteArray);
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < MD5Bytes.length; i++) {
                int val = ((int) MD5Bytes[i]) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
            String result = hexValue.toString().toUpperCase();
            return result;
        } catch (Exception e) {
            throw new RuntimeException("create signature failed", e);
        }
    }
}