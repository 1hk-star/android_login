package lhk.mylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    //Button btn_login;
    //   Button btn_join;
    EditText input_id, input_pw;
    public static String s_id, s_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // btn_login = (Button) findViewById(R.id.btn_login);
        //btn_join = (Button) findViewById(R.id.btn_join);

        input_id = (EditText) findViewById(R.id.input_id);
        input_pw = (EditText) findViewById(R.id.input_pw);
    }

    public void btn_login(View view){

        s_id = input_id.getText().toString();
        s_pw = input_pw.getText().toString();
        Log.d(TAG, s_id + ", " + s_pw);

        if((s_id != null) && (s_pw != null)){

            loginDB ldb = new loginDB();
            ldb.execute();
        }

    }

    public void btn_join(View view){

        s_id = input_id.getText().toString();
        s_pw = input_pw.getText().toString();
        Log.d(TAG, s_id + ", " + s_pw);

        if((s_id != null) && (s_pw != null)){

            registDB rdb = new registDB();
            rdb.execute();
        }
    }
}
