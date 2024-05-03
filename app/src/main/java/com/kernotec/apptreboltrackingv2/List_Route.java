package com.kernotec.apptreboltrackingv2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class List_Route extends AppCompatActivity {

    List<Route_List> routes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_route);
        init();
    }
    public void init(){
        routes = new ArrayList<>();
        routes.add(new Route_List("#377463","1","RT-001","en 200 metros"));
        routes.add(new Route_List("#377463","1","RT-001","en 200 metros"));
        routes.add(new Route_List("#377463","1","RT-001","en 200 metros"));
        routes.add(new Route_List("#377463","1","RT-001","en 200 metros"));
        ListAdapter listAdapter = new ListAdapter(routes,this);
        RecyclerView recyclerView = findViewById(R.id.ListRecycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}