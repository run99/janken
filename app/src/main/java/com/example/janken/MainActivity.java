package com.example.janken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //変数宣言　これからコーディングに必要なものを使うという宣言
    ImageView cpu;
    ImageView player;
    TextView result;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_main内のViewとの紐づけ

        cpu = (ImageView) findViewById(R.id.cpu);
        player = (ImageView) findViewById(R.id.player);
        result = (TextView) findViewById(R.id.result);
    }

    //gooを押したときの処理
    public void goo(View v){

        //playerの手をグー
        player.setImageResource(R.drawable.goo);

        //0～２までのランダムの数を取り出す
        int random = r.nextInt(3);

        if(random == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです！");

        }else if(random==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです！");

        }else if(random==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです！");

        }

    }

    public void choki(View v){

        //playerの手をチョキ
        player.setImageResource(R.drawable.choki);

        //0～２までのランダムの数を取り出す
        int random = r.nextInt(3);

        if(random == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです！");

        }else if(random==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです！");

        }else if(random==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです！");

        }

    }

    public void paa(View v){

        //playerの手をグパー
        player.setImageResource(R.drawable.paa);

        //0～２までのランダムの数を取り出す
        int random = r.nextInt(3);

        if(random == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです！");

        }else if(random==1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです！");

        }else if(random==2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです！");

        }

    }

}
