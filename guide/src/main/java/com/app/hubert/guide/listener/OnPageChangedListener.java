package com.app.hubert.guide.listener;

import com.app.hubert.guide.core.Controller;

/**
 * Created by hubert on 2017/11/16.
 * <p>
 * 引导页改变的监听
 */

public interface OnPageChangedListener {
    /**
     * @param page 当前引导页的position，第一页为0
     */
    void onPageChanged(int page,Controller controller);
}
