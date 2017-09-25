package com.bdam.web.backend.mvc;

import com.bdam.web.backend.entity.HdfsFileInfo;
import com.bdam.web.backend.mvc.service.HdfsService;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 16:36
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class HdfsServiceSuite {
    public static void main(String[] args) throws IOException {
        List<HdfsFileInfo> fileStatuses = HdfsService.me.listFiles(".");
        if(fileStatuses != null){
            for(HdfsFileInfo status :fileStatuses){
                System.out.println(status.toString());
            }
        }
    }
}
