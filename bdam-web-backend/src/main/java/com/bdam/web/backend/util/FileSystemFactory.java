package com.bdam.web.backend.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 15:36
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class FileSystemFactory {
    private static FileSystem defaultFs = null;
    static {
        try{
            defaultFs = FileSystem.get(new Configuration());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static FileSystem get(){
        return defaultFs;
     }
     public static FileSystem get(Configuration configuration) throws IOException{
        return FileSystem.get(configuration);
     }
}
