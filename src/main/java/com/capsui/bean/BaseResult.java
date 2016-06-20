package com.capsui.bean;

import java.io.Serializable;
/**
 * Created by qiao on 2016/6/17.
 */
public class BaseResult implements Serializable {

    private int errcode;
    private String errmsg;
    private long msgid;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public long getMsgid() {
        return msgid;
    }

    public void setMsgid(long msgid) {
        this.msgid = msgid;
    }
}
