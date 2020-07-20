package com.app.hubert.guide.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {

    private OnScrollChangeListener scrollChangeListener = null;

    public ObservableScrollView(Context context) {
        super(context);
    }

    public ObservableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ObservableScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setScrollViewListener(OnScrollChangeListener onScrollChangeListener) {
        this.scrollChangeListener = onScrollChangeListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        if (getScrollY() +getHeight() -
               getPaddingTop() -getPaddingBottom()
                ==getChildAt(0).getHeight()) {//判断滑动到底部
            if (scrollChangeListener != null) {
                scrollChangeListener.onScrollBottom();
            }
        }else {
            super.onScrollChanged(x,y,oldx,oldy);
        }

    }

    public interface OnScrollChangeListener {
        void onScrollBottom();
    }
}
