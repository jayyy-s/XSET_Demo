package demo.xset.xset_demo.watch;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import demo.xset.xset_demo.R;

public class WatchAdapter extends RecyclerView.Adapter<WatchHolder> {

    private ArrayList<WatchItemCard> watchItemList;
    private Activity context;

    public WatchAdapter(ArrayList<WatchItemCard> shopItemList, Activity context) {
        this.watchItemList = shopItemList;
        this.context = context;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.watch_item;
    }


    @Override
    public WatchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.watch_item, parent,
                false);
        return new WatchHolder(view, context);
    }

    @Override
    public void onBindViewHolder(WatchHolder holder, int position) {
        WatchItemCard currentItem = watchItemList.get(position);

        holder.watchGameImage.setImageResource(currentItem.getGameImageSource());
        holder.watchDate.setText(currentItem.getWatchDate());
        holder.watchTime.setText(currentItem.getWatchTime());
        holder.twitchLinkButton.setImageResource(currentItem.getTwitchImageSource());
        holder.linkUrl = currentItem.getLinkUrl();

        holder.watchDate.setTypeface(ResourcesCompat.getFont(context, R.font.andale));
        holder.watchTime.setTypeface(ResourcesCompat.getFont(context, R.font.andale));
    }

    @Override
    public int getItemCount() {
        return watchItemList.size();
    }
}
