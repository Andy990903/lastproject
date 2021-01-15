package entity;

import java.util.Date;

public class MessageBean {
    private int mid;
    private String mcontent;
    private Date publish;

    public MessageBean(String mcontent,  Date publish) {

        this.mcontent = mcontent;
        this.publish = publish;
    }

    public MessageBean() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }
}
