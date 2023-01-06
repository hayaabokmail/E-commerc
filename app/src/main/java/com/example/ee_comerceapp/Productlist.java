package com.example.ee_comerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.ee_comerceapp.Adapter.listproduct;
import com.example.ee_comerceapp.Data.Products;

import java.util.ArrayList;

public class Productlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);
        RecyclerView rvproducts = findViewById(R.id.rcview);

        ArrayList<Products> mydata = new ArrayList<Products>();

        listproduct adapter = new listproduct(mydata,Productlist.this);
        RecyclerView.LayoutManager mymanager = new LinearLayoutManager(getApplicationContext());
        rvproducts.setAdapter(adapter);
        rvproducts.setLayoutManager(mymanager);
    }
}