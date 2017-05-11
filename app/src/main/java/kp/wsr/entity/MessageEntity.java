package kp.wsr.entity;

/**
 * Created by HeBing on 2017/5/11 10:17
 */

public class MessageEntity {

    private int path;
    private String name;
    private String time;
    private String message;


    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
