package com.app.pace.mediasnota;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class FinalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
//        Intent j = in;
//        Intent j2 = in;
//        Intent j3 = in;
//        Bundle b = in.getExtras();
//        Bundle c = in.getExtras();
//        Bundle d = in.getExtras().getFloat()
//        Bundle extras = in.getExtras();
        Intent in = getIntent();
            float jm1 = in.getExtras().getFloat("im1");
            float jp1 = in.getExtras().getFloat("ip1");
            float ji1 = in.getExtras().getFloat("ii1");
            float jq1 = in.getExtras().getFloat("iq1");
            float jf1 = in.getExtras().getFloat("if1");
            float jb1 = in.getExtras().getFloat("ib1");
            float jh1 = in.getExtras().getFloat("ih1");
            float jg1 = in.getExtras().getFloat("ig1");

            float jm2 = in.getExtras().getFloat("im2");
            float jp2 = in.getExtras().getFloat("ip2");
            float ji2 = in.getExtras().getFloat("ii2");
            float jq2 = in.getExtras().getFloat("iq2");
            float jf2 = in.getExtras().getFloat("if2");
            float jb2 = in.getExtras().getFloat("ib2");
            float jh2 = in.getExtras().getFloat("ih2");
            float jg2 = in.getExtras().getFloat("ig2");

            float jm3 = in.getExtras().getFloat("im3");
            float jp3 = in.getExtras().getFloat("ip3");
            float ji3 = in.getExtras().getFloat("ii3");
            float jq3 = in.getExtras().getFloat("iq3");
            float jf3 = in.getExtras().getFloat("if3");
            float jb3 = in.getExtras().getFloat("ib3");
            float jh3 = in.getExtras().getFloat("ih3");
            float jg3 = in.getExtras().getFloat("ig3");

           final float sm1 = ((60 - (jm1 + (jm2 * 2) + (jm3 * 3))) / 4);
           final float sp1 = ((60 - (jp1 + (jp2 * 2) + (jp3 * 3))) / 4);
           final float si1 = ((60 - (ji1 + (ji2 * 2) + (ji3 * 3))) / 4);
           final float sq1 = ((60 - (jq1 + (jq2 * 2) + (jq3 * 3))) / 4);
           final float sf1 = ((60 - (jf1 + (jf2 * 2) + (jf3 * 3))) / 4);
           final float sb1 = ((60 - (jb1 + (jb2 * 2) + (jb3 * 3))) / 4);
           final float sh1 = ((60 - (jh1 + (jh2 * 2) + (jh3 * 3))) / 4);
           final float sg1 = ((60 - (jg1 + (jg2 * 2) + (jg3 * 3))) / 4);


            TextView mat1label = (TextView) findViewById(R.id.matlabel);
            mat1label.setText(""+sm1);
            TextView port1label = (TextView) findViewById(R.id.portlabel);
            port1label.setText(""+sp1);
            TextView ing1label = (TextView) findViewById(R.id.inglabel);
            ing1label.setText(""+si1);
            TextView quim1label = (TextView) findViewById(R.id.quimlabel);
            quim1label.setText(""+sq1);
            TextView fis1label = (TextView) findViewById(R.id.fislabel);
            fis1label.setText(""+sf1);
            TextView bio1label = (TextView) findViewById(R.id.biolabel);
            bio1label.setText(""+sb1);
            TextView hist1label = (TextView) findViewById(R.id.histlabel);
            hist1label.setText(""+sh1);
            TextView geo1label = (TextView) findViewById(R.id.geolabel);
            geo1label.setText(""+sg1);


            }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_final, menu);
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
