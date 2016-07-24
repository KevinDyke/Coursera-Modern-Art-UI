package com.kevinjdyke.modernartui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.widget.SeekBar;

import java.util.Random;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    public MainActivityFragment() {
    }

    // each rectangle is displayed as a view
    private View mView1, mView2, mView3, mView4, mView5,mView6, mView7, mView8, mView9;
    private SeekBar mSeekBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // define each of the views and assign each one a random background colour
        mView1 = (View) rootView.findViewById(R.id.view1);
        defineColor(mView1);

        mView2 = (View) rootView.findViewById(R.id.view2);
        defineColor(mView2);

        mView3 = (View) rootView.findViewById(R.id.view3);
        defineColor(mView3);

        mView4 = (View) rootView.findViewById(R.id.view4);
        defineColor(mView4);

        mView5 = (View) rootView.findViewById(R.id.view5);
        defineColor(mView5);

        mView6 = (View) rootView.findViewById(R.id.view6);
        defineColor(mView6);

        mView7 = (View) rootView.findViewById(R.id.view7);
        defineColor(mView7);

        mView8 = (View) rootView.findViewById(R.id.view8);
        defineColor(mView8);

        mView9 = (View) rootView.findViewById(R.id.view9);
        defineColor(mView9);

        // set up the slider
        mSeekBar = (SeekBar) rootView.findViewById(R.id.seek_bar);
        mSeekBar.setOnSeekBarChangeListener(this);
        mSeekBar.setBackgroundColor(Color.BLUE);

        return rootView;
    }

    private void changeColor(View view,int change)
    {
        // get the background colour of the view from the view's tag
        int color = (int)view.getTag();
        color += change; // change the colour by adding in the progress from the slider
        view.setBackgroundColor(color); // set the new background colour
    }

    private void defineColor(View view)
    {
        final Random r = new Random();

        int red = r.nextInt(255)+1;            // create the red potion of the colour
        int blue = r.nextInt(255)+1;           // create the blue potion of the colour
        int green = r.nextInt(255)+1;          // create the green potion of the colour
        int color = Color.rgb(red,blue,green); // create the colour using the rgb parts
        view.setBackgroundColor(color);           // set the view's background colour
        view.setTag(color);                       // store the background colour using the view's tag
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {

        // change the colour by adding and subtracting the position of the slider
        // for each of the views
        changeColor(mView1,  progress);
        changeColor(mView2,  progress);
        changeColor(mView3,  progress);
        changeColor(mView4,  progress);
        changeColor(mView5,  progress);
        changeColor(mView6,  progress);
        changeColor(mView7,  progress);
        changeColor(mView8,  progress);
        changeColor(mView9,  progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }
}
