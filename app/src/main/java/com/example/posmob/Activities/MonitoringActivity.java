package com.example.posmob.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.example.posmob.R;

import java.util.Objects;


public class MonitoringActivity extends AppCompatActivity {

    Toolbar toolbar;
    ActionBarDrawerToggle toogle;
    DrawerLayout drawerLayout;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring);


        drawerLayout=findViewById(R.id.monitoringDrawer);
        toolbar=findViewById(R.id.monitoringToolbar);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);

        toogle=new ActionBarDrawerToggle(MonitoringActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        toogle.syncState();
        drawerLayout.addDrawerListener(toogle);



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent =new Intent(MonitoringActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
