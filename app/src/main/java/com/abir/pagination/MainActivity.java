package com.abir.pagination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

import android.os.Bundle;

import com.abir.pagination.MODEL.Item;
import com.abir.pagination.PAGINATE.ItemDataSource;
import com.abir.pagination.PAGINATE.ItemDataSourceFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<PagedList<Item>> itemPagedList;
    List<PageKeyedDataSource<Integer, Item>> liveDataSource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ItemDataSourceFactory itemDataSourceFactory = new ItemDataSourceFactory();

        //getting the live data source from data source factory
        liveDataSource = itemDataSourceFactory.getItemLiveDataSource();

        //Getting PagedList config
        PagedList.Config pagedListConfig =
                (new PagedList.Config.Builder())
                        .setEnablePlaceholders(false)
                        .setPageSize(ItemDataSource.PAGE_SIZE).build();

        //Building the paged list
        itemPagedList = new PagedList.Builder<itemDataSourceFactory,pagedListConfig>().build();
}
