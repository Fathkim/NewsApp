package com.fathan.newsapp

import android.content.Intent
import com.fathan.newsapp.data.DataNews
import com.fathan.newsapp.databinding.NewsHeadlineBinding

fun bindNewsHeadLine(binding: NewsHeadlineBinding, position: Int) {
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[position])
        tvTitleHeadline.text = DataNews.titleHeadline[position]
        tvDescHeadline.text = DataNews.contentHeadline[position]
        tvDateHeadline.text = DataNews.dateHeadline[position]
        tvAuthorHeadline.text = DataNews.authorHeadline[position]
    }

    binding.root.setOnClickListener {
        val intentToDateil = Intent(binding.root.context, DetailActivity::class.java)
        intentToDateil.putExtra(DetailActivity.EXTRA_IMG_HEADLINE, DataNews.photoHeadline[position])
        intentToDateil.putExtra(DetailActivity.EXTRA_TITLE_HEADLINE, DataNews.titleHeadline[position])
        intentToDateil.putExtra(DetailActivity.EXTRA_CONTENT_HEADLINE, DataNews.contentHeadline[position])
        intentToDateil.putExtra(DetailActivity.EXTRA_DATE_HEADLINE, DataNews.dateHeadline[position])
        intentToDateil.putExtra(DetailActivity.EXTRA_AUTHOR_HEADLINE, DataNews.authorHeadline[position])

        binding.root.context.startActivity(intentToDateil)
    }

}