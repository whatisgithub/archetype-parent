package com.qmcaifu.parent.form;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/10.
 */
public class DemoUserForm implements Serializable {


    private String name;
    private String age;
    private String sex;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

