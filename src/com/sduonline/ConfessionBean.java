package com.sduonline;

/**
 * 这是表白部分的JavaBean部分
 *
 * @author
 * @date
 */

public class ConfessionBean {
    private int id;
    private String confessionObj;
    private String confessionContent;
    private String time;
    private String image;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getConfessionObj() {
        return confessionObj;
    }
    public void setConfessionObj(String confessionObj) {
        this.confessionObj = confessionObj;
    }
    public String getConfessionContent() {
        return confessionContent;
    }
    public void setConfessionContent(String confessionContent) {
        this.confessionContent = confessionContent;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
