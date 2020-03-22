package com.das.fragment_recyclerview_android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.das.fragment_recyclerview_android.Adapter.RecyclerViewAdapter;
import com.das.fragment_recyclerview_android.Model.Contact;
import com.das.fragment_recyclerview_android.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View view;
    private RecyclerView myRecyclerView;
    private List<Contact> lstContact;


    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_fragment, container, false);
        myRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Tomalika", "0178348574", R.drawable.girl));
        lstContact.add(new Contact("Paroma", "0150083485", R.drawable.girl));
        lstContact.add(new Contact("Doctor", "0178348574", R.drawable.doctor));
        lstContact.add(new Contact("Tapu", "0150083485", R.drawable.boy));
        lstContact.add(new Contact("Tomalika", "0178348574", R.drawable.girl));
        lstContact.add(new Contact("Paroma", "0150083485", R.drawable.girl));
        lstContact.add(new Contact("Doctor", "0178348574", R.drawable.doctor));
        lstContact.add(new Contact("Tapu", "0150083485", R.drawable.boy));
        lstContact.add(new Contact("Tomalika", "0178348574", R.drawable.girl));
        lstContact.add(new Contact("Paroma", "0150083485", R.drawable.girl));
        lstContact.add(new Contact("Doctor", "0178348574", R.drawable.doctor));
        lstContact.add(new Contact("Tapu", "0150083485", R.drawable.boy));


    }
}
