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
        chat1.setFriend_tel("0912345678");
        chat1.setFriend_dob("06-04-2005");
        chats.add(chat1);

        MyChat chat2 = new MyChat();
        chat2.setFriend_name("บอม");
        chat2.setFriend_image("https://i.imgur.com/h7Hr59m.png");
        chat2.setFriend_tel("0876543210");
        chat2.setFriend_dob("22-09-2004");
        chats.add(chat2);

        MyChat chat3 = new MyChat();
        chat3.setFriend_name("ลีโอ");
        chat3.setFriend_image("https://i.imgur.com/Z8cFqlN.png");
        chat3.setFriend_tel("0987654321");
        chat3.setFriend_dob("18-02-1999");
        chats.add(chat3);

        MyChat chat4 = new MyChat();
        chat4.setFriend_name("ท็อป");
        chat4.setFriend_image("https://i.imgur.com/1HQx78p.png");
        chat4.setFriend_tel("0814785932");
        chat4.setFriend_dob("11-07-2001");
        chats.add(chat4);

        MyChat chat5 = new MyChat();
        chat5.setFriend_name("ไอซ์");
        chat5.setFriend_image("https://i.imgur.com/GcLRvPD.png");
        chat5.setFriend_tel("0987654321");
        chat5.setFriend_dob("01-22-2012");
        chats.add(chat5);

        MyChat chat6 = new MyChat();
        chat6.setFriend_name("ต้า");
        chat6.setFriend_image("https://i.imgur.com/fJC4hFx.png");
        chat6.setFriend_tel("08425467321");
        chat6.setFriend_dob("13-03-2000");
        chats.add(chat6);



        mAdapter = new MyAdapter(chats, this);
        recyclerView.setAdapter(mAdapter);
    }
}
