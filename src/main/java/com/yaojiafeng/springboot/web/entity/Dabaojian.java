package com.yaojiafeng.springboot.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by yaojiafeng on 2018/9/8 下午4:10.
 */
@Entity
@Table(name = "dabaojian")
public class Dabaojian {

    @Id
    private Integer id;

    private String address;

    private Date time;

    private String people;

    private Long money;

    private Integer jishi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getJishi() {
        return jishi;
    }

    public void setJishi(Integer jishi) {
        this.jishi = jishi;
    }
}
