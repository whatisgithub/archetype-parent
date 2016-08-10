package com.qmcaifu.parent.form.base;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/10.
 */
public class BasePageForm implements Serializable {

    private int pageSize;

    private int startIndex;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
}
