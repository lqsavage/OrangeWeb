/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.web.dao;

/**
 *
 * @author lining
 */
public @interface DBFieldMapper {
    String field();
    DBQueryOrder orderby() default DBQueryOrder.ASC;
    int orderindex() default 0;
}
