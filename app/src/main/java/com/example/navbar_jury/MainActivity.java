package com.example.navbar_jury;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.navbar_jury.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replacefragment(new suiveur());
        binding.BottomNavigationView.setOnItemSelectedListener(item -> {

            switch(item.getItemId()) {
                case R.id.suiveur:
                    replacefragment(new suiveur());
                    break;
                case R.id.junior:
                    replacefragment(new junior());
                    break;
                case R.id.tterrain:
                    replacefragment(new tterrain());
                    break;
                case R.id.autonome:
                    replacefragment(new autonome());
                    break;

            }




            return true;


        });
}
private void replacefragment(Fragment fragment) {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.body_container,fragment);
    fragmentTransaction.commit();


}

    }


