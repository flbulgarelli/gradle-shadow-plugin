package com.zauberlabs.gradle.plugins.shadow

import org.apache.commons.lang.StringUtils;
import org.gradle.api.tasks.*
import org.gradle.api.*


/**
 * Task for obscuring a text
 * @author flbulgarelli
 */
class ShadowTask extends DefaultTask {

  String input

  @TaskAction
  def encrypt() {
    ShadowPlugin.shadow(input)
  }
}
