package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activeOne(View view) {
        Intent intent = new Intent(this, Func1Activity.class);
        startActivityForResult(intent, 101);
    }

    public void activeTwo(View view) {
        Intent intent = new Intent(this, Func2Activity.class);
        startActivityForResult(intent, 102);
    }

    public void activeThr(View view) {
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, 103);
    }

    public void activeFou(View view) {
        Intent intent = new Intent(this, Func4Activity.class);
        startActivityForResult(intent, 104);
    }

    public void activeFiv(View view) {
        Intent intent = new Intent(this, Func5Activity.class);
        startActivityForResult(intent, 105);
    }

    public void activeSix(View view) {
        Intent intent = new Intent(this, Func6Activity.class);
        startActivityForResult(intent, 106);
    }

    public void activeSev(View view) {
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, 107);
    }

    public void activeEig(View view) {
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, 108);
    }
}
