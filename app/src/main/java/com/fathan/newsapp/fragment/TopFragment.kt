package com.fathan.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fathan.newsapp.data.DataNews
import com.fathan.newsapp.adapter.NewsAdapter
import com.fathan.newsapp.bindNewsHeadLine
import com.fathan.newsapp.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    lateinit var binding: FragmentTopBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.fathan.newsapp.fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)

        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }
        bindNewsHeadLine(binding.newsHeadline, 2)
        return binding.root
    }
}