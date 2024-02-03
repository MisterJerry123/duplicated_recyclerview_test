package com.example.duplicated_recyclerview_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.duplicated_recyclerview_test.databinding.ItemList02Binding

class ListAdapter02 (private val data : List<exercise_set_struct>):RecyclerView.Adapter<ListAdapter02.MyView02>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView02 {
    val view = ItemList02Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyView02(view)
        }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyView02, position: Int) {
        holder.bind(position)

    }

    inner class MyView02(private val binding:ItemList02Binding):RecyclerView.ViewHolder(binding.root){
        fun bind (pos:Int){

            //자꾸 오류가 나는 코드??
            binding.setNo.text = data[pos].set.toString()
//            binding.weight.text = data[pos].weight.toString()
//            binding.setnum.text = data[pos].cnt.toString()

//            binding.setNo.setText(data[pos].set.toString())
//            binding.weight.setText(data[pos].weight.toString())
//            binding.setnum.setText(data[pos].cnt.toString())


        }
    }
}