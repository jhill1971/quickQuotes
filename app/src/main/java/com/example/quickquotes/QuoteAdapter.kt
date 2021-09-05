package com.example.quickquotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quickquotes.QuoteAdapter.*


class QuoteAdapter : RecyclerView.Adapter<QuoteViewHolder>() {
    //class QuoteAdapter inherits from class RecyclerView.Adapter

    class QuoteViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        /*
        RecyclerView.ViewHolder essentially is the view for each row.
        To add ViewHolder, inside of QuoteAdapter class, we create a
        custom ViewHolder inner class that inherits from RecyclerView.ViewHolder.

        We have created an inner class QuoteViewHolder in QuoteAdapter.
        An inner class is a class declared inside of a regular class.
        This gives the outer class the advantage of using the properties
        and functions of the inner class by declaring an instance of it.
         */

        private var view: View = v
        var quote: String = " "

        fun bindQuote(quote: String) {
            // Called by QuoteAdapter to bind the quote to the text view.
            this.quote = quote
            view.quoteTexts.text = quote
        }
    }


// Essential functions to help the recycler adapter work.

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QuoteViewHolder {
        // called when the layout for a list item is required
        return QuoteViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item_row, parent, false))

        // LayoutInflater takes XML provided and adds (inflates) it to the parent view.
        // to get it ready to be shown on screen.
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        // Implement onBindViewHolder
        holder.bindQuote("Sample Quote")
    }

    override fun getItemCount(): Int {
        // determines how many things to display
        return 10
    }

}