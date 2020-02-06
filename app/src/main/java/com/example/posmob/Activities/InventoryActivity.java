package com.example.posmob.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import com.example.posmob.R;

import java.util.Objects;

public class InventoryActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toogle;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);


        toolbar=findViewById(R.id.InventoryToolbar);
        drawerLayout=findViewById(R.id.inventoryDrawer);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);

        toogle=new ActionBarDrawerToggle(InventoryActivity.this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.inventory_menu,menu);
        MenuItem search=menu.findItem(R.id.deviceSearch);
        SearchView searchView = (SearchView) search .getActionView();
        searchView.setQueryHint("Search Device");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                Toast.makeText(getApplicationContext(),"final Query\t"+query,Toast.LENGTH_LONG).show();

                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {

               // Toast.makeText(getApplicationContext(),""+s,Toast.LENGTH_LONG).show();
                return false;
            }
        });

        return true;


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent =new Intent(InventoryActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
