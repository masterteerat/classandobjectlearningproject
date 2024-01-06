package com.example.classmanagementv2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class MyPagerAdapter extends FragmentStateAdapter{

    private FragmentManager fm;
    private static final int anInt = 2;

    public MyPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                Fragment_A fragment_a = new Fragment_A();
                return fragment_a;
            case 1:
                Fragment_B fragment_b = new Fragment_B();
                return fragment_b;
            case 2:
                Fragment_C fragment_c = new Fragment_C();
                return fragment_c;


            default:
                return null;

        }
    }

    @Override public int getItemCount() {
        return anInt;
    }
}


