package com.dodemy.patientrecords.ui

import android.widget.Button
import android.widget.Toast
import com.dodemy.patientrecords.R

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BottomDestination1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_destination1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the button by its ID
        val exampleButton = view.findViewById<Button>(R.id.button_bottom_destination1)

        // Set a click listener for the button
        exampleButton.setOnClickListener {
            // Execute your desired action when the button is clicked
            Toast.makeText(requireContext(), "Button clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
