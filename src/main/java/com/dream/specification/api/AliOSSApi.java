package com.dream.specification.api;

import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.dream.specification.constants.AliOSSContanst;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class AliOSSApi {

    AliOSSApi(OSS oss,String method,Map map){
        //创建OSS实例
        oss = new OSSClientBuilder().build(AliOSSContanst.endpoint,AliOSSContanst.accessKeyId,AliOSSContanst.accessKeySecret);

    }
    AliOSSApi(OSS oss,String method,Map map,ClientBuilderConfiguration conf){
        //设置参数创建ossClient
        oss = new OSSClientBuilder().build(AliOSSContanst.endpoint,AliOSSContanst.accessKeyId,AliOSSContanst.accessKeySecret,conf);
    }

    /**
     * 创建Bucket（存储空间）
     * @return
     */
    public static void createBucket(){

    }

    public static boolean upload(OSS oss){
        //创建OSS实例
//        OSS ossClient = new OSSClientBuilder().build(AliOSSContanst.endpoint,AliOSSContanst.accessKeyId,AliOSSContanst.accessKeySecret);
        //上传内容到指定的存储空间
        String context = "what's the matter?";
        oss.putObject(AliOSSContanst.bucketName,"my_first_file",new ByteArrayInputStream(context.getBytes()));
        oss.shutdown();
        return true;

    }


    /*public static void main(String[] args){
        upload();
    }*/

}
