package com.sy.gwb.ui.wedgit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.sy.gwb.R;


/**
 * Created by GongWenBo on 2018/3/21.
 */

public class InputView extends View {

    private static final String TAG = "InputView";

    private Paint mPaint;
    private int count = 9;                // 个数
    private int     background;           // 背景颜色
    private float   strokeWidth;          // 线条粗细
    private int     strokeColor;          // 线条颜色
    private int     textColor;            // 字体颜色
    private float   textSize;             // 字体大小
    private float   space;                // 间距
    private boolean showRadius;           // 是否显示弧度
    private float   itemRadius;           // 条目的弧度
    private Canvas  mCanvas;
    float itemHeight;                     // 每个条目的高度
    float itemWidth;                      // 每个条目的宽度

    public InputView(Context context) {
        this(context, null);
    }

    public InputView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public InputView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // 初始化
        init(context, attrs);
        // 初始化画笔
        initPaint();
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.InputView);
        background = typedArray.getColor(R.styleable.InputView_InputViewBackground, Color.WHITE);
        strokeWidth = typedArray.getInteger(R.styleable.InputView_InputViewStrokeWidth, 1);
        strokeColor = typedArray.getColor(R.styleable.InputView_InputViewStrokeColor, Color.BLACK);
        textColor = typedArray.getColor(R.styleable.InputView_InputViewTextColor, Color.RED);
        textSize = typedArray.getDimension(R.styleable.InputView_InputViewTextSize, 20);
        textSize = sp2px(textSize);
        space = typedArray.getDimension(R.styleable.InputView_InputViewSpace, 4);
        space = dp2px(space);
        count = typedArray.getInteger(R.styleable.InputView_InputViewCount, 9);
        showRadius = typedArray.getBoolean(R.styleable.InputView_InputViewShowRadius, true);
        itemRadius = typedArray.getDimension(R.styleable.InputView_InputViewItemRadius, 4);
        itemRadius = dp2px(itemRadius);
        // 回收资源
        typedArray.recycle();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(strokeColor);
        // TODO: 2018/3/24 线条是否适配???
        mPaint.setStrokeWidth(strokeWidth);
        // 水平居中
        mPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // 测量模式
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        // 测量数据
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        // 根据模式获得数据
        width = getMeasure(widthMode, width, (int) dp2px(300));
        height = getMeasure(heightMode, height, (int) dp2px(40));
        setMeasuredDimension(width, height);
    }

    public int getMeasure(int mode, int measure, int defaultMeasure) {
        switch (mode) {
            case MeasureSpec.AT_MOST:
                return defaultMeasure;
            case MeasureSpec.EXACTLY:
            case MeasureSpec.UNSPECIFIED:
                return measure;
        }
        return measure;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        initCanvas(canvas);
        // 竖直居中
        Paint.FontMetrics fontMetrics = mPaint.getFontMetrics();
        for (int i = 0; i < count; i++) {
            // 绘制矩形
            drawRoundRect(itemWidth, itemHeight, i);
            // 绘制文字
            drawText(itemWidth, itemHeight, fontMetrics, i);
        }
    }

    public void initCanvas(Canvas canvas) {
        mCanvas = canvas;
        mCanvas.drawColor(background);
        float width = getWidth();
        itemHeight = getHeight();
        itemWidth = (width - space * (count - 1)) / count;
        Log.d(TAG, "view left=" + getLeft());
        Log.d(TAG, "view right=" + getRight());
        mPaint.setTextSize(textSize);
    }

    public void drawRoundRect(float itemWidth, float itemHeight, int num) {
        mPaint.setColor(strokeColor);
        RectF rectF = new RectF();
        rectF.left = itemWidth * num + space * num;
        rectF.right = itemWidth * (num + 1) + space * num;
        rectF.top = 0;
        rectF.bottom = itemHeight;
        if (showRadius) {
            mCanvas.drawRoundRect(rectF, itemRadius, itemRadius, mPaint);
        } else {
            mCanvas.drawRect(rectF, mPaint);
        }
        Log.d(TAG, "rect=" + rectF.right);
    }

    public void drawText(float itemWidth, float itemHeight, Paint.FontMetrics fontMetrics, int num) {
        mPaint.setColor(textColor);
        float x = itemWidth * num + itemWidth / 2 + space * num;
        float baseline = (itemHeight + 0 - fontMetrics.bottom - fontMetrics.top) / 2;
        // 设置阴影
        mPaint.setShadowLayer(1, 4, 4, Color.BLACK);
        mCanvas.drawText("1", x, baseline, mPaint);
        Log.d(TAG, "x=" + x);
    }

    public float dp2px(float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }

    public float sp2px(float sp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, getResources().getDisplayMetrics());
    }
}
