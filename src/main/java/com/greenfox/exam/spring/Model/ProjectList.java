package com.greenfox.exam.spring.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjectList {
  private List<Project> projectList;

  public ProjectList() {
  }

  public ProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }

}
