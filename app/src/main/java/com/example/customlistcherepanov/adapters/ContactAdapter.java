package com.example.customlistcherepanov.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customlistcherepanov.R;
import com.example.customlistcherepanov.model.Contact;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<Contact> contacts;
    private LayoutInflater inflater;

    public ContactAdapter(List<Contact> contacts, Context context) {
        this.contacts = contacts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts != null ? contacts.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return contacts != null ? contacts.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View currentView;
        if(convertView != null) {
            currentView = convertView;
        } else {
            currentView = inflater.inflate(R.layout.item, parent, false);
        }

        Contact contact = (Contact) getItem(position);

        if (contact != null) {
            ImageView imageView = currentView.findViewById(R.id.image);
            TextView contactName = currentView.findViewById(R.id.contact_name);
            TextView contactNumber = currentView.findViewById(R.id.contact_number);
            CheckBox checkBox = currentView.findViewById(R.id.checkbox);

            imageView.setBackgroundResource(R.drawable.icons8_customer64);
            contactName.setText(contact.getContactName());
            contactNumber.setText(contact.getContactNumber());
            checkBox.setChecked(contact.isChecked());
        }

        return currentView;
    }
}
