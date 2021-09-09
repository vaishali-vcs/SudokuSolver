package com.example.sudokusolverapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class SudokuBoard extends View {

    private final int boardColor;

    public SudokuBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SudokuBoard, 0, 0);

        try
        {
            boardColor = array.getInteger(R.styleable.SudokuBoard_boardColor, 0);
        }
        finally
        {
            array.recycle();
        }
    }
}
