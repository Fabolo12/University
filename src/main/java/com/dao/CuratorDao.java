package com.dao;

import com.model.Curator;

public class CuratorDao extends AbstractDao<Curator> {
    @Override
    protected void init() {
        aClass = Curator.class;
    }
}
