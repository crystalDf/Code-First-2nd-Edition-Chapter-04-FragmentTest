package com.star.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(v -> {
//                replaceFragment(new AnotherRightFragment());
        });

//        replaceFragment(new RightFragment());
    }

    private void replaceFragment(Fragment fragment) {

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.right_layout, fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }
}
