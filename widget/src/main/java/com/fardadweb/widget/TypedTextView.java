package com.fardadweb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TypedTextView extends AppCompatTextView {
    public static final int IRANSANS_NORMAL = 0;
    public static final int IRANSANS_BOLD = 1;
    public static final int IRANSANS_BIG = 2;

    private int mFont;

    public TypedTextView(Context context) {
        this(context, null);
    }

    public TypedTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TypedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.TypedTextView, defStyleAttr, 0);

        if (typedArray.hasValue(R.styleable.TypedTextView_font)) {
            mFont = typedArray.getInt(R.styleable.TypedTextView_font, 0);
            WidgetUtils.setFont(this, getContext(), mFont);
        }

        typedArray.recycle();
    }

    public void setFont(int font) {
        if (font != mFont) {
            mFont = font;
            WidgetUtils.setFont(this, getContext(), mFont);
        }
    }

    public int getFont() {
        return mFont;
    }

}
