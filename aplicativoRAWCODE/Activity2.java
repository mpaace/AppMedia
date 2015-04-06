package com.app.pace.mediasnota;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent in = getIntent();
        final Float m1 = in.getFloatExtra("im1", 1);
        final Float p1 = in.getFloatExtra("ip1", 1);
        final Float i1 = in.getFloatExtra("ii1", 1);
        final Float q1 = in.getFloatExtra("iq1", 1);
        final Float f1 = in.getFloatExtra("if1", 1);
        final Float b1 = in.getFloatExtra("ib1", 1);
        final Float h1 = in.getFloatExtra("ih1", 1);
        final Float g1 = in.getFloatExtra("ig1", 1);

        final EditText em2 = (EditText) findViewById(R.id.mat2);
        final EditText ep2 = (EditText) findViewById(R.id.port2);
        final EditText ei2 = (EditText) findViewById(R.id.ing2);
        final EditText eq2 = (EditText) findViewById(R.id.quim3);
        final EditText ef2 = (EditText) findViewById(R.id.fis2);
        final EditText eb2 = (EditText) findViewById(R.id.bio2);
        final EditText eh2 = (EditText) findViewById(R.id.hist2);
        final EditText eg2 = (EditText) findViewById(R.id.geo2);

        Button btnTwo = (Button) findViewById(R.id.buttonb2);
        btnTwo.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){

                Intent i = new Intent(getApplicationContext(), Activity3.class);

                float m2 = Float.parseFloat(em2.getText().toString());
                float p2 = Float.parseFloat(ep2.getText().toString());
                float i2 = Float.parseFloat(ei2.getText().toString());
                float q2 = Float.parseFloat(eq2.getText().toString());
                float f2 = Float.parseFloat(ef2.getText().toString());
                float b2 = Float.parseFloat(eb2.getText().toString());
                float h2 = Float.parseFloat(eh2.getText().toString());
                float g2 = Float.parseFloat(eg2.getText().toString());
                i.putExtra("im1", m1);
                i.putExtra("ip1", p1);
                i.putExtra("ii1", i1);
                i.putExtra("iq1", q1);
                i.putExtra("if1", f1);
                i.putExtra("ib1", b1);
                i.putExtra("ih1", h1);
                i.putExtra("ig1", g1);
                i.putExtra("im2", m2);
                i.putExtra("ip2", p2);
                i.putExtra("ii2", i2);
                i.putExtra("iq2", q2);
                i.putExtra("if2", f2);
                i.putExtra("ib2", b2);
                i.putExtra("ih2", h2);
                i.putExtra("ig2", g2);
                startActivity(i);

            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bim2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
