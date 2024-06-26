package com.example.myapplication19;


        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class LanguageRecycleAdapter extends RecyclerView.Adapter<LanguageViewHolder> {

    private List<String> languageList = new ArrayList<>();


    public LanguageRecycleAdapter(List<String> languageList) {
        this.languageList = languageList;

        Log.e("TAG", "LanguageRecycleAdapter " + languageList.size());
    }

    public void setData(List<String> languageList2) {
        this.languageList = languageList2;
    }

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LanguageViewHolder holder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        holder = new LanguageViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, final int position) {
        holder.item_cls_name.setText(String.valueOf(position));
        holder.item_cls_name.setText(languageList.get(position));

    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }


}
