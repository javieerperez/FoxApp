package com.example.javie.foxapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    SwipeRefreshLayout mSwRellay;
    RelativeLayout RltContenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSwRellay = (SwipeRefreshLayout) findViewById(R.id.swRleLay);
        mSwRellay.setOnRefreshListener(refrescarVista);
        RltContenedor = findViewById(R.id.mRlLy);
    }

    protected SwipeRefreshLayout.OnRefreshListener refrescarVista = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Snackbar.make(RltContenedor,"Lost your FOX?",Snackbar.LENGTH_LONG).show();
            mSwRellay.setRefreshing(false);
        }
    };
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_arriba,menu);
        return true;
    }

}
