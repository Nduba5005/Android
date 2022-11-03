package com.example.frecx.onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.frecx.R

class ViewPagerAdapter( list: ArrayList<Fragment>,
                        fm: FragmentManager,
                        lifecycle: Lifecycle,
    private val images:List<Int>)
    : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>  ()
    {

    private val fragmentList = list
    inner class ViewPagerViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.image1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false)
        return ViewPagerViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage=images[position]
        holder.imageView.setImageResource(curImage)

    }

    override fun getItemCount(): Int {
        return images.size
        return fragmentList.size

    }
     fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }


}
