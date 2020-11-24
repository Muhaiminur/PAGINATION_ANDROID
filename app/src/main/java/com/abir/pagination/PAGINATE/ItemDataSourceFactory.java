package com.abir.pagination.PAGINATE;

import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.abir.pagination.MODEL.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDataSourceFactory extends DataSource.Factory {

    //creating the mutable live data
    private List<PageKeyedDataSource<Integer, Item>> itemLiveDataSource = new ArrayList<>();

    @Override
    public DataSource<Integer, Item> create() {
        //getting our data source object
        ItemDataSource itemDataSource = new ItemDataSource();

        //posting the datasource to get the values
        itemLiveDataSource.add(itemDataSource);

        //returning the datasource
        return itemDataSource;
    }


    //getter for itemlivedatasource
    public List<PageKeyedDataSource<Integer, Item>> getItemLiveDataSource() {
        return itemLiveDataSource;
    }
}