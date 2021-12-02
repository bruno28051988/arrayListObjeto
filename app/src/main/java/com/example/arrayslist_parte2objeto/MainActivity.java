package com.example.arrayslist_parte2objeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<User> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        lista = new ArrayList<>();

        User user1 = new User();
        user1.setName("BBordin88");
        user1.setPassword("123456");

        User user2 = new User("usuario 2", "121212");

        User user3 = new User(user2);

        user2.setName("novo usuario 2");
        user2.setPassword("333333");


        lista.add(user1);
        lista.add(user2);
        lista.add(user3);

        ArrayAdapter<User> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                lista
        );
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(
                        MainActivity.this,
                        lista.get(i).toString(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

    }
}