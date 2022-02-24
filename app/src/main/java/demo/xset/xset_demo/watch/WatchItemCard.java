package demo.xset.xset_demo.watch;

import demo.xset.xset_demo.R;

public class WatchItemCard {
    private final int gameImageSource;
    private final String watchDate;
    private final String watchTime;
    private final String linkUrl;
    private final int twitchImageSource;
;
    public WatchItemCard(int gameImageSource, String watchDate, String watchTime, String linkUrl) {
        this.gameImageSource = gameImageSource;
        this.watchDate = watchDate;
        this.watchTime = watchTime;
        this.linkUrl = linkUrl;
        this.twitchImageSource = R.drawable.twitch_icon;
    }

    public int getGameImageSource() {
        return gameImageSource;
    }

    public String getWatchDate() {
        return watchDate;
    }

    public String getWatchTime() {
        return watchTime;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public int getTwitchImageSource() {
        return twitchImageSource;
    }

}
