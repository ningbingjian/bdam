package com.bdam.web.backend.util;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 15:36
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class DFSUtil {
    private FileSystem fs ;
    public DFSUtil(FileSystem fs){
       this.fs = fs;
    }
    public FileStatus[] listStatus(String path)throws IOException{
        Path hdfsPath = new Path(path);
        return fs.listStatus(hdfsPath);
    }
}
