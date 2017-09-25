package com.bdam.web.backend.jfinal;

import com.bdam.web.backend.mvc.controller.hdfs.HdfsController;
import com.bdam.web.backend.mvc.controller.index.IndexController;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 9:49
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class JFinalConfig extends com.jfinal.config.JFinalConfig{
    public static void main(String[] args) {
        JFinal.start("bdam-web-backend/src/main/webapp",8080,"/");
    }
    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/platform/hdfs", HdfsController.class);
        routes.add("/platform/index", IndexController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
