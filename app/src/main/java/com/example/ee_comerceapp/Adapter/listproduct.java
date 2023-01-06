package com.example.ee_comerceapp.Adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ee_comerceapp.Data.Products;
import com.example.ee_comerceapp.R;

import java.util.ArrayList;

public class listproduct extends RecyclerView.Adapter<listproduct.listproductHolder> {

        ArrayList<Products> data;
        Activity activity;

public listproduct(ArrayList<Products> data, Activity activity) {
        this.data = data;
        this.activity = activity;
        }
@NonNull
@Override
public listproduct.listproductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(activity).inflate(R.layout.itemlist,parent,false);
        return new listproductHolder(root);
        }

@Override
public void onBindViewHolder(@NonNull listproduct.listproductHolder holder, int position) {
        holder.coffeeName.setText(data.get(position).getProduct_name());
        holder.product_details.setText(data.get(position).getProduct_details());
        holder.product_price.setText( data.get(position).getProduct_price());
        holder.product_id.setText(data.get(position).getProduct_id());

        Bitmap myimg = BitmapFactory.decodeByteArray(data.get(position).getCoffeimage(),0,data.get(position).getCoffeimage().length);
        holder.coffeeImage.setImageBitmap(myimg);
        }

@Override
public int getItemCount() {
        return data.size();
        }

public class listproductHolder extends RecyclerView.ViewHolder {

    TextView coffeeName,product_details,product_price,product_id;
    ImageView coffeeImage;
    public listproductHolder(@NonNull View itemView) {
        super(itemView);
        coffeeName = itemView.findViewById(R.id.coffeeName);
        product_details = itemView.findViewById(R.id.product_details);
        coffeeImage = itemView.findViewById(R.id.coffeeImage);
        product_price = itemView.findViewById(R.id.product_price);
        product_id = itemView.findViewById(R.id.product_id);
    }
}
}
