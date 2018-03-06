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


    SwipeRefreshLayout srl_tablon_refrescar;
    RelativeLayout RltContenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        srl_tablon_refrescar = (SwipeRefreshLayout) findViewById(R.id.srl_tablon_refrescar);
        srl_tablon_refrescar.setOnRefreshListener(refrescarTablon);
        RltContenedor = findViewById(R.id.mRlLy);
    }

    protected SwipeRefreshLayout.OnRefreshListener refrescarTablon = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Snackbar.make(RltContenedor,"Lost your FOX?",Snackbar.LENGTH_LONG).show();
            srl_tablon_refrescar.setRefreshing(false);
        }
    };
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_arriba,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opciones) {
            Toast.makeText(this, "Seleccionada opciones", Toast.LENGTH_LONG).show();
        } else if (id == R.id.papelera) {
            Toast.makeText(this, "Seleccionada cámara", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
