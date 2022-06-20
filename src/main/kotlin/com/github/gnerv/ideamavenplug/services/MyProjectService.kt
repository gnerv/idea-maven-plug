package com.github.gnerv.ideamavenplug.services

import com.intellij.openapi.project.Project
import com.github.gnerv.ideamavenplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
