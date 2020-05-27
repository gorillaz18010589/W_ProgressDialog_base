package com.example.progressdialog;
//自訂自己的ProgressBar

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CustomProgressBar extends ProgressBar {
    public CustomProgressBar(Context context) {
        super(context);
        this.setIndeterminate(true);
        //改變Progress圈圈顏色
        this.getIndeterminateDrawable().
                setColorFilter(getResources().getColor(R.color.colorRed), PorterDuff.Mode.MULTIPLY);
    }

    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.getIndeterminateDrawable().setColorFilter(getResources().getColor(R.color.colorRed), PorterDuff.Mode.MULTIPLY);
    }


}


