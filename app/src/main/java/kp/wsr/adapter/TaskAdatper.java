package kp.wsr.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kp.wsr.entity.MessageEntity;
import kp.wsr.hb_recycleviewtest.R;

/**
 * Created by HeBing on 2017/5/11 09:54
 */

public class TaskAdatper extends RecyclerView.Adapter<TaskAdatper.MyHolder> {

    List<MessageEntity> data ;

    public TaskAdatper(List<MessageEntity> data) {
        this.data = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{


        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
