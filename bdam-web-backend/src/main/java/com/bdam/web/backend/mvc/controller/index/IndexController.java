package com.bdam.web.backend.mvc.controller.index;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 21:22
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class IndexController extends Controller {
    @ActionKey("/")
    public void index(){
        render("/platform/index.html");
    }
}
