package demo.xset.xset_demo.watch;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import demo.xset.xset_demo.R;

public class WatchHolder extends RecyclerView.ViewHolder {

    public ImageView watchGameImage;
    public TextView watchDate;
    public TextView watchTime;
    public String linkUrl;
    public ImageButton twitchLinkButton;

    public WatchHolder(@NonNull View itemView, Activity watchContext) {
        super(itemView);
        this.watchGameImage = itemView.findViewById((R.id.gameImageView));
        this.watchDate = itemView.findViewById(R.id.dateTextView);
        this.watchTime = itemView.findViewById(R.id.timeTextView);
        this.twitchLinkButton = itemView.findViewById(R.id.twitchLinkButton);

        CardView cardView = itemView.findViewById(R.id.watchCard);
        // cardView.setCardElevation(0);

        View twitchButtonView = itemView.findViewById(R.id.twitchLinkButton);
        twitchButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(linkUrl));
                watchContext.startActivity(browserIntent);
            }
        });
    }

}
