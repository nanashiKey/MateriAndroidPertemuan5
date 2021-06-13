package com.irfandev.project.materiandroidpertemuan5.latihanrcview;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class Kota {
    private String title, subtitle;
    public Kota(){}
    public Kota(String title, String subtitle){
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle(){
        return  title;
    }
    public String getSubtitle(){
        return  subtitle;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setSubtitle(String subtitle){
        this.subtitle = subtitle;
    }
}
