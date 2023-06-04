/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cachecleaner.model;

import java.io.Serializable;

/**
 *
 * @author max
 */
public class Database implements Serializable {
    private String name;
    private String localPath;
    private String roamingPath;

    public Database(String name, String roamingPath, String localPath) {
        this.name = name;
        this.localPath = localPath;
        this.roamingPath = roamingPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getRoamingPath() {
        return roamingPath;
    }

    public void setRoamingPath(String roamingPath) {
        this.roamingPath = roamingPath;
    }
    
}
