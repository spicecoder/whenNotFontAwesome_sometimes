package com.pronabpal.fontawesome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;

public class IconTextView extends android.support.v7.widget.AppCompatTextView {

    private Context context;

    public IconTextView(Context context) {
        super(context);
        this.context = context;
        createView();
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        createView();
    }

  private void createView(){
   setGravity(Gravity.CENTER);
  // setTypeface("FontAwesome.otf", context));
  }
}