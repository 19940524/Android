package xue.guobin.com.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button nextButton,barButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = (Button) findViewById(R.id.nextButton);
        barButton  = (Button) findViewById(R.id.barButton);

        ButtonOnClick click = new ButtonOnClick();
        nextButton.setOnClickListener(click);
        Log.d("debug1","onCreate   ---> 创建");
    }

    class ButtonOnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,NextActivity.class);

            String data = "买一送一";
            intent.putExtra("data",data);
            startActivity(intent);
        }

    }
    /* Aativity 生命周期 */
    @Override
    /* 活动 开始 */
    protected void onStart() {
        super.onStart();
        Log.d("debug1","onStart   ---> 开始");
    }

    @Override
    /* 活动 重启 */
    protected void onRestart() {
        super.onRestart();
        Log.d("debug1","onRestart   ---> 重启");
    }

    @Override
    /* 活动 继续 */
    protected void onResume() {
        super.onResume();
        Log.d("debug1","onResume   ---> 继续");
    }

    @Override
    /* 活动 暂停 */
    protected void onPause() {
        super.onPause();
        Log.d("debug1","onPause   ---> 暂停");
    }

    @Override
    /* 活动 停止 */
    protected void onStop() {
        super.onStop();
        Log.d("debug1","onStop   ---> 停止");
    }

    @Override
    /* 活动 消灭 */
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug1","onRestart   ---> 消灭");
    }
}
