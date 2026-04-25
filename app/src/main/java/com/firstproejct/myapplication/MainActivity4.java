package com.firstproejct.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.PopupMenu;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity4 extends AppCompatActivity {

    Button btn,btn_dialog,btn_info,btn_date,btn_time;
    Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn=findViewById(R.id.button);
        registerForContextMenu(btn);
        btn_dialog=findViewById(R.id.button2);
        btn_info=findViewById(R.id.button3);
        btn_date=findViewById(R.id.button4);
        btn_time=findViewById(R.id.button5);
        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new TimePickerDialog(MainActivity4.this,SETTIME,
                        c.get(Calendar.HOUR),c.get(Calendar.MINUTE),false).show();
            }
        });
        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*new DatePickerDialog(MainActivity4.this,SETDATE,
                        c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();*/
                ProgressDialog progressDialog=new ProgressDialog(MainActivity4.this);
                progressDialog.setTitle("Loading...");
                progressDialog.setMessage("Please Wait");
                progressDialog.show();
                //progressDialog.dismiss();
            }
        });
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity4.this)
                        .setTitle("Bettry Low")
                        .setMessage("Please Connect Charger")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity4.this, "Done Connected", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity4.this)
                        .setTitle("Delete Contact")
                        .setMessage("Are You Sure Delete this ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity4.this, "Delete Contact Done", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity4.this,view);
                popupMenu.getMenuInflater().inflate(R.menu.mainmenu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.idsetting)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        else if(item.getItemId()==R.id.idnewpage)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        else if(item.getItemId()==R.id.idlogout)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        else if(item.getItemId()==R.id.item1)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        else if(item.getItemId()==R.id.item2)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        else if(item.getItemId()==R.id.item3)
                        {
                            Toast.makeText(MainActivity4.this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.idsetting)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.idnewpage)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.idlogout)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item1)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item2)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item3)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mainmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.idsetting)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.idnewpage)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.idlogout)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item1)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item2)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.item3)
        {
            Toast.makeText(this, "Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
    private DatePickerDialog.OnDateSetListener SETDATE=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            btn_date.setText(year+" : "+(month+1)+" : "+day);
        }
    };
    private TimePickerDialog.OnTimeSetListener SETTIME=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            btn_time.setText(hour+" : "+minute);
        }
    };
}