package demo.xset.xset_demo.shop;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import demo.xset.xset_demo.R;

public class ShopHolder extends RecyclerView.ViewHolder {

    public ImageView shopItemImage;
    public TextView itemCaption;
    public TextView itemPrice;

    public ShopHolder(@NonNull View itemView) {
        super(itemView);
        this.shopItemImage = itemView.findViewById((R.id.shopItemImageView));
        this.itemCaption = itemView.findViewById(R.id.shopCaptionTextView);
        this.itemPrice = itemView.findViewById(R.id.priceTextView);
        CardView cardView = itemView.findViewById(R.id.watchCard);
        cardView.setCardElevation(0);
    }

}
