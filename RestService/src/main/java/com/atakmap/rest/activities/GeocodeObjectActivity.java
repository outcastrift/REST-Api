package com.atakmap.rest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.*;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.*;
import android.widget.Toolbar;
import com.atakmap.rest.service.R;
import com.atakmap.rest.base.App;


/**
 * Demonstrates how to make a JSON Object request
 */
public class GeocodeObjectActivity extends AppCompatActivity
{
    private static final String sTag = "tagTwo";

    private ProgressBar mProgressBar;
    private LinearLayout mContent, mErrorView;
    private TextView mTitle, mBody, mSecondTitle, mSecondBody;
    private Button mButton;
    private EditText mSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.json_array_request);

        setSupportActionBar((android.support.v7.widget.Toolbar) findViewById(R.id.toolbar));

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        mTitle = (TextView) findViewById(R.id.my_title);
        mBody = (TextView) findViewById(R.id.my_body);
        mBody.setMovementMethod(new ScrollingMovementMethod());
        mBody.setMovementMethod(new ScrollingMovementMethod());
       // mSecondTitle = (TextView) findViewById(R.id.my_title_2);
       // mSecondBody = (TextView) findViewById(R.id.my_body_2);
        //mSecondBody.setMovementMethod(new ScrollingMovementMethod());
        mErrorView = (LinearLayout) findViewById(R.id.error_view);
        mContent = (LinearLayout) findViewById(R.id.content);
        mButton=(Button)findViewById(R.id.search_button);
        mSearch=(EditText)findViewById(R.id.search_box);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  validateAndPerformSearch();
            }
        };
        mButton.setOnClickListener(clickListener);
        mProgressBar.setVisibility(View.GONE);
        mContent.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onStop()
    {
        App.cancelAllRequests(sTag);

        super.onStop();
    }
/*    *//*void validateAndPerformSearch(){
        String searchCriteria = null;
        searchCriteria=mSearch.getText().toString();
        if(searchCriteria.equalsIgnoreCase("")||searchCriteria==null){
            //do nothing
        }else{
            mProgressBar.setVisibility(View.VISIBLE);
            mContent.setVisibility(View.GONE);
        final GsonGetRequest<ArrayList<GeocodeObject>> gsonGetRequest =
                GeocodeRequests.getGeocodeObjectArray
                        (
                                new Response.Listener<ArrayList<GeocodeObject>>() {
                                    @Override
                                    public void onResponse(ArrayList<GeocodeObject> geocodeObjectArrayList) {
                                        // Deal with the WikipediaObject here
                                        mProgressBar.setVisibility(View.GONE);
                                        mContent.setVisibility(View.VISIBLE);
                                        setData(geocodeObjectArrayList);
                                    }
                                }
                                ,
                                new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        Log.e(GeocodeObjectActivity.class.getName(), error.toString());
                                        mProgressBar.setVisibility(View.GONE);
                                        mErrorView.setVisibility(View.VISIBLE);
                                    }
                                },
                                searchCriteria

                        );

        App.addRequest(gsonGetRequest, sTag);
        }
    }*//*
    void validateAndPerformSearch(){
        String searchCriteria = null;
        searchCriteria=mSearch.getText().toString();
        if(searchCriteria.equalsIgnoreCase("")||searchCriteria==null){
            //do nothing
        }else{
            mProgressBar.setVisibility(View.VISIBLE);
            mContent.setVisibility(View.GONE);

            final GsonGetRequest<GeocodeObject> gsonGetRequest =
                    GeocodeRequests.getGeocodeObject
                            (
                                    new Response.Listener<GeocodeObject>() {
                                        @Override
                                        public void onResponse(GeocodeObject geocodeObject) {
                                            // Deal with the WikipediaObject here
                                            mProgressBar.setVisibility(View.GONE);
                                            mContent.setVisibility(View.VISIBLE);
                                            setData2(geocodeObject);
                                        }
                                    }
                                    ,
                                    new Response.ErrorListener() {
                                        @Override
                                        public void onErrorResponse(VolleyError error) {
                                            // Deal with the error here
                                            mProgressBar.setVisibility(View.GONE);
                                            mErrorView.setVisibility(View.VISIBLE);
                                        }
                                    },
                                    searchCriteria
                            );


            App.addRequest(gsonGetRequest, sTag);
        }

    }
    private void setData2(@NonNull final GeocodeObject geocodeObjectArrayList)
    {
        mTitle.setText(geocodeObjectArrayList.getTitle());
        mBody.setText(geocodeObjectArrayList.getBody());
        //mSecondTitle.setText(geocodeObjectArrayList.get(1).getTitle());
      //  mSecondBody.setText(geocodeObjectArrayList.get(1).getBody());
    }
    *//**
     * Sets the data in the UI
     *
     * @param geocodeObjectArrayList is the object's array to get the data from
     *//*
    private void setData(@NonNull final ArrayList<GeocodeObject> geocodeObjectArrayList)
    {
        mTitle.setText(geocodeObjectArrayList.get(0).getTitle());
        mBody.setText(geocodeObjectArrayList.get(0).getBody());
       // mSecondTitle.setText(geocodeObjectArrayList.get(1).getTitle());
       // mSecondBody.setText(geocodeObjectArrayList.get(1).getBody());
    }*/
}
