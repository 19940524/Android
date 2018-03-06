package xue.guobin.com.login;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    // 声明控件
    private EditText etUserName,etPassword;
    private Button buttonOK,buttonCancel;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 关联
        etUserName = (EditText) findViewById(R.id.tvUserName);
        etPassword = (EditText) findViewById(R.id.tvPassword);

        buttonOK     = (Button) findViewById(R.id.buttonOK);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        tvResult = (TextView) findViewById(R.id.tvResult);

        buttonOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // 当你点击确定需完成的工作
                // 在tvResult中显示用户名与密码

                // 得到用户的输入
                String usename = etUserName.getText().toString();
                String passworld = etPassword.getText().toString();

                tvResult.setText("用户名: " + usename + "密码: " + passworld);
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // 当你点击取消需完成的工作
                // 清空控件数据
                etUserName.setText("");
                etPassword.setText("");
                tvResult.setText("");
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

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
