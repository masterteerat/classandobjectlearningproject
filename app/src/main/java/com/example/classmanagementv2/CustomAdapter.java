package com.example.classmanagementv2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    private static final String TAG = "CustomAdapter";
    private DataProductLine[] localDataSet;
    Context mContext;

    public void upDateDataChange() {
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtDesc;
        private final TextView txtPrice;
        private final ImageView imgProdPic;
        private final ImageButton imgbtnAdd;


        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                    upDateDataChange();
                }
            });
            txtDesc = (TextView) v.findViewById(R.id.txtDesc);
            txtPrice = (TextView) v.findViewById(R.id.txtPrice);
            imgProdPic = (ImageView) v.findViewById(R.id.imgProd);
            imgbtnAdd = (ImageButton) v.findViewById(R.id.btnAdd);
        }

        public TextView getTxtDesc() {
            return txtDesc;
        }
        public TextView getTxtPrice() {
            return txtPrice;
        }
        public ImageView getImgProdPic() {
            return imgProdPic;
        }
        public ImageButton getImgBtnAdd() {return imgbtnAdd;}
    }


    public CustomAdapter(DataProductLine[] dataSet) {
        super();
        this.mContext = GlobalVar.mainActivityContext;
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_itemview, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        viewHolder.getTxtDesc().setText(localDataSet[position].description);
        viewHolder.getTxtPrice().setText("ราคา: " + localDataSet[position].price.toString() + " บาท");
        viewHolder.getImgProdPic().setImageResource(localDataSet[position].imgResId);

    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}

