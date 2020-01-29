package com.example.posmob.Tranactions_Fragments;


import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.posmob.Adapter_Classes.Find_Transaction_Adapter;
import com.example.posmob.Model_Classes.Find_Transaction_Model;
import com.example.posmob.R;

import java.util.ArrayList;
import java.util.List;

/**
agment} subclass.
 */
public class Find_Transaction extends Fragment {

    RecyclerView recyclerView;
    List <Find_Transaction_Model> list;
    SearchView searchView;
    Find_Transaction_Adapter adapter;
    Find_Transaction_Model model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view=inflater.inflate(R.layout.fragment_find__transaction, container, false);

        list=new ArrayList<>();

        for (int i=0; i<=10; i++){

             model=new Find_Transaction_Model("hqhushuqhuqhu","qjqh1jh1jhjh1","w1wl1wl1wl","mqlwm1lmwl1mwl1w");
             model=new Find_Transaction_Model("hqhushuqhuqhu","qjqh1jh1jhjh1","w1wl1wl1wl","mqlwm1lmwl1mwl1w");
             model=new Find_Transaction_Model("hqhushuqhuqhu","qjqh1jh1jhjh1","w1wl1wl1wl","mqlwm1lmwl1mwl1w");

            list.add(model);

        }



        adapter=new Find_Transaction_Adapter(list,getContext());



        searchView=view.findViewById(R.id.findTransactionSearchView);
        recyclerView=view.findViewById(R.id.findTransactionRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {


                if (list.contains(s)){

                    Toast.makeText(getContext(),"Found a match"+"\tSUBMIT",Toast.LENGTH_LONG).show();


                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

              //  Toast.makeText(getContext(),""+s,Toast.LENGTH_LONG).show();

                if (list.contains(s)){

                    Toast.makeText(getContext(),"Found a match",Toast.LENGTH_LONG).show();


                }else{

                    Toast.makeText(getContext(),"Not found",Toast.LENGTH_LONG).show();

                }


                return false;
            }
        });
















        return view;
    }

}
