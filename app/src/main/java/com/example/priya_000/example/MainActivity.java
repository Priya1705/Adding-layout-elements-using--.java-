package com.example.priya_000.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layout
        RelativeLayout lay=new RelativeLayout(this);
        lay.setBackgroundColor(Color.YELLOW);

        //button
        Button redButton=new Button(this);
        redButton.setText("LOG IN");
        redButton.setBackgroundColor(Color.RED);

        //username input
        EditText username=new EditText(this);

        redButton.setId('1');
        username.setId('2');


        RelativeLayout.LayoutParams buttonDetails=new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //give rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);


        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r= getResources();                //it gets bunch of information about ur app
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics()
                );                   //converts dip to pixels

        username.setWidth(px); //converted pixels value passed hence changes frm device to device however the size is consistent

        //add widget to layout(button is now a child of layout)
        lay.addView(redButton, buttonDetails);
        lay.addView(username, usernameDetails);

        //set this activities content/display to this view
        setContentView(lay);
    }
}
