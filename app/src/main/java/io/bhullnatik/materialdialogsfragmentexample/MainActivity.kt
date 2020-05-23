package io.bhullnatik.materialdialogsfragmentexample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.show_alert_dialog).setOnClickListener {
            showAlertDialog()
        }
        findViewById<View>(R.id.show_dialog_fragment).setOnClickListener {
            showDialogFragment()
        }
    }

    private fun showAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle("Dialog title")
            .setMessage("Dialog message, to explain what the dialog is about.")
            .setNegativeButton("Cancel", null)
            .setPositiveButton("Agree", null)
            .show()
    }

    private fun showDialogFragment() {
        ExampleDialogFragment().show(supportFragmentManager, "exampleDialog")
    }
}