package com.irfandev.project.materiandroidpertemuan5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.irfandev.project.materiandroidpertemuan5.latihanrcview.RCViewMain;

public class MainActivity extends AppCompatActivity
        implements PopupMenu.OnMenuItemClickListener , View.OnLongClickListener {

    Button btnContext, btnPop, btn1, btn2, btn3, btnRcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContext = findViewById(R.id.btnContext);
        btnPop = findViewById(R.id.btnPopup);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnRcView = findViewById(R.id.btnRcView);
        btn1.setOnLongClickListener(this);
        btn2.setOnLongClickListener(this);
        btn3.setOnLongClickListener(this);
        btnRcView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RCViewMain.class);
                startActivity(intent);
            }
        });

        registerForContextMenu(btnContext);
        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popMenu = new PopupMenu(MainActivity.this, view);
                MenuInflater inflater = popMenu.getMenuInflater();
                inflater.inflate(R.menu.popmenu, popMenu.getMenu());
                popMenu.setOnMenuItemClickListener(MainActivity.this);
                popMenu.show();
            }
        });

        btnContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GridSample.class);
                startActivity(intent);
            }
        });
    }

    /**
     * oncreate options menu
     * untuk menambahkan option menu kedalam activity
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optmenu, menu);
        return true;
    }

    /**
     * on options menu
     * untuk memanggil/menambahka fungsi klik kedalam option menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.optmenu1){

            Intent intent = new Intent(MainActivity.this, ShowList2Activity.class);
            startActivity(intent);

        }else if(item.getItemId() == R.id.optmenu2){

            Intent intent = new Intent(MainActivity.this, NextPage.class);
            startActivity(intent);

        }else if(item.getItemId() == R.id.optmenu3){
            Toast.makeText(this, "Options menu 3", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.nestedOpt1){
            Toast.makeText(this, "Nested Options menu 1", Toast.LENGTH_SHORT).show();
        }else{
            //do nothing
            Toast.makeText(this, "Nested Options menu", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    /**
     * untuk membuat context menu
     * @param menu
     * @param v
     * @param menuInfo
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ctxmenu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.ctxMenu1){
            Toast.makeText(this, "Context menu 1", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.ctxMenu2){
            Toast.makeText(this, "Context menu 2", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.ctxMenu3){
            Toast.makeText(this, "Context menu 3", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Context menu", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.popMenu1){
            Toast.makeText(this, "Pop menu 1", Toast.LENGTH_SHORT).show();
        }else if(menuItem.getItemId() == R.id.popMenu2){
            Toast.makeText(this, "Pop menu 2", Toast.LENGTH_SHORT).show();
        }else if(menuItem.getItemId() == R.id.popMenu3){
            Toast.makeText(this, "Pop menu 3", Toast.LENGTH_SHORT).show();
        }else{
            //do nothing
            Toast.makeText(this, "Pop menu", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId() == R.id.btn1){
            Toast.makeText(this, "OnLongClick TEST BTN1", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "OnLongClick TEST", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}