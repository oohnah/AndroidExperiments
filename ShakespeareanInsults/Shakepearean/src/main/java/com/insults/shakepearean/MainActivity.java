package com.insults.shakepearean;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.*;
import android.os.Build;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {


    public void send_Message(View v){

        TextView t1= (TextView) findViewById(R.id.textView2);
        TextView t2= (TextView) findViewById(R.id.textView3);
        TextView t3= (TextView) findViewById(R.id.textView4);

        String[] one={"Bawdy", "Beslubbering", "Bootless", "Churlish", "Cockered", "Clouted",
                "craven", "currish", "dankish"};
        String[] two={"bat-fowling", "beef-witted", "beetle-headed", "boil-brained",
                "clapper-clawed", "clay-brained", "common-kissing", "crook-pated",
                "dismal-dreaming"};
        String[] three={"baggage", "barnacle", "bladder", "boar-pig", "bugbear",
                "bum-bailey", "canker blossom", "clack-dish", "clotpole"};
        Random rand=new Random();
        int r=rand.nextInt(9);
        t1.setText(one[r]);

        Random rand2=new Random();
        int r2=rand2.nextInt(9);
        t2.setText(two[r2]);

        Random rand3=new Random();
        int r3=rand3.nextInt(9);
        t3.setText(three[r3]);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
