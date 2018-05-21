package com.example.jordiblanco.androidactivity9;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_seccion_1:
                textView.setText(getString(R.string.Part1));
                return true;
            case R.id.menu_seccion_2:
                textView.setText(getString(R.string.Part2));
                return true;
            case R.id.menu_seccion_3:
                textView.setText(getString(R.string.Part3));
                return true;
            case R.id.menu_opcion_1:
                textView.setText(getString(R.string.Part4));
                return true;
            case R.id.menu_opcion_2:
                textView.setText(getString(R.string.Part5));
                return true;
            case R.id.menu_save:
                Toast.makeText(this, getString(R.string.Part8), Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_new:
                Toast.makeText(this, getString(R.string.Part9), Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context1:
                Toast.makeText(this, getString(R.string.Part6), Toast.LENGTH_LONG).show();
                return true;
            case R.id.context2:
                Toast.makeText(this, getString(R.string.Part7), Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
