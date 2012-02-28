package com.zauberlabs.gradle.plugins.shadow

import org.apache.commons.lang.StringUtils;
import org.gradle.api.tasks.*
import org.gradle.api.*

/**
 * Task for reveling a shadowed text 
 * @author flbulgarelli
 */
class RevealTask extends DefaultTask {

  String input

  @TaskAction
  def reveal() {
    ShadowPlugin.reveal(input)
  }
}
