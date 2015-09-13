package kuff.chakrit.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //พื้นที่ที่ใช้ประกาศตัวแปร Explicit
    //1Explicit
    private ListView trafficListView;
    private Button aboutmeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2การทำ Initial Widget
        initialWidget(); //กด alt+enter เพื่อสร้าง method อัตโนมัติ ให้ไปทำงานข้างนอก > 2

        //3Button Controller
        buttonController(); //กด alt+enter เพื่อสร้าง method อัตโนมัติ ให้ไปทำงานข้างนอก > 3

        //Create ListView มาทำหลังจาก myadapter เสร็จแล้ว >4
        createListView();


    }   //Main Method

    //4
    private void createListView() {

        //Setup Icon
        int intIcon[] = new int[20];
        intIcon[0] = R.drawable.traffic_01;
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_13;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;


        //Setup Title
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ป้ายจราจร 2";
        strTitle[2] = "ป้ายจราจร 3";
        strTitle[3] = "ป้ายจราจร 4";
        strTitle[4] = "ป้ายจราจร 5";
        strTitle[5] = "ป้ายจราจร 6";
        strTitle[6] = "ป้ายจราจร 7";
        strTitle[7] = "ป้ายจราจร 8";
        strTitle[8] = "ป้ายจราจร 9";
        strTitle[9] = "ป้ายจราจร 10";
        strTitle[10] = "ป้ายจราจร 11";
        strTitle[11] = "ป้ายจราจร 12";
        strTitle[12] = "ป้ายจราจร 13";
        strTitle[13] = "ป้ายจราจร 14";
        strTitle[14] = "ป้ายจราจร 15";
        strTitle[15] = "ป้ายจราจร 16";
        strTitle[16] = "ป้ายจราจร 17";
        strTitle[17] = "ป้ายจราจร 18";
        strTitle[18] = "ป้ายจราจร 19";
        strTitle[19] = "ป้ายจราจร 20";


        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(objIntent);

            }
        });




    }   //createListview


    //3
    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //การทำ Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                //Medip, button ctr+space, =M, ctr+space, R.r
                buttonMediaPlayer.start();

                //Intent to Webview ตัวอย่างไป youtube
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/oxs4qWKY7xE"));
                startActivity(objIntent);


            }   //event
        });  //กด a, .seto, n, ctrl+space, onclick...


    }   //buttonController

    //2
    private void initialWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);
        //ชื่อตัวแปร = finv, R, .i, .ชื่อ widget, alt+ent เพื่อ cast, ctrl=shift=enter


    }   //initialWidget


}   //Main Class นี่คือคลาสหลัก
