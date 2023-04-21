package com.needtechlab.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.toolBar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Vous avez cliqué sur le menu de navigation", Toast.LENGTH_SHORT).show();

            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuFavorite:
                        Toast.makeText(MainActivity.this, "Vous avez cliqué sur le menu favoris", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menuSearch:
                        Toast.makeText(MainActivity.this, "Vous avez cliqué sur le menu recherche", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menuSettings:
                        Toast.makeText(MainActivity.this, "Vous avez cliqué sur le menu paramètre", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }
}