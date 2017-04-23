package cz.muni.fi.paywatch.model;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jirka on 14.04.2017.
 */

public class Entry extends RealmObject {

    private Double sum;
    private Integer categoryId;
    private Integer accountId;
    private Date date;

    public Entry(Double sum, Date date, Integer categoryId, Integer accountId ) {
        this.sum = sum;
        this.categoryId = categoryId;
        this.accountId = accountId;
        this.date = date;
    }

    public Entry() {
        super();
    }

    public Double getSum() {
        return sum;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Date getDate() {
        return date;

    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
