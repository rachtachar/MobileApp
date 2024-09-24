package com.example.lab11;

import android.os.Bundle;


import com.example.lab11.databinding.ActivityMainBinding;
import com.example.lab11.model.MyChat;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ActivityMainBinding binding;
    private RecyclerView.Adapter<MyAdapter.ViewHolder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); // Inflate binding
        setContentView(binding.getRoot());

        binding.myRecyclerView.setHasFixedSize(true);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<MyChat> chats = new ArrayList<MyChat>();

        MyChat chat1 = new MyChat();
        chat1.setFriend_name("ริกกี้");
        chat1.setFriend_image("https://i.imgur.com/dODhlMq.png");
        chat1.setFriend_tel(661);
        chats.add(chat1);

        MyChat chat2 = new MyChat();
        chat2.setFriend_name("บอม");
        chat2.setFriend_image("https://i.imgur.com/h7Hr59m.png");
        chat2.setFriend_tel(145);
        chats.add(chat2);

        MyChat chat3 = new MyChat();
        chat3.setFriend_name("ลีโอ");
        chat3.setFriend_image("https://i.imgur.com/Z8cFqlN.png");
        chat3.setFriend_tel(406);
        chats.add(chat3);

        MyChat chat4 = new MyChat();
        chat4.setFriend_name("ท็อป");
        chat4.setFriend_image("https://i.imgur.com/1HQx78p.png");
        chat4.setFriend_tel(188);
        chats.add(chat4);



        mAdapter = new MyAdapter(chats, this);
        recyclerView.setAdapter(mAdapter);
    }
}
