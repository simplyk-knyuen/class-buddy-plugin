package com.github.simplykknyuen.classbuddyplugin.services

import com.intellij.openapi.project.Project
import com.github.simplykknyuen.classbuddyplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
