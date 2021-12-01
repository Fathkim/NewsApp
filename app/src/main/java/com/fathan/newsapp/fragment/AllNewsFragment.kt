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
import com.fathan.newsapp.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {

    lateinit var binding: FragmentAllNewsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.fathan.newsapp.fragment
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)

        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }
        bindNewsHeadLine(binding.newsHeadline, 0)
        return binding.root
    }
}