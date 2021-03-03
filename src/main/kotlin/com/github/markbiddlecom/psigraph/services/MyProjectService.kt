package com.github.markbiddlecom.psigraph.services

import com.github.markbiddlecom.psigraph.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
