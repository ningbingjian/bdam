package com.bdam.web.backend.mvc.service;

import com.bdam.web.backend.entity.HdfsFileInfo;
import com.bdam.web.backend.util.DFSUtil;
import com.bdam.web.backend.util.FileSystemFactory;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 9:36
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */

public class HdfsService {
    public static HdfsService me = new HdfsService();
    public List<HdfsFileInfo> listFiles(String path) throws  IOException{
        FileSystem fs = FileSystemFactory.get();
        DFSUtil dfsUtil = new DFSUtil(fs);
        FileStatus [] fileStatuses = null;
        List<HdfsFileInfo> fileInfos = new ArrayList<>();
        try{
            fileStatuses = dfsUtil.listStatus(path);
            if(fileStatuses != null){
                for(FileStatus status : fileStatuses){
                    fileInfos.add(toFileInfo(status));
                }
            }
            return fileInfos;
        }catch (IOException ex){
            throw ex;
        }
    }

    private HdfsFileInfo toFileInfo(FileStatus status) throws IOException {
        HdfsFileInfo fileInfo = new HdfsFileInfo();
        fileInfo.setPath(status.getPath().toString());
        fileInfo.setLength(status.getLen());
        fileInfo.setIsdir(status.isDirectory());
        fileInfo.setReplication(status.getReplication());
        fileInfo.setBlocksize(status.getBlockSize());
        fileInfo.setModificationTime(status.getModificationTime());
        fileInfo.setAccessTime(status.getAccessTime());
        fileInfo.setPermission(status.getPermission().toString());
        fileInfo.setOwner(status.getOwner());
        fileInfo.setGroup(status.getGroup());
        fileInfo.setSymlink(status.isSymlink()?status.getSymlink().toString():null);
        fileInfo.setName(status.getPath().getName());
        return fileInfo;
    }



}
