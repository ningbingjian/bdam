package com.bdam.web.backend.entity;

/**
 * Created by zhaoshufen
 * User:  zhaoshufen
 * Date: 2017/9/23
 * Time: 9:40
 * To change this setting on:Preferences->editor->File and Code Templates->Include->File Header
 */
public class HdfsFileInfo {
    private String path;
    private long length;
    private boolean isdir;
    private short replication;
    private long blocksize;
    private long modificationTime;
    private long accessTime;
    private String permission;
    private String owner;
    private String group;
    private String symlink;
    private String name;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public boolean isIsdir() {
        return isdir;
    }

    public void setIsdir(boolean isdir) {
        this.isdir = isdir;
    }

    public short getBlock_replication() {
        return replication;
    }

    public void setReplication(short replication) {
        this.replication = replication;
    }

    public long getBlocksize() {
        return blocksize;
    }

    public void setBlocksize(long blocksize) {
        this.blocksize = blocksize;
    }

    public long getModification_time() {
        return modificationTime;
    }

    public void setModificationTime(long modificationTime) {
        this.modificationTime = modificationTime;
    }

    public long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(long accessTime) {
        this.accessTime = accessTime;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSymlink() {
        return symlink;
    }

    public void setSymlink(String symlink) {
        this.symlink = symlink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HdfsFileInfo{" +
                "path='" + path + '\'' +
                ", length=" + length +
                ", isdir=" + isdir +
                ", replication=" + replication +
                ", blocksize=" + blocksize +
                ", modificationTime=" + modificationTime +
                ", accessTime=" + accessTime +
                ", permission=" + permission +
                ", owner='" + owner + '\'' +
                ", group='" + group + '\'' +
                ", symlink='" + symlink + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
