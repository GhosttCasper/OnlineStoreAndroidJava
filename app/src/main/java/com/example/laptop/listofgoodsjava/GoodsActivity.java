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

        Goods curGoods = OnlineStore.goodsList.get(position);

        ArrayList<String> curGoodsData = curGoods.getStringInformation();

        TextView name = findViewById(R.id.item_name);
        name.setText(curGoodsData.get(0));

        TextView price = findViewById(R.id.item_price);
        price.setText(curGoodsData.get(1));

        TextView barcode = findViewById(R.id.item_barcode);
        barcode.setText(curGoodsData.get(2));

        TextView subtitle1 = findViewById(R.id.item_subtitle1);
        subtitle1.setText(curGoodsData.get(3));

        TextView subtitle2 = findViewById(R.id.item_subtitle2);
        subtitle2.setText(curGoodsData.get(4));
    }
}
