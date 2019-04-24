package com.example.counter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CounterList {

    private final CounterAdapter mAdapter;


    public CounterList(RecyclerView rv){
        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
        mAdapter = new CounterAdapter();
        rv.setAdapter(new CounterAdapter());

    }




    public void setCounters(List<Counter> list){
        mAdapter.setData(list);


    }

    static class CounterAdapter extends RecyclerView.Adapter<CounterAdapter.Vh>{

        private List<Counter> mData;



        void setData(List<Counter> data){
            mData = data;
            notifyDataSetChanged();

        }
        @NonNull
        @Override
        public Vh onCreateViewHolder(@NonNull ViewGroup parent, int type) {
            return new Vh(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull Vh vh, int position) {

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        class Vh extends RecyclerView.ViewHolder{
            Vh(ViewGroup parent) {
                super(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.i_counter, parent, false));
            }
        }
    }



}
