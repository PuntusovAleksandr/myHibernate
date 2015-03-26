package com.Aleksandr.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aleksandr on 26.03.2015.
 */
@Entity
@Table(name = "MESSAGE")
public class Message implements Serializable {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "DATE_MESS")
    private Date date;
    @Column(name = "CONTACTFROM")
    private Contact from;
    @Column(name = "CONTACTTO")
    private Contact to;
    @Column(name = "CONTENT")
    private String content;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Contact getFrom() {
        return from;
    }
    public void setFrom(Contact from) {
        this.from = from;
    }
    public Contact getTo() {
        return to;
    }
    public void setTo(Contact to) {
        this.to = to;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", date=" + date +
                ", from=" + from +
                ", to=" + to +
                ", content='" + content + '\'' +
                '}'+"\n";
    }
}
