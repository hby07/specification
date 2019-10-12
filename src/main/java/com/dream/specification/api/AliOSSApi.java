package com.dream.specification.api;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.dream.specification.constants.AliOSSContanst;

import java.io.ByteArrayInputStream;

public class AliOSSApi {



    public static boolean upload(){
        //创建OSS实例
        OSS ossClient = new OSSClientBuilder().build(AliOSSContanst.endpoint,AliOSSContanst.accessKeyId,AliOSSContanst.accessKeySecret);
        //上传内容到指定的存储空间
        String context = "what's the matter?";
        ossClient.putObject(AliOSSContanst.bucketName,"my_first_file",new ByteArrayInputStream(context.getBytes()));
        ossClient.shutdown();
        return true;

    }


    /*public static void main(String[] args){
        upload();
    }*/

}
