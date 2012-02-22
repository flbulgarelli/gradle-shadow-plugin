package com.zauberlabs.gradle.plugins.shadow

import org.apache.commons.lang.StringUtils;
import org.gradle.api.tasks.*
import org.gradle.api.*

class RevealTask extends DefaultTask {

  String input

  @TaskAction
  def reveal() {
    ShadowPlugin.reveal(input)
  }
}
