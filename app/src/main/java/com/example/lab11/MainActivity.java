package com.example.lab11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lab11.model.MyChat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<MyChat> chats = new ArrayList<MyChat>();
        MyChat chat1 = new MyChat();
        chat1.setFriend_name("ริกกี้");
        chat1.setFriend_image("https://i.ytimg.com/vi/OnsXlbX87_M/maxresdefault.jpg");
        chat1.setFriend_tel(1234);
        chats.add(chat1);

        MyChat chat2 = new MyChat();
        chat2.setFriend_name("บอม");
        chat2.setFriend_image("https://cdni-hw.ch7.com/dm/sz-md/i/images/2024/01/03/6595319c663826.19441975.jpg");
        chat2.setFriend_tel(4321);
        chats.add(chat2);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(chats, this);
        recyclerView.setAdapter(mAdapter);
    }
}
