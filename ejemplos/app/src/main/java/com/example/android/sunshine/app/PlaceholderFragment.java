package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by juanf on 29/08/2017.
 */

public  class PlaceholderFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Es necesario definir una información dummy para la prueba, por favor agregue
        String[] data = {
                getString(R.string.monday)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.tuesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.wednesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.thursday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.friday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.saturday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.sunny)+"- 2017/04/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.monday)+"- 2017/04/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.tuesday)+"- 2017/05/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.wednesday)+"- 2017/04/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.thursday)+"- 2017/05/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.friday)+"- 2017/05/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.saturday)+"- 2017/05/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.sunny)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.monday)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.tuesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.wednesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.thursday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.friday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.saturday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.sunny)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.monday)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.tuesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.wednesday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.thursday)+"- 2017/03/06 - " + getString(R.string.cloudy) + "- 24/7",
                getString(R.string.friday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.saturday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.sunny)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
                getString(R.string.saturday)+"- 2017/03/06 - " + getString(R.string.mist) + "- 24/7",
                getString(R.string.sunny)+"- 2017/03/06 - " + getString(R.string.sunny) + "- 24/7",
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));


        // Now that we have some dummy forecast data, create an ArrayAdapter.
        // The ArrayAdapter will take data from a source (like our dummy forecast) and
        // use it to populate the ListView it's attached to.
        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.list_item_forecast, // The name of the layout ID.
                        R.id.list_item_forecast_textview, // The ID of the textview to populate.
                        weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}