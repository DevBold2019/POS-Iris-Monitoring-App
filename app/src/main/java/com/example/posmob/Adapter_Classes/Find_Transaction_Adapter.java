package com.example.posmob.Adapter_Classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.posmob.Model_Classes.Find_Transaction_Model;
import com.example.posmob.R;

import java.util.List;

public class Find_Transaction_Adapter extends RecyclerView.Adapter<Find_Transaction_Adapter.viewholder> {

    List<Find_Transaction_Model>list;
    Context context;

    public Find_Transaction_Adapter(List<Find_Transaction_Model> list, Context context) {

        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public Find_Transaction_Adapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.find_transaction_layout,parent,false);






        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Find_Transaction_Adapter.viewholder holder, int position) {

        Find_Transaction_Model model=list.get(position);


        holder.t1.setText(model.getSerialNumber());
        holder.t2.setText(model.getDeviceOwner());
        holder.t3.setText(model.getModel());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView t1,t2,t3;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.desription);
            t2=itemView.findViewById(R.id.transaction);
            t3=itemView.findViewById(R.id.code);


        }
    }
}
