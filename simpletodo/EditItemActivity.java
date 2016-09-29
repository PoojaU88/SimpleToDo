package com.example.android.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editText = (EditText) findViewById(R.id.editItem);
        String editItem = getIntent().getStringExtra("edit");
        editText.setText(editItem);
    }

    public void onSave(View v){
        EditText editText = (EditText) findViewById(R.id.editItem);
        int positionValue = getIntent().getIntExtra("position",-1);
        Intent data = new Intent();
        data.putExtra("name",editText.getText().toString());
        data.putExtra("position",positionValue);
        setResult(RESULT_OK,data);
        finish();
    }
}
