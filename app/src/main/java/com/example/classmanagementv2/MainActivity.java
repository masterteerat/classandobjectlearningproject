package com.example.classmanagementv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragment, new BaseFragment())
                    .commit();
        }
        GlobalVar.mainActivityContext = MainActivity.this;
        initDataCart();
        initDataOrdered();
    }
    private void initDataCart() {
        for (int i = 0; i < GlobalVar.cart.length; i++) {
            GlobalVar.cart[i] = new DataProductLine("0", R.drawable.school_logo, "", 0, 0.0, 0.0, "");
        }
    }
    private void initDataOrdered() {
        for (int i = 0; i < GlobalVar.cart.length; i++) {
            GlobalVar.Ordered[i] = new DataProductLine("0", R.drawable.school_logo, "", 0, 0.0, 0.0, "");
        }
    }

}