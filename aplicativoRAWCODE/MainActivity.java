package com.app.pace.mediasnota;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText em1 = (EditText) findViewById(R.id.mat1);
        final EditText ep1 = (EditText) findViewById(R.id.port1);
        final EditText ei1 = (EditText) findViewById(R.id.ing1);
        final EditText eq1 = (EditText) findViewById(R.id.quim3);
        final EditText ef1 = (EditText) findViewById(R.id.fis1);
        final EditText eb1 = (EditText) findViewById(R.id.bio1);
        final EditText eh1 = (EditText) findViewById(R.id.hist1);
        final EditText eg1 = (EditText) findViewById(R.id.geo1);

        Button btnOne = (Button) findViewById(R.id.buttonb1);
        btnOne.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v){

                Intent i = new Intent(getApplicationContext(), Activity2.class);
                float m1 = Float.parseFloat(em1.getText().toString());
                float p1 = Float.parseFloat(ep1.getText().toString());
                float i1 = Float.parseFloat(ei1.getText().toString());
                float q1 = Float.parseFloat(eq1.getText().toString());
                float f1 = Float.parseFloat(ef1.getText().toString());
                float b1 = Float.parseFloat(eb1.getText().toString());
                float h1 = Float.parseFloat(eh1.getText().toString());
                float g1 = Float.parseFloat(eg1.getText().toString());
                i.putExtra("im1", m1);
                i.putExtra("ip1", p1);
                i.putExtra("ii1", i1);
                i.putExtra("iq1", q1);
                i.putExtra("if1", f1);
                i.putExtra("ib1", b1);
                i.putExtra("ih1", h1);
                i.putExtra("ig1", g1);
                startActivity(i);

            }


        });
    }





//        public void onButtonClick(View v) {
//        float n1, n2, soma;
//        EditText e1 = (EditText)findViewById(R.id.mat1);
//        EditText e2 = (EditText)findViewById(R.id.port1);
//        TextView t1 = (TextView)findViewById(R.id.txtview);
//        n1 = float.parseFloat(e1.getText().toString());
//        n2 = float.parseFloat(e2.getText().toString());
//        soma = (n1 + n2)/2;
//        t1.setText(""+soma);
//
//
//    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
