package com.bdam.web.backend.mvc.controller.hdfs;

import com.bdam.web.backend.dto.SplitPage;
import com.bdam.web.backend.entity.HdfsFileInfo;
import com.bdam.web.backend.mvc.service.HdfsService;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 9:51
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class HdfsController extends Controller{
    private HdfsService hdfsService = HdfsService.me;
    @ActionKey("/platform/hdfs/files")
    public void listFiles(){
        Ret ret = null ;
        SplitPage page = getBean(SplitPage.class,"splitPage");
        if(page == null){
            page = new SplitPage();
            page.setQueryParam(new HashMap());
            page.getQueryParam().put("path",".");
        }
        try{
            List<HdfsFileInfo> fileInfos = hdfsService.listFiles(".");
            page.setExtData(fileInfos);
            ret = Ret.ok();
        }catch (IOException ex){
            ret = Ret.fail("error",ex.getMessage());
        }catch (Exception ex){
            ret = Ret.fail("error",ex.getMessage());
            ex.printStackTrace();
        }
        ret.set("data",page);
        setAttr("ret",ret);
        render("/platform/file-manager/list.html");
    }

}
