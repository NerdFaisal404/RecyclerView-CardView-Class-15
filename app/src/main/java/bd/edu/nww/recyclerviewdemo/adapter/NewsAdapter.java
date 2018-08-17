package bd.edu.nww.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bd.edu.nww.recyclerviewdemo.R;
import bd.edu.nww.recyclerviewdemo.model.NewsPaperItem;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<NewsPaperItem> newsPaperItemList;
    private Context mContext;

    public NewsAdapter(Context mContext, List<NewsPaperItem> newsPaperItemList) {
        this.mContext = mContext;
        this.newsPaperItemList = newsPaperItemList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_news_row, viewGroup, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        NewsPaperItem newsPaperItem = newsPaperItemList.get(i);
        newsViewHolder.tvNewsPaperTitle.setText(newsPaperItem.getTitle());
    }

    @Override
    public int getItemCount() {
        return newsPaperItemList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView tvNewsPaperTitle, tvNewsPaperSummary;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNewsPaperTitle = itemView.findViewById(R.id.textView_paperTitle);
            tvNewsPaperSummary = itemView.findViewById(R.id.textView_paperSummary);
        }
    }
}
