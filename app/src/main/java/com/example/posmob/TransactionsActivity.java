package com.example.posmob;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class TransactionsActivity extends AppCompatActivity {


    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toogle;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        toolbar=findViewById(R.id.transactionToolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);

        navigationView=findViewById(R.id.transactionNavigation);
        drawerLayout=findViewById(R.id.transactionDrawer);

        toogle=new ActionBarDrawerToggle(TransactionsActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();




        //drawerLayout.closeDrawer(GravityCompat.START);



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent =new Intent(TransactionsActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
