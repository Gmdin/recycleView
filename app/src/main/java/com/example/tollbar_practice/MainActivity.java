package com.example.tollbar_practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Toolbar toolbar;
        private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.action_tasks){
            Toast.makeText(this, "Task Clicked", Toast.LENGTH_SHORT).show();
        } else if(id==R.id.action_settings){
            Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.about){
            Toast.makeText(this, "Learn More Clicked", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.exit){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends f0 = new Friends(1,"Asad", 1980, "Giglgit",R.drawable.d);
        Friends f1 = new Friends(2,"Zubair", 1981, "Lahore",R.drawable.c);
        Friends f2 = new Friends(3,"Musa", 1980, "Quetta",R.drawable.b);
        Friends f3 = new Friends(4,"Nadeem",1987,"Peshawar",R.drawable.a);
        Friends f4 = new Friends(5,"Shahid", 1980, "Karachi",R.drawable.c);
        Friends f5 = new Friends(6,"Zia",1987,"Faisalabad ",R.drawable.a);
        Friends f6 = new Friends(7,"Badar", 1980, "Rawalpindi",R.drawable.d);
        Friends f7 = new Friends(8,"Hashim",1997,"Karachi",R.drawable.b);
        Friends f8 = new Friends(8,"Salman",1980,"Quetta",R.drawable.c);
        Friends f9 = new Friends(8,"Rizwan",1982,"Kasur",R.drawable.d);
        Friends f10 = new Friends(8,"Junaid",1977,"Islamabad",R.drawable.a);
        Friends f11 = new Friends(8,"Waseem",1967,"Rawalpindi",R.drawable.b);

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.myRecyclerView);

        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
}