package com.linc.ndklibrary;

/**
 * Created by John on 2016/5/30 0030.
 */
public class SecondLib {
    static {
        System.loadLibrary("SecondLib");
    }
    //int array
    public static native int[] intMethod();
    //string array
    public static native String[] stringMethod();
}
