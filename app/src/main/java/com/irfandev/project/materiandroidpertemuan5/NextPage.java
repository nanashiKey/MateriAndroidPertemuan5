package com.irfandev.project.materiandroidpertemuan5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class NextPage extends AppCompatActivity{
    ListView lvShowList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlistview);
        lvShowList = findViewById(R.id.lvShowList);

        lvShowList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NextPage.this, "Kota "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
