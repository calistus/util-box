package com.grandilo.ui_util

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.runtime.Composable


@Composable
fun SmoothAlert(title: String, message: String) {

    AlertDialog(
        onDismissRequest = { },
        confirmButton = {
            TextButton(onClick = {})
            { Text(text = "OK") }
        },
        dismissButton = {
            TextButton(onClick = {})
            { Text(text = "Cancel") }
        },
        title = { Text(text = title) },
        text = { Text(text = message) }
    )
}

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun log(message: String, tag: String) {
    Log.d(tag, message)
}