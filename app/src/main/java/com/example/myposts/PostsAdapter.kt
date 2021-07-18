
package com.example.theposts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myposts.R
import com.example.myposts.comments
import com.example.myposts.posts

class PostAdapter(var postsList:List<posts>,var context:Context): RecyclerView.Adapter<postViewHolder>() {
    lateinit var cvPost:CardView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.posts_list_item, parent,false)
        return postViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        var currentPosts=postsList[position]
        holder.tvUser.text=currentPosts.userId.toString()
        holder.tvId.text=currentPosts.id.toString()
        holder.tvTitle.text=currentPosts.title
        holder.tvBody.text=currentPosts.body
        holder.cvPost.setOnClickListener {
            var intent=Intent(context, comments::class.java)
            intent.putExtra("post_id",currentPosts.id)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return postsList.size
    }
}
class postViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvUser=itemView.findViewById<TextView>(R.id.tvuser)
    var tvId=itemView.findViewById<TextView>(R.id.tvid)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvtitle)
    var tvBody=itemView.findViewById<TextView>(R.id.tvbody)
    var cvPost=itemView.findViewById<CardView>(R.id.cvposts)
}