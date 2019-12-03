package com.landasoft.demo.springboot.hadoop.springboothadoop.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.*;

public class HdfsClient {
	
	 // 配置对象
	private static Configuration Configuration = null;
	static {
		Configuration = new Configuration();
	}
	
	/**
	 * 获取HDFS文件系统
	 * 
	 * @return org.apache.hadoop.fs.FileSystem
	 */
	public static FileSystem getFileSystem() throws IOException {
		
		return FileSystem.get(Configuration);
	}
   
	//根据目录查询下级文件
	public static void listFiles(String path) throws Exception {
		System.setProperty("HADOOP_USER_NAME", "hdfs");
		FileSystem fileSystem = getFileSystem();
		FileStatus[] fileStatuses = fileSystem.listStatus(new Path(path));
		for (FileStatus fileStatus : fileStatuses) {
			System.out.println("修改时间:"+fileStatus.getModificationTime() + "是否为目录:"+fileStatus.isDirectory()+"所属组:"+fileStatus.getGroup()+"块大小:"+fileStatus.getBlockSize()+"长度:"+fileStatus.getLen()+"权限:"+fileStatus.getPermission().toString()+"文件路径:"+fileStatus.getPath().toString()+"所属用户:"+fileStatus.getOwner());
		}
		fileSystem.close();
   }
   
   //判断文件是否存在
   public static boolean exits(String path) throws Exception {
	   	System.setProperty("HADOOP_USER_NAME", "hdfs");
	   	FileSystem fileSystem = getFileSystem();
	   
		return fileSystem.exists(new Path(path));
	}

   //读取文件为二进制
   public static byte[] readFile(String filePath) throws Exception {
	   	System.setProperty("HADOOP_USER_NAME", "hdfs");
		byte[] fileContent = null;
		FileSystem fs = getFileSystem();
		Path path = new Path(filePath);
		if (fs.exists(path)) {
			InputStream inputStream = null;
			ByteArrayOutputStream outputStream = null;
			try {
				inputStream = fs.open(path);
				outputStream = new ByteArrayOutputStream(inputStream.available());
				IOUtils.copyBytes(inputStream, outputStream, Configuration);
				fileContent = outputStream.toByteArray();
			} finally {
				IOUtils.closeStream(inputStream);
				IOUtils.closeStream(outputStream);
				fs.close();
			}
		}
		return fileContent;
   }
   
   
   public static void getFile (byte[] bytes, String filePath, String fileName) {
       BufferedOutputStream bos = null;
       FileOutputStream fos = null;
       File file = null;
       try {
           File dir = new File(filePath);
           
           if (!dir.exists()) {
        	   dir.mkdirs();
           }
           file = new File(filePath + "\\" + fileName);
           fos = new FileOutputStream(file);
           bos = new BufferedOutputStream(fos);
           bos.write(bytes);
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           if (bos != null) {
               try {
                   bos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if (fos != null) {
               try {
                   fos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }
   
   //预览图片
   public static void showImg(byte[] bytes,String fileName) throws Exception {
	   
	   new ImageClient(bytes,fileName); 
   }
   
   
   public static void main(String[] args) throws Exception {
	   
	   String hdfsPath = "/dzqz/4200002019006010011574405250/1-0017c6fd-9519-4167-aa35-cc51ad00ff90.JWF";
	   //检查文件是否存在
	   Boolean flag =  HdfsClient.exits(hdfsPath);
	   //获取hdfs文件信息
	   HdfsClient.listFiles(hdfsPath);
	   //下载文件
	   String filePath="D:/test";
	   //要生成文件的名字  如果知道文件类型和名字可以直接生成对应的文件 不知道则写成hdfs文件即可
//	   String fileName="1-0017c6fd-9519-4167-aa35-cc51ad00ff90.JWF";
       String fileName="test.png";
       
       //下载文件
	   if(flag) {
		   HdfsClient.getFile( HdfsClient.readFile(hdfsPath),filePath,fileName);
	   }
	   
	   //如果是图片 图片预览
	   HdfsClient.showImg(HdfsClient.readFile(hdfsPath),fileName);
	   
   }
}
