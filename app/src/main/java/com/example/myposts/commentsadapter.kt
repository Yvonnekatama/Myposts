package com.example.theposts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myposts.R
import com.example.myposts.comments

class commentsAdapter(var commentContent: List<comments>):RecyclerView.Adapter<CommentsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.comments_list_item, parent,false)
        return CommentsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CommentsViewHolder, position: Int) {
        var updatedComment=commentContent[position]
        holder.tvname.text=updatedComment.name
        holder.tvemail.text=updatedComment.email
        holder.tvBody.text=updatedComment.body

    }

    override fun getItemCount(): Int {
        return commentContent.size
    }
}
class CommentsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvBody=itemView.findViewById<TextView>(R.id.tvBody)


}
