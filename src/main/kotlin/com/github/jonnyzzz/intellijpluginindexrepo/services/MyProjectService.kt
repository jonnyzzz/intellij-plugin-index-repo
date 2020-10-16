package com.github.jonnyzzz.intellijpluginindexrepo.services

import com.intellij.openapi.project.Project
import com.github.jonnyzzz.intellijpluginindexrepo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
