/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.web.dao;

import java.util.List;

/**
 *
 * @author lining
 * @param <T>
 */
public class DataSourceTemplate<T extends MapperObject> extends AbstractDataSourceTemplate<T>{

    @Override
    public boolean save(T t) {
        return true;
    }
    
    @Override
    public List<Integer> saveList(List<T> t) {
        return null;
    }
    
    @Override
    public boolean update(T t) {
        return true;
    }
    
    @Override
    public List<Integer> updateList(List<T> list) {
        return null;
    }

    @Override
    public boolean delete(T t) {
        return true;
    }
    
    @Override
    public List<Integer> deleteList(List<T> list) {
        return null;
    }

    @Override
    public T query(T t) {
        return null;
    }
    
    @Override
    public List<T> queryList(T t) {
        return null;
    }
}
