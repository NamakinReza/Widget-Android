package com.fardadweb.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

class WidgetUtils {

    public static <T extends TextView> void setFont(T view, Context context, int font) {
        switch (font) {
            case 0:
                view.setTypeface(Typeface.createFromAsset(context.getAssets(), FontDir.IRAN_SANS_NORMAL.mFont));
                break;

            case 1:
                view.setTypeface(Typeface.createFromAsset(context.getAssets(), FontDir.IRAN_SANS_BOLD.mFont));
                break;

            case 2:
                view.setTypeface(Typeface.createFromAsset(context.getAssets(), FontDir.IRAN_SANS_BIG.mFont));
                break;
        }
    }

    private enum FontDir {
        FONT_MAIN_PATH("Font/"),
        IRAN_SANS_NORMAL(FONT_MAIN_PATH.mFont + "iransans1.ttf"),
        IRAN_SANS_BOLD(FONT_MAIN_PATH.mFont + "iransans2.ttf"),
        IRAN_SANS_BIG(FONT_MAIN_PATH.mFont + "iransans3.ttf");

        String mFont;

        FontDir(String mFont) {
            this.mFont = mFont;
        }
    }
}
