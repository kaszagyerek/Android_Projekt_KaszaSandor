package ro.sapi.retrofitapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.CustomViewHolder> {

    private List<Todo> dataList;
    private Context context;

    public TodoAdapter(Context context,List<Todo> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView symbol, volume, lastprice , kezdo , alacsony , nagy;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            symbol = mView.findViewById(R.id.symbol);
            volume = mView.findViewById(R.id.volume);
            lastprice = mView.findViewById(R.id.lastprice);
            kezdo = mView.findViewById(R.id.kezdo);
            alacsony = mView.findViewById(R.id.alacsony);
            nagy = mView.findViewById(R.id.nagy);
        }
    }

    @NonNull
    @Override
    public TodoAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.todo_item, parent, false);
        return new TodoAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.CustomViewHolder holder, int position) {
        holder.volume.setText(String.valueOf(dataList.get(position).getSymbol()));
        holder.symbol.setText(dataList.get(position).getVolume());
        holder.lastprice.setText(String.valueOf(dataList.get(position).getLastPrice()));
        holder.kezdo.setText(String.valueOf(dataList.get(position).getOpenPrice()));
        holder.alacsony.setText(String.valueOf(dataList.get(position).getLowPrice()));
        holder.nagy.setText(String.valueOf(dataList.get(position).getHighPrice()));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public String toString() {
        return "TodoAdapter{" +
                "dataList=" + dataList +
                ", context=" + context +
                '}';
    }
}
