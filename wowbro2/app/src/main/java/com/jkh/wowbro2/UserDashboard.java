package com.jkh.wowbro2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.jkh.wowbro2.HomeAdapter.FeaturedAdapter;
import com.jkh.wowbro2.HomeAdapter.FeaturedHelperClass;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {
    ImageView imageView;
    RecyclerView featuredRecycler ;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //hooks
        featuredRecycler = findViewById(R.id.featured_recycler);

        featuredRecycler();

        imageView = findViewById(R.id.menu);
       imageView.setColorFilter(Color.parseColor("#FF665F5F"));


    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.yangrim4,"양림동 이야기"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.art1,"예술 이야기"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.yangrim4,"양림동 이야기"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.yangrim4,"양림동 이야기"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.yangrim4,"양림동 이야기"));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }
}