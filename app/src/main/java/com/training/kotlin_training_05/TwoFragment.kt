package com.training.kotlin_training_05

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.training.kotlin_training_05.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var fragmentTwoBinding: FragmentTwoBinding
    private val TAG = "TWO_FRAGMENT"
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: ")
        
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentTwoBinding.bind(view)
        fragmentTwoBinding = binding
        fragmentTwoBinding.textViewTwoFragment.text = arguments?.getString("name")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

}