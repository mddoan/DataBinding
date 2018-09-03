package com.mddoan.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mddoan.databinding.databinding.FragSimpleBinding;

public class FragmentSimpleDataBiding extends Fragment{
    private static final String STATE_NAME = "name";
    private String name;

    public static FragmentSimpleDataBiding newInstance(String name){
        FragmentSimpleDataBiding frag = new FragmentSimpleDataBiding();
        Bundle args = new Bundle();
        args.putString(STATE_NAME, name);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            name = savedInstanceState.getString(STATE_NAME);
        }else {
            name = getArguments() == null? "": getArguments().getString(STATE_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState){
        /**
         * The generated binding class name prefix FragSimple matches with the layout frag_simple
         */
        FragSimpleBinding binding = DataBindingUtil.inflate(inflater, R.layout
                .frag_simple, container, false);
        User user = new User(null);
        user.setUserName(name);
        binding.setUser(user);
        View root = binding.getRoot();
        return root;
    }
}
