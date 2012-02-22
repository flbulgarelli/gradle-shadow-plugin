package com.zauberlabs.gradle.plugins.shadow

import org.gradle.api.*


class ShadowPlugin implements Plugin<Project> {
  def void apply(Project project) {
    project.tasks.withType(ShadowTask) { task ->
      task.conventionMapping.input = { project.input }
    }
    project.tasks.withType(RevealTask) { task ->
      task.conventionMapping.input = { project.input }
    }
    
    project.metaClass.reveal = { intput -> 
      reveal(intput)
    }
  }
  
  static shadow(input) {
    input
  }
  
  static reveal(input) {
    input
  }
 }

