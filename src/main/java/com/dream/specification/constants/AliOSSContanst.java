package com.dream.specification.constants;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class AliOSSContanst {
    public static ResourceBundle bundle = PropertyResourceBundle.getBundle("conf/aliOSS");

    public static final String endpoint = bundle.getString("endpoint");
    public static final String accessKeyId = bundle.getString("accessKeyId");
    public static final String accessKeySecret = bundle.getString("accessKeySecret");
    public static final String bucketName = bundle.getString("bucketName");
}
