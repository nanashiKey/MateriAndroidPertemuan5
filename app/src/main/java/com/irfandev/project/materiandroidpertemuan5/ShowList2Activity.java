package com.irfandev.project.materiandroidpertemuan5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class ShowList2Activity extends AppCompatActivity {
    ListView lvShowList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlistview2);
        lvShowList = findViewById(R.id.lvShowList);
        ArrayList<String> dataKota = new ArrayList<>();
        dataKota.add("Bandung");
        dataKota.add("Bogor");
        dataKota.add("Depok");
        dataKota.add("Jakarta");
        dataKota.add("Bekasi");
        dataKota.add("Tangerang");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataKota);
        lvShowList.setAdapter(arrAdapter);

        lvShowList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ShowList2Activity.this, "Kota "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
