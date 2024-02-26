package pe.edu.idat.apprecyclerviewsimg

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerviewsimg.databinding.ItemAndroidBinding

class AdapterAndroid(private var lstItem: List<String>) : RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {

    inner class ViewHolder(val binding: ItemAndroidBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = lstItem.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNumVersion.text = lstItem[position]
    }
}
