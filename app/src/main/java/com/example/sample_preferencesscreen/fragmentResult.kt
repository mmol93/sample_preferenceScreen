package com.example.sample_preferencesscreen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceManager
import com.example.sample_preferencesscreen.databinding.FragmentResultBinding

class fragmentResult : Fragment() {
    lateinit var binder : FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)
        return view
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binder = FragmentResultBinding.bind(view)
        val pref = PreferenceManager.getDefaultSharedPreferences(context)
        val data1 = pref.getString("data1", null)
        binder.textView.text = "data1: $data1\n"

        val data2 = pref.getBoolean("data2", false)
        binder.textView.append("data2: $data2\n")

        val data3 = pref.getString("data3", null)
        binder.textView.append("data3: $data3\n")

        val data5 = pref.getStringSet("data5", null)
        for (str in data5!!){
            binder.textView.append("data5: $str\n")
        }
    }
}