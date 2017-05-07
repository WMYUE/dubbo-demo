package com.zhihao.miao.common.util.dfs;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;



/**
 *
 * @描述: FastDFS测试 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-3-29,下午8:11:36 .
 * @版本号: V1.0 .
 */
public class FastDFSTest {

    /**
     * 上传测试.
     * @throws Exception
     */
    public static void upload() throws Exception {
        String filePath = "/Users/naeshihiroshi/test/liuyifei.jpeg";
        File file = new File(filePath);
        String fileId = FastDFSClient.uploadFile(file, filePath);
        System.out.println("Upload local file " + filePath + " ok, fileid=" + fileId);
    }

    /**
     * 下载测试.
     * @throws Exception
     */
    public static void download() throws Exception {
        String fileId = "group1/M00/00/00/wKgBcFkGl9KAfmeSAAL0rSpqoVo93.jpeg";
        InputStream inputStream = FastDFSClient.downloadFile(fileId);
        File destFile = new File("/Users/naeshihiroshi/Desktop/liuyifei.jpeg");
        FileUtils.copyInputStreamToFile(inputStream, destFile);
    }

    /**
     * 删除测试
     * @throws Exception
     */
    public static void delete() throws Exception {
        String fileId = "group1/M00/00/00/wKgBcFkGluCAYSjVAAL0rSpqoVo87.jpeg";
        int result = FastDFSClient.deleteFile(fileId);
        System.out.println(result == 0 ? "删除成功" : "删除失败:" + result);
    }



    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //upload();
        //download();
        //delete();

    }

}
