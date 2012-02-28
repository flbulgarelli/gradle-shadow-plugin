package com.zauberlabs.gradle.plugins.shadow
import org.sonatype.plexus.components.cipher.DefaultPlexusCipher
import org.sonatype.plexus.components.cipher.PlexusCipher;

import org.gradle.api.*

/**
 * The plugin for shadowing and reveling texts, targetd primary for passwords. 
 * 
 * This plugin does not pretend to provide true, secure encryption, but just to shadow texts
 * 
 * It provides two task types: {@link RevealTask} and {@link ShadowTask}. 
 * It also adds a {@code reveal} message, in order to enable reveling password programatically 
 * within a Gradle script   
 * 
 * Shadowing is provided by a {@link PlexusCipher}
 * 
 * @author flbulgarelli
 */
class ShadowPlugin implements Plugin<Project> {

  def void apply(Project project) {
    project.task('encrypt-password') << {
      println shadow(project.password)
    }
    project.metaClass.reveal = { intput ->  reveal(intput) }
  }

  static shadow(input) {
    new DefaultPlexusCipher().encryptAndDecorate(input, passphrase())
  }

  static reveal(input) {
    new DefaultPlexusCipher().decryptDecorated(input, passphrase())
  }

  static passphrase() {
    "custom passphrase is not supported yet"
  }
}

