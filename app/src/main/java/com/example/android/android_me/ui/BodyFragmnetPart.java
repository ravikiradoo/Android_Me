package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by CUBASTION on 15-02-2018.
 */

public class BodyFragmnetPart extends Fragment {

    public BodyFragmnetPart()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstance)
    {
        View rootView =inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView =(ImageView)rootView.findViewById(R.id.body_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;

    }
}
