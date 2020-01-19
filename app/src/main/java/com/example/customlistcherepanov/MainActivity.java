package com.example.customlistcherepanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.customlistcherepanov.adapters.ContactAdapter;
import com.example.customlistcherepanov.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Contact> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        listView = findViewById(R.id.list_view);
        list = new ArrayList<>();

        list.add(new Contact("Vasya"
                , "+7(324)321-31-12"
                , false));

        list.add(new Contact("Petya"
                , "+7(432)123-12-43"
                , false));

        list.add(new Contact("Grisha"
                , "+7(765)987-87-65"
                , false));

        ContactAdapter contactAdapter = new ContactAdapter(list, this);
        listView.setAdapter(contactAdapter);
    }
}
