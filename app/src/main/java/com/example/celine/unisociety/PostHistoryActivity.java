package com.example.celine.unisociety;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Model.Post;

public class PostHistoryActivity extends AppCompatActivity {
    public static final String EDIT_POST = "edit_post";
    public static final String NEW_POST = "new_post";

    private RecyclerView history;
    private List<Post> pastEvents;
    private FloatingActionButton fab_createPost;
    private Button btn_back;

    private int userID = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_main);

        if(userID == -1)userID= this.getIntent().getIntExtra("USER_ID", -1);
        if(userID == -1) Log.e("ERROR","HISTORY ACTIVITY FAILED");

        //create new post
        fab_createPost = (FloatingActionButton)findViewById(R.id.fab_newPost);
        fab_createPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostHistoryActivity.this, CreatePost_Activity.class);
                intent.putExtra(CreatePost_Activity.USER_ID, userID);
                intent.putExtra("POST_TYPE", PostHistoryActivity.NEW_POST);
                startActivity(intent);
            }
        });
        // TODO: 23/09/2017 get history using id
        pastEvents = new ArrayList<Post>();
        HistoryAdapter historyAdapter = new HistoryAdapter(this, pastEvents);
        history = (RecyclerView) findViewById(R.id.rv_history);
        history.setAdapter(historyAdapter);

        // TODO: 23/09/2017 editing finished, will the  userID still be remained

        // TODO: 23/09/2017 back functionality (buggy, to be improved)


    }
}
