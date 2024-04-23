package com.example.study_app.ui.theme.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun DeleteDialog(
    isOpen: Boolean,
    title: String,
    bodyText: String,
    onDismissRequest: () -> Unit,
    onConfirmButtonClick: () -> Unit,
){
    //If isOpen -> show alert dialog
    if (isOpen){
        AlertDialog(
            onDismissRequest = onDismissRequest,
            //Dialog box
            title = { Text(text = title) },
            text = { Text(text = bodyText) },

            //Dismiss Button
            dismissButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = "Cancel")

                }
            },
            //Save button
            confirmButton = {
                TextButton(
                    onClick = onConfirmButtonClick,
                ) {
                    Text(text = "Delete")

                }
            }

        )
    }

}