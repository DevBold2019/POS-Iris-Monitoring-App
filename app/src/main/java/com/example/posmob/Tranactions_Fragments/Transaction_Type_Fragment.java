package com.example.posmob.Tranactions_Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.posmob.Adapter_Classes.TransactionTypeAdapterClass;
import com.example.posmob.Model_Classes.TransactionTypeModelClass;
import com.example.posmob.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Transaction_Type_Fragment extends Fragment {

    RecyclerView recyclerView;
    List<TransactionTypeModelClass>list;
    TransactionTypeAdapterClass adapterClass;
    TransactionTypeModelClass modelClass;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;

        view=inflater.inflate(R.layout.fragment_transaction__type_, container, false);

        recyclerView=view.findViewById(R.id.findTransactionTypeRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(false);

        list=new ArrayList<>();

        for (int i=0; i<=20; i++){

            modelClass =new TransactionTypeModelClass("description","Withdrawal","19/09/98","20035");
            modelClass =new TransactionTypeModelClass("description","Withdrawal","19/09/98","20035");
            modelClass =new TransactionTypeModelClass("description","Withdrawal","19/09/98","20035");
            modelClass =new TransactionTypeModelClass("description","Withdrawal","19/09/98","20035");

            list.add(modelClass);
        }


        adapterClass=new TransactionTypeAdapterClass(list,getContext());

        recyclerView.setAdapter(adapterClass);
        adapterClass.notifyDataSetChanged();










        return view;


    }

}
