package com.example.reno.lesson5assignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_message);
        btn.setOnClickListener(myListener);

    }


    private View.OnClickListener myListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            EditText et = (EditText) findViewById(R.id.edit_message);
            TextView tv = (TextView) findViewById(R.id.view_message);

            String Inputone = et.getText().toString();
            double FN = Double.parseDouble(Inputone);

            double result = FN * 21.90;
            String resultString = String.valueOf(result);
            tv.setText(resultString);
        }
    };
}
