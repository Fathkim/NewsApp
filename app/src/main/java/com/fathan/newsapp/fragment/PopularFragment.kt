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
import com.fathan.newsapp.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    lateinit var binding: FragmentPopularBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.fathan.newsapp.fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)

        binding.rvPopular.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }
        bindNewsHeadLine(binding.newsHeadline, 1)
        return binding.root
        }
}