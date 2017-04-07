package materialdesign.com.androidretrofittutorial.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import materialdesign.com.androidretrofittutorial.R;

/**
 * Created by yekokohtet on 1/10/17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView name, hobby;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        name = (TextView) itemView.findViewById(R.id.name);
        hobby = (TextView) itemView.findViewById(R.id.hobby);
    }

    @Override
    public void onClick(View view) {

    }
}
