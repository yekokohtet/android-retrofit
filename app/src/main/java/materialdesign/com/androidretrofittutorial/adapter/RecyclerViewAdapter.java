package materialdesign.com.androidretrofittutorial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import materialdesign.com.androidretrofittutorial.R;
import materialdesign.com.androidretrofittutorial.model.User;
import materialdesign.com.androidretrofittutorial.viewholder.RecyclerViewHolder;

/**
 * Created by yekokohtet on 1/10/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

   private List<User> itemList;

    public RecyclerViewAdapter(List<User> itemList) {
        this.itemList = itemList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_xml, null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.hobby.setText(itemList.get(position).getHobby());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
