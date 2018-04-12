package xue.guobin.com.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class NextActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6;
    private LinearLayout re;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        re = new LinearLayout(getApplicationContext());
        re.setOrientation(LinearLayout.VERTICAL);
        setContentView(re);

        LinearLayout topLayout = new LinearLayout(getApplicationContext());
        LinearLayout botLayout = new LinearLayout(getApplicationContext());

        topLayout.setOrientation(LinearLayout.HORIZONTAL);
        botLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params1.weight = 1;
        params2.weight = 1;
        re.addView(topLayout,params1);
        re.addView(botLayout,params2);

        button1 = getButton("#FF0000");
        button2 = getButton("#00FF00");
        button3 = getButton("#0000FF");
        button4 = getButton("#66FF0000");
        button5 = getButton("#6600FF00");
        button6 = getButton("#660000FF");

        setLayoutParans(topLayout,button1);
        setLayoutParans(topLayout,button2);
        setLayoutParans(topLayout,button3);

        setLayoutParans(botLayout,button4);
        setLayoutParans(botLayout,button5);
        setLayoutParans(botLayout,button6);


    }

    private void setLayoutParans(LinearLayout layout,Button button) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params.weight = 1;
        layout.addView(button,params);
    }

    private Button getButton(String color) {
        Button button = new Button(getApplicationContext());
        button.setBackgroundColor(Color.parseColor(color));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        return button;
    }

}
