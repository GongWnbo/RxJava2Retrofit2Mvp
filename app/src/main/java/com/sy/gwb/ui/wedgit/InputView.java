package com.sy.gwb.ui.wedgit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/**
 * Created by GongWenBo on 2018/3/21.
 */

public class InputView extends View {

    private int COUNT = 9;
    private Paint   mPaint;
    private float   space;
    private Context mContext;

    public InputView(Context context) {
        this(context, null);
    }

    public InputView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public InputView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mPaint = new Paint();
        mPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        mContext = context;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        space = dp2px(5);
        float itemHeight = getHeight();
        float itemWidth = (width - space * (COUNT - 1)) / COUNT;
        float radius = dp2px(4);
        for (int i = 0; i < COUNT; i++) {
            mPaint.setColor(Color.BLACK);
            RectF rectF = new RectF();
            rectF.left = itemWidth * i + space * i;
            rectF.right = itemWidth * (i + 1) + space * i;
            rectF.top = 0;
            rectF.bottom = itemHeight;
            canvas.drawRoundRect(rectF, radius, radius, mPaint);
            mPaint.setColor(Color.RED);
            mPaint.setTextSize(sp2px(30));
            // 水平居中
            mPaint.setTextAlign(Paint.Align.CENTER);
            // 竖直居中
            Paint.FontMetrics fontMetrics = mPaint.getFontMetrics();
            float baseline = (itemHeight + 0 - fontMetrics.bottom - fontMetrics.top) / 2;
            canvas.drawText("1", itemWidth * i + itemWidth / 2 + space * i, baseline, mPaint);
        }
    }

    public float dp2px(float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, mContext.getResources().getDisplayMetrics());
    }

    public float sp2px(float sp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, mContext.getResources().getDisplayMetrics());
    }
}
