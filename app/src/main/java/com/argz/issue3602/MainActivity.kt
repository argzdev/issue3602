package com.argz.issue3602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firebaseAnalytics = Firebase.analytics
    }

    fun sendWithId(view: View) {
        firebaseAnalytics.setUserId("this_is_a_random_id")
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
            param("title", "random_title")
            param("description", "random_body")
        }
    }

    fun sendWithNoId(view: View) {
        firebaseAnalytics.setUserId(null)
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
            param("title", "random_title")
            param("description", "random_body")
        }
    }
}