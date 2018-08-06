package com.bumptech.glide.manager;

import android.arch.lifecycle.ViewModel;

import com.bumptech.glide.RequestManager;

/**
 * @author lixi
 * @description <>
 * @date 2018/7/2
 */
public class RequestManagerHolder extends ViewModel {


    private RequestManager mRequestManager;
    private RequestManagerTreeNode requestManagerTreeNode;

    public RequestManager getRequestManager() {
        return mRequestManager;
    }

    public void setRequestManager(RequestManager requestManager) {
        this.mRequestManager = requestManager;
    }

    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return requestManagerTreeNode;
    }
}
