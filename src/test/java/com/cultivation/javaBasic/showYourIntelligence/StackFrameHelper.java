package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement element = new Exception().getStackTrace()[1];
        return element.getClassName().concat(".").concat(element.getMethodName());
        // --end-->
    }
}
