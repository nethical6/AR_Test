package me.nethical.netar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ModelFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_file);

        Button btn_render = findViewById(R.id.btn_render);
        EditText url = findViewById(R.id.urltext);
        btn_render.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("url",url.getText().toString());
                intent.setClass(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
}