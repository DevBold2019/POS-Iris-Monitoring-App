package com.example.posmob.Adapter_Classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.posmob.Model_Classes.TransactionTypeModelClass;
import com.example.posmob.R;

import java.util.List;

public class TransactionTypeAdapterClass  extends RecyclerView.Adapter<TransactionTypeAdapterClass.viewholder> {

    List<TransactionTypeModelClass>list;
    Context context;

    public TransactionTypeAdapterClass(List<TransactionTypeModelClass> list, Context context) {

        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public TransactionTypeAdapterClass.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_type_layout,parent,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionTypeAdapterClass.viewholder holder, int position) {

        TransactionTypeModelClass modelClass=list.get(position);

        holder.t1.setText(modelClass.getCreateddate());
        holder.t2.setText(modelClass.getTransactiontype());
        holder.t3.setText(modelClass.getDescription());
        holder.t4.setText(modelClass.getCode());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView t1,t2,t3,t4;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.createdAtTextView);
            t2=itemView.findViewById(R.id.transactionTypeTextView);
            t3=itemView.findViewById(R.id.DescriptionTextView);
            t4=itemView.findViewById(R.id.codeTextView);




        }
    }
}
