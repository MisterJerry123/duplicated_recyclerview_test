package com.example.duplicated_recyclerview_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.duplicated_recyclerview_test.databinding.ItemList01Binding

class ListAdapter01 : RecyclerView.Adapter<ListAdapter01.MyView01>(){

    private val exerciseKey = listOf(
        exercise_title_struct("대흉근 발달, 3대 운동", 1, "test"),
        exercise_title_struct("Title2", 2, "test123")
    )


    private val data = mapOf(
        exerciseKey[0] to listOf(2,1,3,4),
        exerciseKey[1] to listOf("1", "2", "3", "4"),

//        "쿠키" to listOf("쿠키1", "쿠키2", "쿠키3", "쿠키4", "쿠키5"),
//        "강아지" to listOf("강아지1", "강아지2", "강아지3", "강아지4", "강아지5")

    )


    inner class MyView01(private val binding:ItemList01Binding):RecyclerView.ViewHolder(binding.root){
        fun bind(pos:Int){
            binding.title.text = data.keys.elementAt(pos).upper_title.toString()
            binding.exerciseName.text = data.keys.elementAt(pos).exercise_name.toString()
            binding.exerciseNo.text = data.keys.elementAt(pos).no.toString()



            binding.recycler02.apply {

                adapter = ListAdapter02(data.values.elementAt(pos) as List<exercise_set_struct>)


                layoutManager = LinearLayoutManager(binding.recycler02.context,LinearLayoutManager.VERTICAL,false)
                setHasFixedSize(true)


            }

        }
    }







    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView01 {
        val view = ItemList01Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyView01(view)
    }

    override fun onBindViewHolder(holder: ListAdapter01.MyView01, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}