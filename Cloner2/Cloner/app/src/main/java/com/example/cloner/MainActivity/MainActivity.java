package com.example.cloner.MainActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.cloner.NavigatorFragments.AddFragment;
import com.example.cloner.NavigatorFragments.HelpFragment;
import com.example.cloner.NavigatorFragments.HomeFragment;
import com.example.cloner.NavigatorFragments.ProfileFragment;
import com.example.cloner.NavigatorFragments.SettingsFragment;
import com.example.cloner.R;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment =null;
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    selectedFragment = new HomeFragment();
                    break;

                case R.id.navigation_profile:
                    selectedFragment = new ProfileFragment();
                    break;
                case R.id.navigation_add:
                    selectedFragment =new AddFragment();
                    break;
                case R.id.navigation_help:
                    selectedFragment=new HelpFragment();
                    break;
                case R.id.navigation_settings:
                    selectedFragment=new SettingsFragment();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.Main_Layout_Fragment, selectedFragment);
            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //homeframe loyout umu frame layout içerisine at
        transaction.replace(R.id.Main_Layout_Fragment, new HomeFragment());
        transaction.commit();
    }

}
