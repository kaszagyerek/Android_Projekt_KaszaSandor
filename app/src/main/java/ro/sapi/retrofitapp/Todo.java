package ro.sapi.retrofitapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Todo {

        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("lastPrice")
        @Expose
        private String lastPrice;
        @SerializedName("openPrice")
        @Expose
        private String openPrice;
        @SerializedName("highPrice")
        @Expose
        private String highPrice;
        @SerializedName("lowPrice")
        @Expose
        private String lowPrice;
        @SerializedName("volume")
        @Expose
        private String volume;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(String openPrice) {
        this.openPrice = openPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "Todo{" +
                "symbol=" + symbol +
                ", lastPrice=" + lastPrice +
                ", openPrice=" + openPrice +
                ", highPrice=" + highPrice +
                ", lowPrice=" + lowPrice +
                ", volume='" + volume + '\'' +
                '}';
    }
}