package pl.szkolenia.comarch;

import org.apache.commons.codec.digest.DigestUtils;

public class Main3 {
    public static void main(String[] args) {
        String hash = DigestUtils.md5Hex("abc");

        System.out.println(hash);
    }
}
