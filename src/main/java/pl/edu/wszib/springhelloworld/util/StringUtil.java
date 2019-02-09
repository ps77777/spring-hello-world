package pl.edu.wszib.springhelloworld.util;

import java.nio.charset.Charset;
import java.util.Random;

public class StringUtil {

    private StringUtil() {

    }

    public static String random() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

}
