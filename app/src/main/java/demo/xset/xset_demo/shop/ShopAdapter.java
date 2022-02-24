package demo.xset.xset_demo.shop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import demo.xset.xset_demo.R;

public class ShopAdapter extends RecyclerView.Adapter<ShopHolder> {

    private ArrayList<ShopItemCard> shopItemList;
    private Activity context;

    public ShopAdapter(ArrayList<ShopItemCard> shopItemList, Activity context) {
        this.shopItemList = shopItemList;
        this.context = context;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.shop_item;
    }


    @Override
    public ShopHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent,
                false);
        return new ShopHolder(view);
    }

    @Override
    public void onBindViewHolder(ShopHolder holder, int position) {
        ShopItemCard currentItem = shopItemList.get(position);

        holder.itemCaption.setText(currentItem.getItemName());
        holder.shopItemImage.setImageResource(currentItem.getImageSource());
        holder.itemPrice.setText(currentItem.getItemPrice());

        holder.itemCaption.setTypeface(ResourcesCompat.getFont(context, R.font.andale));
        holder.itemPrice.setTypeface(ResourcesCompat.getFont(context, R.font.andale));
    }

    @Override
    public int getItemCount() {
        return shopItemList.size();
    }
}
