package com.example.posmob;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    CardView monitoring;
    CardView transactions;
    CardView inventory;
    CardView report;
    Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitoring=findViewById(R.id.monitoringcardview);
       transactions=findViewById(R.id.transactioncardview);
       inventory=findViewById(R.id.inventorycardview);
        report=findViewById(R.id.reportscardview);


        toolbar=findViewById(R.id.dashToolbar);
        setSupportActionBar(toolbar);






        monitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,MonitoringActivity.class);
                startActivity(intent);
                finish();
            }
        });


       transactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,TransactionsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,InventoryActivity.class);
                startActivity(intent);
                finish();
            }
        });


       report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,ReportsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate(R.menu.dash_menu,menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.dashLogout:

                Toast.makeText(getApplicationContext(),"Logging out ",Toast.LENGTH_LONG).show();
                System.exit(1);

            break;


        }


        return true;
    }
}
