package com.example.hw5_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw5_m3.databinding.FragmentContactsBinding;

import java.util.ArrayList;


public class ContactsFragment extends Fragment {

    private FragmentContactsBinding binding;
    private ArrayList<Contacts> contacts = new ArrayList<>();
    private ContactsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ContactsAdapter(contacts, this);
        binding.rv.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        contacts.add(new Contacts("John", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Mark", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Bob", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Jessy", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Mom", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Dad", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Jake", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("George", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Mia", "https://www.pinterest.com/pin/634022453822187655/"));
        contacts.add(new Contacts("Olivia", "https://www.pinterest.com/pin/634022453822187655/"));
    }
}