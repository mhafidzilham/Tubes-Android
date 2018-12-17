package com.example.hp.androideat.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hp.androideat.Interface.ItemClickListener;
import com.example.hp.androideat.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtOrderId, txtOrderStatus, txtOrderTable, txtOrderNote;
    private ItemClickListener itemClickListener;
    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderNote = (TextView)itemView.findViewById(R.id.order_note);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderTable = (TextView)itemView.findViewById(R.id.order_table);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(), false);

    }
}
