package com.example.laptop.listofgoodsjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class GoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);

        // Get the Intent that started this activity and extract the Int
        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, -12345);
        if (position >= 0)
            showInformation(position);
    }

    private void showInformation(int position) {
        Goods curGoods = OnlineStore.goodsList.get(position);

        ArrayList<String> curGoodsData = curGoods.getStringInformation();

        TextView name = findViewById(R.id.item_name);
        name.setText(curGoodsData.get(0));

        TextView price = findViewById(R.id.item_price);
        price.setText("Price: " + curGoodsData.get(1) + "$");

        TextView barcode = findViewById(R.id.item_barcode);
        barcode.setText("Barcode: " + curGoodsData.get(2));

        TextView subtitle1 = findViewById(R.id.item_subtitle1);
        TextView subtitle2 = findViewById(R.id.item_subtitle2);


        if (curGoods instanceof Book) {
            subtitle1.setText("Amount of pages: " + curGoodsData.get(3));
            if (curGoods instanceof ProgrammingBook) {
                subtitle2.setText("Programming language: " + curGoodsData.get(4));
            } else if (curGoods instanceof CookingBook) {
                subtitle2.setText("Main ingredient: " + curGoodsData.get(4));
            } else if (curGoods instanceof EsotericBook) {
                subtitle2.setText("Reader minimum age: " + curGoodsData.get(4));
            }
        } else if (curGoods instanceof Disk) {
            subtitle1.setText("Content: " + curGoodsData.get(3));
            subtitle2.setText("Disc type: " + curGoodsData.get(4));
        }
    }
}
