package com.zauberlabs.gradle.plugins.shadow

import static org.junit.Assert.*

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

class ShadowPluginTest {

  @Test
  public void greeterPluginAddsGreetingTaskToProject() {
    Project project = ProjectBuilder.builder().build()
    project.apply plugin: 'shadow'
    
  	assert 'foobar' == project.reveal(ShadowPlugin.shadow('foobar'))
  }
}