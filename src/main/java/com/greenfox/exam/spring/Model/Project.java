package com.greenfox.exam.spring.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
  private long id;
  private String nameOfProject;

  public Project() {
  }

  public Project(long id, String nameOfProject) {
    this.id = id;
    this.nameOfProject = nameOfProject;
  }

}
