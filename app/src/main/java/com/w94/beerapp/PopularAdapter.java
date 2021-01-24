package com.w94.beerapp;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.w94.beerapp.model.Popular;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder> {

    private Context context;
    private List<Popular> popularList;



    public static class PopularViewHolder extends RecyclerView.ViewHolder{

        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
