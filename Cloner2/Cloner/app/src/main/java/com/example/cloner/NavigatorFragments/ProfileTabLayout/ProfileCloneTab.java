package com.example.cloner.NavigatorFragments.ProfileTabLayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cloner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileCloneTab extends Fragment {


    public ProfileCloneTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_clone_tab, container, false);
    }

}
