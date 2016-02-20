package com.course.example;


import android.app.Activity;
import android.os.Bundle;

public class LayoutDemo extends Activity {
    /** demonstrates several layouts */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_linearlayout);
        //setContentView(R.layout.main_relative);
        //setContentView(R.layout.main_gridlayout);
        //setContentView(R.layout.main_tablelayout);
        //setContentView(R.layout.main_equalcolumn);
        //setContentView(R.layout.main_scrollview);
        //setContentView(R.layout.main_absolutelayout);
    }
}