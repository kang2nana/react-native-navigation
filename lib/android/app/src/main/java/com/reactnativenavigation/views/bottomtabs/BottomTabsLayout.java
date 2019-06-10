package com.reactnativenavigation.views.bottomtabs;

import android.content.Context;

import com.reactnativenavigation.R;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class BottomTabsLayout extends CoordinatorLayout {
    public BottomTabsLayout(Context context) {
        super(context);
    }

    public int getBottomTabsHeight() {
        return findViewById(R.id.bottomTabs).getHeight();
    }
}
