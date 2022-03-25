package com.example.test_hilt.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.data.entities.Log
import com.example.test_hilt.R
import com.example.test_hilt.databinding.FragmentFirstBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    private val viewModel: LogViewModel by viewModels()
    private val adapter by lazy { LogsViewAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initEvent()
    }


    private fun initEvent() {
        binding.firstBtn.setOnClickListener {
            Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show()
            viewModel.addLog("Button 1 onClick")
        }

        binding.secondBtn.setOnClickListener {
            binding.recyclerView.visibility = View.VISIBLE
            binding.recyclerView.adapter = adapter
            viewModel.getLog().observe(viewLifecycleOwner, { data ->
                adapter.submitList(data)
            })
        }

        binding.thirdBtn.setOnClickListener {
            viewModel.deleteLog()
        }
    }
}