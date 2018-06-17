package com.greenfox.h2todo.h2todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;


  public ToDo(String title) {
    this();
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public ToDo() {
    this.urgent = false;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
