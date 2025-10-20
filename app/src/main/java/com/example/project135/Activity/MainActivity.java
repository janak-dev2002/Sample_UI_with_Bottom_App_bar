package com.example.project135.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project135.Adapter.TrendsAdapter;
import com.example.project135.Domain.TrendsDomain;
import com.example.project135.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView.Adapter mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, 0, systemBars.right, 0);
//            return insets;
//        });

        initRecyclerView();

        LinearLayout profileBtn = findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initRecyclerView(){

        ArrayList<TrendsDomain> items = new ArrayList<>();

        items.add(new TrendsDomain("Future in AI", "Overview of upcoming AI trends and impact", "trends"));
        items.add(new TrendsDomain("Robotics Revolution", "Advances in robotics and automation", "trends2"));
        items.add(new TrendsDomain("Mobile Development", "Android, Kotlin and cross-platform updates", "trends"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        mAdapter = new TrendsAdapter(items);
        recyclerView.setAdapter(mAdapter);


    }
}