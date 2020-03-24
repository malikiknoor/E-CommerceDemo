package com.iknoortech.e_commercedemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iknoortech.e_commercedemo.R;
import com.iknoortech.e_commercedemo.adapter.HomeCategoryAdapter;
import com.iknoortech.e_commercedemo.model.HomeCatePojo;

import java.util.ArrayList;

import static com.iknoortech.e_commercedemo.utils.AppConstant.ELECTRONICS_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.GROCERY_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.HOMEANDKITCHEN_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.LAPTOP_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.MAN_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.MOBILE_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.TVANDAPPLIENCES_CAT;
import static com.iknoortech.e_commercedemo.utils.AppConstant.WOMEN_CAT;


public class HomeFragment extends Fragment {

    private RecyclerView rv_category, rv_home;
    private HomeCategoryAdapter categoryAdapter;
    private ArrayList<HomeCatePojo> categoryList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rv_category = root.findViewById(R.id.recyclerView);
        rv_home = root.findViewById(R.id.recyclerView1);

        rv_category.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        rv_home.setLayoutManager(new LinearLayoutManager(getActivity()));

        categoryList = new ArrayList<>();
        categoryList.add(new HomeCatePojo(ELECTRONICS_CAT, "Electronics"));
        categoryList.add(new HomeCatePojo(MOBILE_CAT, "Mobiles"));
        categoryList.add(new HomeCatePojo(MAN_CAT, "Men's Fashion"));
        categoryList.add(new HomeCatePojo(WOMEN_CAT, "Women's Fashion"));
        categoryList.add(new HomeCatePojo(GROCERY_CAT, "Grocery"));
        categoryList.add(new HomeCatePojo(HOMEANDKITCHEN_CAT, "Home & Kitchen"));
        categoryList.add(new HomeCatePojo(LAPTOP_CAT, "Laptops"));
        categoryList.add(new HomeCatePojo(TVANDAPPLIENCES_CAT, "TVs & Appliances"));

        categoryAdapter = new HomeCategoryAdapter(getActivity(), categoryList);
        rv_category.setAdapter(categoryAdapter);

        return root;
    }
}