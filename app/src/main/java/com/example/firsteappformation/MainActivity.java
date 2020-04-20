package com.example.firsteappformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText username,password;
Button ok,cancel;
String corectusername="hichem",corectpassword="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        ok=(Button) findViewById(R.id.ok);
        cancel=(Button) findViewById(R.id.cancel);

        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ok:
                String inputusername=username.getText().toString();
                String inputpassword=password.getText().toString();
if (inputusername.equalsIgnoreCase(corectusername) && inputpassword.equalsIgnoreCase(corectpassword)){
    Toast.makeText(this,"succesful",Toast.LENGTH_SHORT).show();

    SharedPreferences sharedPrefer=getPreferences(Context.MODE_PRIVATE);
    SharedPreferences.Editor sharededit=sharedPrefer.edit();

    sharededit.putString("inputusername",inputusername);
    sharededit.putString("inputpassword",inputpassword);
    sharededit.commit();

    //read data
    SharedPreferences readpref=getPreferences(Context.MODE_PRIVATE);
    String savepref=readpref.getString("user_name_pref","");
    Toast.makeText(this,"User name is "+savepref,Toast.LENGTH_SHORT).show();






}
else {
    Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();

}
                break;
            case R.id.cancel:
username.setText("");
password.setText("");
                break;
        }
    }
}
