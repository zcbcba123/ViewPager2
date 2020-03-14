package com.example.viewpager2

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentStateAdapter(fm:FragmentManager):FragmentStateAdapter(fm){
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )
    override fun getItem(position: Int): Fragment =
        SecondFragment().apply {
            arguments = bundleOf(
                "color" to colors[position],
                "position" to position
            )
        }

    override fun getItemCount(): Int = colors.size

}