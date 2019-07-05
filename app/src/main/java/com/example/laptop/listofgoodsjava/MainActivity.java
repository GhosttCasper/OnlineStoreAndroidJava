package com.example.laptop.listofgoodsjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/*
Приложение состоит из двух экранов.
Первый экран содержит список товаров условного интернет-магазина, сгруппированных по категориям (книги/диски).
Элементами списка являются товары.
Каждый элемент в заголовке содержит название товара,
в подзаголовке – подкатегорию товара (для книг – программирование/кулинария/эзотерика; для дисков – музыка/видео/ПО).
При нажатии на элементе выводится второй экран, на котором в произвольной форме содержится вся информация о выбранном товаре.

Список товаров не редактируется, задаётся заранее любым способом (например, жёстко зашит в коде).
 */

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.laptop.listofgoodsjava.MESSAGE";

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private OnItemClickListener.OnItemClickCallback onItemClickCallback = new OnItemClickListener.OnItemClickCallback() {
        @Override
        public void onItemClicked(View view, int position) {
            Intent intent = new Intent(MainActivity.this, GoodsActivity.class);
            intent.putExtra(EXTRA_MESSAGE, position);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        mAdapter = new RecAdapter(OnlineStore.defaultGoods(this), onItemClickCallback);
        recyclerView.setAdapter(mAdapter);
    }


    public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {
        private List<Goods> mDataset;
        private OnItemClickListener.OnItemClickCallback onItemClickCallback;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public class RecViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public View view;

            public RecViewHolder(View v) {
                super(v);
                view = v;
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public RecAdapter(List<Goods> myDataset, OnItemClickListener.OnItemClickCallback onItemClickCallback) {
            mDataset = myDataset;
            this.onItemClickCallback = onItemClickCallback;

        }

        // Create new views (invoked by the layout manager)
        @Override
        public RecAdapter.RecViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);

            return new RecViewHolder(v);
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(RecViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            TextView title = (TextView) holder.itemView.findViewById(R.id.item_title);
            title.setText(mDataset.get(position).name);

            TextView subtitle = (TextView) holder.itemView.findViewById(R.id.item_subtitle);
            subtitle.setText(mDataset.get(position).getSubcategory());

            holder.itemView.setOnClickListener(new OnItemClickListener(position, onItemClickCallback));
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.size();
        }
    }
}

class OnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public OnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
