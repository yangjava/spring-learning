package com.spring.test;

import org.junit.Test;

import com.spring.placeholder.DESUtils;

/**
 */
public class DESUtilsTest {

    private String[] originStr = {"root", "admin", "123", "test", "123456"};
    private String[] encodeStr = {"NBZNo/zogYE=", "9lhg6rj552U="};

    @Test
    public void testEncode() {
        int index = 0;
        for (String str : originStr) {
            System.out.println("Encode: " + str + " -> " + DESUtils.getEncryptString(str));
        }
    }

    @Test
    public void testDecode() {
        int index = 0;
        for (String str : encodeStr) {
            System.out.println("Decode: " + str + " -> " + DESUtils.getDecryptString(str));
        }
    }

    @Test
    public void testEncodeAndDecode() {
        testEncode();
        testDecode();
    }

}
