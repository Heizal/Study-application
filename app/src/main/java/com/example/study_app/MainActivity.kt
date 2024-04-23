package com.example.study_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.study_app.domain.model.Session
import com.example.study_app.domain.model.Subject
import com.example.study_app.domain.model.Task
import com.example.study_app.ui.theme.StudyAppTheme
import com.example.study_app.ui.theme.dashboard.DashboardScreen
import com.example.study_app.ui.theme.subject.SubjectScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyAppTheme {
                SubjectScreen()

            }
        }
    }
}


val subjects = listOf(
    Subject(name = "SE_01", goalHours = 10f, colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "PM_11", goalHours = 10f, colors = Subject.subjectCardColors[1], subjectId = 0),
    Subject(name = "SE_04", goalHours = 10f, colors = Subject.subjectCardColors[2], subjectId = 0),
    Subject(name = "ID_07", goalHours = 10f, colors = Subject.subjectCardColors[3],subjectId = 0),
    Subject(name = "STS_03", goalHours = 10f, colors = Subject.subjectCardColors[4],subjectId = 0),
)

val tasks = listOf(
    Task(
        title = "Prepare notes for class",
        description = "",
        dueDate = 0L,
        priority = 0,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Group work session",
        description = "",
        dueDate = 0L,
        priority = 2,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Submit notes for review",
        description = "",
        dueDate = 0L,
        priority = 3,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Go to class",
        description = "",
        dueDate = 0L,
        priority = 4,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    )
)

val sessions = listOf(
    Session(
        relatedToSubject = "Computer Science",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "Product Management",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "Product Design",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "Social morals",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    )
)